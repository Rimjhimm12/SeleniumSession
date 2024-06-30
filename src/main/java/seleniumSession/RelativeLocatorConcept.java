package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		/**
		 * above | | //left<-------WebElement -------> right | | near below
		 * 
		 * 
		 * 
		 * it is added in selenium 4; before that it was not there Reletives locator
		 * usefull for the web table handaling. fir check box and redio buttons
		 * 
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/india");
		Thread.sleep(9000);
		WebElement centerWebElement = driver.findElement(By.linkText("Asansol, India"));

		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(centerWebElement)).getText();
		System.out.println(leftRank);
		String rightRank = driver.findElement(with(By.tagName("p")).toRightOf(centerWebElement)).getText();
		System.out.println(rightRank);
		String text = driver.findElement(with(By.tagName("p")).below(centerWebElement)).getText();
		System.out.println(text);
		String text1 = driver.findElement(with(By.tagName("p")).above(centerWebElement)).getText();
		System.out.println(text1);
		String text2 = driver.findElement(with(By.tagName("p")).near(centerWebElement)).getText();
		System.out.println(text2);

	}

}
