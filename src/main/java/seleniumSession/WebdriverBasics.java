package seleniumSession;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// WebDriver driver = new EdgeDriver();
		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println("Title is: " + title);

		if (title.equals(
				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
			System.out.println("Title is correct");
			String url = driver.getCurrentUrl();
			System.out.println("url is: " + url);
		} else
			System.out.println("Title is not correct");

		// driver.close();
		driver.quit();

	}

}
