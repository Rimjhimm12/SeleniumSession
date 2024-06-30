package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// if htmltag == select tag, we will use selenium Select tag

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By numOfEmployee = By.id("Form_getForm_NoOfEmployees");
		By country_WSC = By.xpath("//select[@id='Form_getForm_Country']/option");
//		Select select_noe = new Select(driver.findElement(numOfEmployee));
//		select_noe.selectByVisibleText("26 - 50");

		List<WebElement> list = driver.findElements(country_WSC);
		System.out.println(list.size());

		for (WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
		}

//		selectCountry(country, "India");
//		selectCountry(numOfEmployee, "26 - 50");
//		
//		System.out.println("Total_num_of_country"+getDDOptionCount(country));
//		System.out.println("Total number of employees"+getDDOptionCount(numOfEmployee));
//		
//		System.out.println(getAllCountries(country));
//		System.out.println(getAllCountries(numOfEmployee));

	}

	public static void selectCountry(By locator, String country) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(country);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getDDOptionCount(By locator) {
		Select select = new Select(getElement(locator));

		return select.getOptions().size();
	}

	public static List<String> getAllCountries(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> ListOfDDoptions = select.getOptions();
		List<String> list = new ArrayList<String>();
		for (WebElement e : ListOfDDoptions) {
			String text = e.getText();
			System.out.println(text);
			list.add(text);

		}
		return list;
	}

	public static void getAllCountrieswithoutSelectClass(By locator) {

	}

}
