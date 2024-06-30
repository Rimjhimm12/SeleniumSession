package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElementConcept {
	static WebDriver driver;

	public static WebElement getFindElement(By locator) {
		return driver.findElement(locator);
	}

	public static void getSendKeys(By locator, String value) {
		getFindElement(locator).sendKeys(value);

	}

	public static void main(String[] args) {
		// web element concept
		// Whatever we can see in the web page is called web element
		// chrome dev-tool: web can see mamy teps --->we can navigate there through the
		// inspect
		// Create a webelement + perform the action (click, sendkeys, getText,
		// isDisplayed...etc)

		// Create web element

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// perform the action
		// Approach 1:
		/**
		 * driver.findElement(By.id("input-email")).sendKeys("Rimjhimmallick6@gmail.com");
		 * driver.findElement(By.id("input-password")).sendKeys("rimjhim@123");
		 */

		// Approach 2:
		/**
		 * -- WebElement emailID = driver.findElement(By.id("input-email")); WebElement
		 * password = driver.findElement(By.id("input-password"));
		 * 
		 * emailID.sendKeys("Rimjhimmallick6@gmail.com");
		 * password.sendKeys("rimjhim@123");
		 */

		// Approach 3:By locator
		/**
		 * By emailID = By.id("input-email"); By password = By.id("input-password");
		 * 
		 * WebElement email_element= driver.findElement(emailID); WebElement
		 * password_element = driver.findElement(password);
		 * 
		 * //perform action: email_element.sendKeys("Rimjhimmallick6@gmail.com");
		 * password_element.sendKeys("rimjhim@123");
		 */

		// Approach 4: by locator + Genaric function for weblocator

//		By emailID = By.id("input-email");
//		By password = By.id("input-password");
//		getFindElement(emailID).sendKeys("Rimjhimmallick6@gmail.com");
//		getFindElement(password).sendKeys("rimjhim@123");

		// Approach 5: by locator + Genaric function for webelement and sendkeys

//		By email_id = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getSendKeys(email_id, "RimjhimMallick6@gmail.com");
//		getSendKeys(password, "Rimjhim@1235");
//		
		// Approach 6: by locator + Genaric function for webelement and sendkeys:
		// ElementUtil class

		By email_id = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(email_id, "Rimjhimmallick6@gmail");
		eleutil.doSendKeys(password, "Rim@1234");

	}

}
