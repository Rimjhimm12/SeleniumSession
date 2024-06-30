package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartLoginPage extends BaseTest {

	@Test(description = "checking login page title...", priority = 1)
	public void loginPageTitleTest() {
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertEquals(title, "Account Login", "====title is not matched====");
	}

	@Test(description = "checking login page url...",priority = 2)
	public void loginPageURLTest() {
		
		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("route=account/login"), "====url is not matched===");
	}

	@Test(description = "checking logo is present on the page...", priority = 3)
	public void loginPageLogoTest() {
		
		boolean flag = driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		Assert.assertTrue(flag,"===logo is missing===");
	}

}
