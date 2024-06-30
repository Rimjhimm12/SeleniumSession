package opencart;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import seleniumSession.ThrowBrowserException;

public class OPBestClass {
	
	WebDriver driver;
	@Parameters({"browser", "url"})
	@BeforeTest(description = "launching the browser........")
	public void openCartlaunch(String browserName, String url) {
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			

		default:
			System.out.println("Enter correct browser name ...............");
			throw new ThrowBrowserException("Invalid Browser >>>>>>>>>>>>>>>>>>>> "+browserName);
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterTest(description = "Closing the browser........")
	public void tearDown() {
		driver.quit();
	}

}
