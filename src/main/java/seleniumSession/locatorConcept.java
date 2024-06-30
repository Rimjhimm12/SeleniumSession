package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		// 1.By.Id;
		driver.findElement(By.id("input-email")).sendKeys("Rimjhim");
		// 2.By.name
		driver.findElement(By.cssSelector("#input-password")).sendKeys("Mallick");
		// 3.By.Class
		// driver.findElement(By.className("form-control")).sendKeys("rimjhimmallick6@gmail.com");
		// 4. Xpath
		// driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		// 5.By.CSSSelector
		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		// 6. By.linkText
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.linkText("Login")).click();
//		//7.by.partialLinkText
//		driver.findElement(By.partialLinkText("Delivery")).click();
		// 8.By.
		String str = driver.findElement(By.tagName("h2")).getText();
		System.out.println(str);

		String str1 = driver.findElement(By.tagName("footer")).getText();
		System.out.println(str1);

		/***
		 * 
		 * Navigation check
		 * 
		 * 1. go to url 2.back 3.forward 4.refresh
		 */

	}

}