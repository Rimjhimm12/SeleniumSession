package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isElementDisabled {
	static WebDriver driver;

	public static void main(String[] args) {

		// launching the url
		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");

		// Creating By locator for the elements
		By editaion = By.id("payment_plan_id");
		By submitButton = By.id("submitButton");

		// Checking if the element is displayed
		boolean isSubmitButtonDisplayed = driver.findElement(submitButton).isDisplayed();
		System.out.println(isSubmitButtonDisplayed);// true

		boolean isCheckBoxDisplayed = driver.findElement(By.xpath("//input[@type='checkbox' and @name='agreeTerms']"))
				.isDisplayed();
		System.out.println(isCheckBoxDisplayed);// true
		boolean isCheckBoxSelected = driver.findElement(By.xpath("//input[@type='checkbox' and @name='agreeTerms']"))
				.isSelected();
		System.out.println(isCheckBoxSelected);// false

		// Checking if the Element is enabled, if not making it enable
		boolean flag = driver.findElement(submitButton).isEnabled();
		if (flag) {
			System.out.println("Element is enabled");

		} else {
			driver.findElement(By.xpath("//input[@type='checkbox' and @name='agreeTerms']")).click();

		}

		// Using Select() placing value for the drop down filed.

		Select selectItem = new Select(driver.findElement(editaion));
		selectItem.selectByValue("1");

		isCheckBoxSelected = driver.findElement(By.xpath("//input[@type='checkbox' and @name='agreeTerms']"))
				.isSelected();
		System.out.println(isCheckBoxSelected);// true

	}

}
