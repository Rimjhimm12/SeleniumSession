package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementWaitingTime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		ElementUtil util = new ElementUtil(driver);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By emil_id = By.id("input-email1");
		By password = By.id("input-password");

		// util.doSendKeys(emil_id, 10, "rimjhim");
		util.doSendKeys(password, "rimjhim");

	}

}
