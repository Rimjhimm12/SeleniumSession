package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManagerSessionId {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/documentation/");
		String title = driver.getTitle();
		System.out.println("Title of the browser is : " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL is : " + url);
		if (url.equals("https://www.selenium.dev/documentation/")) {
			System.out.println("Url is correct");
		} else
			System.out.println("Incorrect URL");

		driver.close();

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.19.1");

	}

}
