package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementWithException {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		try {
			driver.findElement(By.id("input-email11")).sendKeys("Rimjhim@gmail.com");

		} catch (NoSuchElementException e) {
			System.out.println("Element is not present.......");
			e.printStackTrace();
		}

		driver.findElement(By.id("input-password")).sendKeys("09875");

	}

}
