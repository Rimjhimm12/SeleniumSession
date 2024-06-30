package mytest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;

	@BeforeTest(description = "Launching URL")
	public void lunchURL() {
		driver = new EdgeDriver();
		//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
