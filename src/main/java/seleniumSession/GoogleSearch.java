package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	static WebDriver driver;

	public static void GoogleSearch(By locator) {
		List<WebElement> listOfGoogleSuggation = getElements(locator);
		System.out.println(listOfGoogleSuggation.size());
		for (WebElement e : listOfGoogleSuggation) {
			String suggationList = e.getText();
			// System.out.println(suggationList);

			if (suggationList.equals("naveen automation labs selenium")) {
				e.click();
				break;
			}
		}
	}

	public static void GoogleSearchResult(By locator, String comparedValue) {
		List<WebElement> searchList = getElements(locator);
		System.out.println(searchList.size());
		for (WebElement e : searchList) {
			String text = e.getText();
			// System.out.println(text);

			if (text.contains(comparedValue) == true) {
				e.click();
				break;
			}
		}
	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");

		// manually pausing the script
		Thread.sleep(3000);//

		By search = By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span");
		GoogleSearch(search);

		/**
		 * List<WebElement> listOfGoogleSuggation =
		 * driver.findElements(By.xpath("//ul[@class='G43f7e']//div[@class='wM6W7d']/span"));
		 * System.out.println(listOfGoogleSuggation.size()); for(WebElement e:
		 * listOfGoogleSuggation) { String suggationList = e.getText();
		 * //System.out.println(suggationList);
		 * 
		 * if(suggationList.equals("naveen automation labs selenium")) { e.click();
		 * break; } }
		 **/

		driver.findElement(By.xpath("//div[@id='taw']//a")).click();

		By searchResult = By.xpath("//table[@class='jmjoTe']//div[@class='VttTV']//a[@class='l']");
		GoogleSearchResult(searchResult, "Selenium & Java Training");

		/**
		 * List<WebElement> searchList =
		 * driver.findElements(By.xpath("//table[@class='jmjoTe']//div[@class='VttTV']//a[@class='l']"));
		 * System.out.println(searchList.size()); for(WebElement e: searchList) { String
		 * text = e.getText(); //System.out.println(text);
		 * 
		 * if(text.contains("Selenium & Java Training")== true) { e.click();
		 * 
		 * break; } }
		 */

		String str = driver.getCurrentUrl();
		System.out.println(str);
		driver.navigate().back();
		GoogleSearchResult(searchResult, "Selenium & Java Training");
		Thread.sleep(3000);
		driver.navigate().refresh();

	}

}
