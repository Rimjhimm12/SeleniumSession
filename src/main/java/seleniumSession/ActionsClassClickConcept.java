package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email_ID = By.id("input-email");

		Actions act = new Actions(driver);
		act.sendKeys(driver.findElement(email_ID), "rimjhim.mallick6@gmail.com").perform();

		driver.navigate().refresh();

		act.click(driver.findElement(By.xpath("//input[@type ='submit']"))).perform();
		act.click(driver.findElement(By.linkText("Forgotten Password"))).perform();

	}

}
