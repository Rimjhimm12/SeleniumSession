package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethodChaning {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		WebElement firstName = driver.findElement(By.id("input-firstname"));

		Actions act = new Actions(driver);

		act.sendKeys(firstName, "Amit").sendKeys(Keys.TAB).pause(500).sendKeys("Sharma").sendKeys(Keys.TAB).pause(500)
				.sendKeys("amitselcy@gmail.com").sendKeys(Keys.TAB).pause(500).sendKeys("98989898989")
				.sendKeys(Keys.TAB).pause(500).sendKeys("amit@123").sendKeys(Keys.TAB).pause(500).sendKeys("amit@123")
				.pause(500).sendKeys(Keys.TAB).pause(500).sendKeys(Keys.TAB).pause(500).sendKeys(Keys.TAB).pause(500)
				.sendKeys(Keys.SPACE).pause(500).sendKeys(Keys.TAB).pause(500).sendKeys(Keys.ENTER)

				.build().perform();

	}

}