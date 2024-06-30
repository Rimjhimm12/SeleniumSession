package seleniumSession;

import java.sql.Array;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		// List<WebElement> linkList = driver.findElements(By.tagName("a"));
		By links = By.tagName("a");
		By image = By.tagName("img");
		countsLinks(links);
		imaAttribute(image, "src");
		imaAttribute(image, "alt");
		imaAttribute(image, "style");

	}

	public static List<WebElement> getElement(By locator) {
		return driver.findElements(locator);
	}

	public static void countsLinks(By locator) {
		List<WebElement> linkList = getElement(locator);
		List<String> makelist = new ArrayList<String>();
		System.out.println("total links = " + linkList.size());
		for (int i = 0; i < linkList.size(); i++) {
			String text = linkList.get(i).getText();
			if (text.isBlank() != true) {
				System.out.println(text);
				makelist.add(text);
			}

		}
		System.out.println("Total number of links having text : " + makelist.size());
		int nonTextLinks = linkList.size() - makelist.size();
		System.out.println("Total number of links having no text: " + nonTextLinks);
	}

	public static void imaAttribute(By locator, String attribute) {
		List<WebElement> imageList = getElement(locator);
		for (WebElement e : imageList) {
			String srcLinks = e.getAttribute(attribute);
			if (imageList != null && imageList.isEmpty() != true)
				System.out.println(srcLinks);

		}

	}

}
