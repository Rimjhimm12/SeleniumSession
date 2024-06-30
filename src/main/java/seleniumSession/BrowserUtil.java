package seleniumSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;// webdriver reference variable
	private Properties prop;

	/*
	 * 
	 * fetching browser and URL from the properties file;
	 */

	public Properties initialiseProp() {
		try {
			FileInputStream path = new FileInputStream("./src/main/java/config/config.properties");
			prop = new Properties();
			prop.load(path);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

	/**
	 * 
	 * Launching web browsers
	 * 
	 * @return
	 */

	public WebDriver launchBrowser(String browserName) {

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Please enter the correct browser name...." + browserName);
			throw new ThrowBrowserException("INVALID BROWSER......" + browserName);

		}

		return driver;

	}

	/**
	 * 
	 * Checking valid URL
	 * 
	 * 
	 */

	public void browserURL(String url) {

		if (url == null) {
			System.out.println("URL can not be null");
			throw new ThrowBrowserException("INVALID URL......Please enter valid URL: " + url);

		}

		if (url.isEmpty() || url.isBlank()) {
			System.out.println("URL can not be blank or empty");
			throw new ThrowBrowserException("INVALID URL......Please enter valid URL: " + url);
		}
		if (url.contains("https") == false) {
			System.out.println("URL must start with https");
			throw new ThrowBrowserException("INVALID URL......Please enter valid URL: " + url);
		} else
			driver.get(url);

	}

	/*
	 * 
	 * Validating browser title;
	 **/

	public void browserTitle() {

		String title = driver.getTitle();
		System.out.println("Browser title is : " + title);

	}

	public void version(String version) {

		if (version.equals("4.19.2")) {
			System.out.println("Selenium Java bindings library version:" + version);
		} else
			throw new ThrowBrowserException("VERSION NOT FOUND.......");

	}

	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void getClose() {

		driver.close();
	}

}
