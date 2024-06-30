package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActionsClass {

	public static void main(String[] args) throws InterruptedException {

		// Action is an interface.
		// Actions is a class.
		// build() return Action

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		Thread.sleep(10000);
		By email_id = By.xpath("//input[@id='input-email']");
		Actions act = new Actions(driver);
		// act.sendKeys(driver.findElement(email_id),"Testing").perform();
		Action action = act.sendKeys(driver.findElement(email_id), "Testing").build();
		action.perform();

	}

}
