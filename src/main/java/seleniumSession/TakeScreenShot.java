package seleniumSession;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	
	//((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
	File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Files.copy(file, new File("D:\\Games\\SS\\google.png"));
}
	


	

}
