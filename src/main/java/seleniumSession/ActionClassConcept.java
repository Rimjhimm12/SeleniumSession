package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		// driver.get("http://mrbool.com/search/?txtsearch=&o=rec");
		driver.get("https://www.spicejet.com/");
		Thread.sleep(12000);
		/**
		 * Without method
		 * 
		 * Actions act = new Actions(driver);
		 * act.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).perform();
		 * //act.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();
		 * we can use this for multiple actions
		 * 
		 * Thread.sleep(3000); driver.findElement(By.linkText("COURSES")).click();
		 */

		// By contentMenu = By.xpath("//a[@class='menulink']");
		// By courseLink = By.linkText("COURSES");
		By contentMenu = By.xpath("//div[text()='Add-ons']");
		By courseLink = By.xpath("//div[text()='You1st']");

		handleParentSubMenu(contentMenu, courseLink);

	}

	public static void handleParentSubMenu(By parentMenu, By childMenu) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(parentMenu)).perform();
		// act.moveToElement(driver.findElement(By.xpath("//a[@class='menulink']"))).build().perform();
		// we can use this for multiple actions
		System.out.println("uuu");

		Thread.sleep(13000);
		driver.findElement(childMenu).click();

	}

}
