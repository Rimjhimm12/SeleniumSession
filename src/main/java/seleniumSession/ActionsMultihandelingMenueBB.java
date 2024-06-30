package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMultihandelingMenueBB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		By level1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[last()]");
		By level2 = By.xpath("(//a[text()='Beverages'])[2]");
		By level3 = By.linkText("Tea");
		By level4 = By.linkText("Green Tea");

		driver.findElement(level1).click();
		Thread.sleep(10000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(level2)).perform();
		Thread.sleep(1000);

		act.moveToElement(driver.findElement(level3)).perform();
		Thread.sleep(1000);

		driver.findElement(level4).click();

	}

}
