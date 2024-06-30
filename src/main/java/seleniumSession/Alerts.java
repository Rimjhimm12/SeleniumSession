package seleniumSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		By isJSAlertsDisplayed = By.xpath("//button[text()='Click for JS Alert']");
		driver.findElement(isJSAlertsDisplayed).click();

		Alert alert = driver.switchTo().alert();
		String str = alert.getText();
		System.out.println(str);

		// alert.accept();
		alert.dismiss();

		By isJSPromptDisplayed = By.xpath("//button[text()='Click for JS Prompt']");
		driver.findElement(isJSPromptDisplayed).click();

		Alert alerts = driver.switchTo().alert();
		String str1 = alert.getText();
		System.out.println(str1);

		// alert.accept();
		alerts.sendKeys("hi");
		alert.accept();

	}

}
