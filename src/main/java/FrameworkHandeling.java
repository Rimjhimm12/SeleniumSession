import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameworkHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/");
		// driver.switchTo().frame("main");
		// driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.name("main")));

		String str = driver.findElement(By.tagName("h2")).getText();
		System.out.println(str);

		driver.switchTo().defaultContent();// it helps to get out from the frame

		Thread.sleep(5000);
		driver.quit();

	}

}
