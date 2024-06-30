package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	public static void main(String[] args) {
		// Drag and drop is allowed between WebElement to webElement

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		WebElement sourceEle = driver.findElement(By.id("draggable"));
		WebElement targetEle = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
//		act.clickAndHold(sourceEle)
//			.moveToElement(targetEle)
//				.release().build().perform();

		act.dragAndDrop(sourceEle, targetEle).perform(); // This is the one of the method which helps to drag and drop
															// feature.

	}

}
