package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	static WebDriver driver;

	public static void main(String[] args) {

		// launching browser
		driver = new ChromeDriver();

		// launching URL
		driver.get("https://www.google.com/");

		// Creating web element
		/**
		 * List<WebElement> language =
		 * driver.findElements(By.xpath("//div[@class='vcVZ7d']//a"));
		 * System.out.println(language.size());// printing the num of the languages
		 * for(WebElement e : language) { String text = e.getText();
		 * //System.out.println(text);
		 * 
		 * if(text.equals("বাংলা")) { e.click(); break; } }
		 **/

		List<WebElement> footer = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']//a[@class='pHiOh']"));
		System.out.println(footer.size());// printing the num of the languages
		for (WebElement e : footer) {
			String text = e.getText();
			System.out.println(text);

		}
		WebElement footer1 = driver.findElement(By.xpath("//div[@class='KxwPGc iTjxkf']//div[@class='CcNe6e']/div"));
		System.out.println(footer1.getText());

	}

}
