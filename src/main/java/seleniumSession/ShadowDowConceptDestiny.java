package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShadowDowConceptDestiny {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(000);
		// browser -> page -> shadowDom -> iframe -> element

		JavascriptExecutor Js = (JavascriptExecutor) driver;
		String jsPath = "return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#pact1\")";
		WebElement ele = (WebElement) Js.executeScript(jsPath);
		driver.switchTo().frame(ele);

		String jsDestiny = "return document.querySelector(\"#glaf\")";
		WebElement destinyEle = (WebElement) Js.executeScript(jsDestiny);
		destinyEle.sendKeys("India");

		By click = By.id("close");
		driver.findElement(click).click();

	}

}
