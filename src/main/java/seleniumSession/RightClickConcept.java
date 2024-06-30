package seleniumSession;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		// Right Click ---> is a;so called context click.
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		By rightClick = By.xpath("//span[text()='right click me']");
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(rightClick)).perform();
		List<WebElement> clickableItems = driver.findElements(By.xpath("//ul//span"));
		int numClickableItems = clickableItems.size();
		System.out.println(numClickableItems);
//		for (WebElement e : clickableItems) {
//			String text = e.getText();
//			System.out.println(text);
//			
//		}

		for (WebElement e : clickableItems) {
			if (e.getText().equals("Edit")) {
				e.click();
				break;
			}

		}
		Thread.sleep(5000);

		Alert alart = driver.switchTo().alert();
		alart.accept();

	}

}
