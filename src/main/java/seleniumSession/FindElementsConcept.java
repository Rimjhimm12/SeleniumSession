package seleniumSession;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		List<WebElement> Linklist = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:" + Linklist.size());

		List<String> eleTextlist = new ArrayList<String>();

		for (int i = 0; i < Linklist.size(); i++) {
			String totalTextCount = Linklist.get(i).getText();
			// System.out.println(totalTextCount);

			if (totalTextCount.length() != 0) {
				eleTextlist.add(totalTextCount);

			}
		}
		System.out.println(eleTextlist);
		System.out.println(eleTextlist.size());

	}

}
