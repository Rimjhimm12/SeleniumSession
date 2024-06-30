package seleniumSession;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static boolean isElementDisplayed(By locator) {
		try {
			boolean flag = getElement(locator).isDisplayed();
			return flag;

		} catch (NoSuchElementException e) {
			System.out.println("Element is not found/invalid");
			// System.out.println(e.getMessage());
			return false;
		}

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public static boolean doElementDisplayed(By locator) {
		int numberOfElementFound = getElements(locator).size();
		if (numberOfElementFound == 1) {
			System.out.println("Single element is found: " + locator);
			return true;
		} else {
			System.out.println("Multiple or zero element is found");
			return false;
		}
	}

	public static boolean doElementDisplayed(By locator, int expectedElementCounts) {// Method overloading
		int numberOfElementFound = getElements(locator).size();
		if (numberOfElementFound == expectedElementCounts) {
			System.out.println(" Element(s) is/are found: " + locator);
			return true;
		} else {
			System.out.println("Multiple or zero element is found");
			return false;
		}
	}

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		/****
		 * boolean flag = driver.findElement(By.id("input-email")).isDisplayed();
		 * System.out.println(flag);
		 ***/

		By emailId = By.id("input-email");
		By forgotten_Password = By.xpath("//a[text()=\"Forgotten Password\"]");

		if (isElementDisplayed(emailId)) {
			System.out.println("PASS");
		} else
			System.out.println("fALSE");

		int size = getElements(emailId).size();
		System.out.println(size);

		doElementDisplayed(emailId);
		doElementDisplayed(forgotten_Password, 2);

	}

}
