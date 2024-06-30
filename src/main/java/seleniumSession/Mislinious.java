package seleniumSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mislinious {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		By country = By.xpath("(//li[@class='dropdown']/a[@class='dropdown-toggle'])[2]");
//		Select select_country = new Select(driver.findElement(country));
//		 select_country.selectByIndex(5);
//		 driver.navigate().refresh();
//		 Select select_country1 = new Select(driver.findElement(country));
//		 select_country1.selectByIndex(10);
		 
		 Actions act =new Actions(driver);
		 act.clickAndHold(driver.findElement(country)).perform();
		
		
		

	}

}
