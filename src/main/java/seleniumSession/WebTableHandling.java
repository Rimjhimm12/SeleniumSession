package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	static WebDriver driver;

	public static void doSelectUserName(String username) {
		driver.findElement(By.xpath("//a[text()='" + username + "']/parent::td/ancestor::tr//input[@type='checkbox']"))
				.click();
	}

	public static List<String> getUserData(String username) {
		List<WebElement> userData = driver
				.findElements(By.xpath("//a[text()='" + username + "']/parent::td/following-sibling::td"));
		List<String> arrUserData = new ArrayList<String>();
		for (WebElement e : userData) {
			String test = e.getText();
			arrUserData.add(test);
		}

		return arrUserData;

	}

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");

		// driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		// driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/ancestor::tr//input[@type='checkbox']")).click();
		doSelectUserName("Garry.White");
		doSelectUserName("Joe.Root");
		System.out.println(getUserData("Joe.Root"));
		Thread.sleep(5000);
		driver.quit();

	}

}
