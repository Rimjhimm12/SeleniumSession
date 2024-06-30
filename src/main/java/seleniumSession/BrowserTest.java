package seleniumSession;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// String browserName = "chrome";

		BrowserUtil obj = new BrowserUtil();
		Properties property = obj.initialiseProp();
		WebDriver driver = obj.launchBrowser(property.getProperty("browser"));
		obj.browserURL(property.getProperty("url"));
		obj.version(property.getProperty("version"));
		obj.browserTitle();

		By email_ID = By.id("input-email");
		By password = By.id("input-password");

		ElementUtil elementUtil = new ElementUtil(driver);

		elementUtil.doSendKeys(email_ID, property.getProperty("UserName"));
		// elementUtil.doSendKeys(password, null);

		System.out.println(obj.getCurrentURL());
		// obj.getClose();

	}
}
