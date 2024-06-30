package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendkeysPause {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		Actions act = new Actions(driver);
//		String searchKey = "macbook";
//		char ch[] = searchKey.toCharArray();
//		for (char e : ch) {
//			
//			act.sendKeys(driver.findElement(By.cssSelector("input.form-control.input-lg")),String.valueOf(e)).pause(5000).perform();
//			
//		}

		// charactersequence is an Interface and it has 3 class String, StringBuffer and
		// aStraingBuilder
		By keyWordSearch = By.cssSelector("input.form-control.input-lg");
		doPauseActionSendKey("Macbook", keyWordSearch, 2000);

	}

	/**
	 * 
	 * @param searchKey
	 * @param locator
	 * @param pauseTime
	 */

	public static void doPauseActionSendKey(String searchKey, By locator, long pauseTime) {
		Actions act = new Actions(driver);
		char ch[] = searchKey.toCharArray();
		for (char e : ch) {

			act.sendKeys(driver.findElement(locator), String.valueOf(e)).pause(pauseTime).perform();

		}
	}

	/**
	 * for default pause time
	 * 
	 * @param searchKey
	 * @param locator
	 */

	public static void doPauseActionSendKey(String searchKey, By locator) {
		Actions act = new Actions(driver);
		char ch[] = searchKey.toCharArray();
		for (char e : ch) {

			act.sendKeys(driver.findElement(locator), String.valueOf(e)).pause(500).perform();

		}

		act.click(driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"))).perform();

	}

}
