package seleniumSession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowsWithMultipleTabshandaling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> handleslist = new ArrayList<String>(handles);
		String patrentWindiow = handleslist.get(0);
		System.out.println(patrentWindiow);
		String linkdinId = handleslist.get(1);
		System.out.println(linkdinId);
		driver.switchTo().window(linkdinId);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(patrentWindiow);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(linkdinId);
		System.out.println(driver.getTitle());
		driver.quit();

//		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//		

	}

}
