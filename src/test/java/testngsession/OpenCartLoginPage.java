package testngsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLoginPage {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = driver.getTitle();
		// System.out.println("Title of the current page is "+title);
		Assert.assertEquals(title, "Account Login");
	}

	@Test(expectedExceptions = { NullPointerException.class,
			ArithmeticException.class }, dependsOnMethods = "loginPageTitleTest", invocationCount = 10, description = "testing login page")
	public void loginPageLogoTest() {
		By logo = By.cssSelector("img.img-responsive");
		boolean flag = driver.findElement(logo).isDisplayed();
		Assert.assertTrue(flag);
		int i = 9 / 0;
		System.out.println(i);
		String j = null;
		System.out.println(j);

	}

	@Test(priority = 1)
	public void loginPageUrlTest() {
		String url = driver.getCurrentUrl();
		// System.out.println("URl is "+url);

		boolean flag = url.contains("account/login");

		Assert.assertTrue(flag, "=====Url is not correct======");
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
