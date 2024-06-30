package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConceptt {

	public static void main(String[] args) throws InterruptedException {
		// JavaScriptExecutor -- Interface -- executeScript();
		// RWD ---> JavaScriptExecutor
		// RWD --> WebDriver

		// to execute the JS on the browser -- JS

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/search?q=cool&sca_esv=942fd3e35b187869&source=hp&ei=ZL1LZrmyO96TseMP96uDoA4&iflsig=AL9hbdgAAAAAZkvLdKCV-wORLBSsYXmu-eJgMFe2O-k3&ved=0ahUKEwi59LeVk52GAxXeSWwGHffVAOQQ4dUDCA0&uact=5&oq=cool&gs_lp=Egdnd3Mtd2l6IgRjb29sMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyCBAAGIAEGLEDMgsQABiABBixAxiDATILEAAYgAQYsQMYgwEyBRAAGIAEMgsQLhiABBixAxiDATIIEAAYgAQYsQMyCxAAGIAEGLEDGIMBMgUQABiABEiymyBQF1gncAJ4AJABAZgBjAGgAfMDqgEDMC40uAEDyAEA-AEBmAIFoAL4AqgCCsICEBAAGAMY5QIY6gIYjAMYjwHCAhAQLhgDGOUCGOoCGIwDGI8BwgIREC4YgAQYsQMY0QMYgwEYxwHCAg4QLhiABBixAxiDARiKBcICCBAuGIAEGLEDwgIOEAAYgAQYsQMYgwEYigWYAweSBwMyLjOgB80j&sclient=gws-wiz");
		Thread.sleep(3000);

//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);

		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
//		String title = jsUtil.getTitleByJs();
//		System.out.println(title);
//		String url = jsUtil.getURLByJs();
//		System.out.println(url);
//		
//		jsUtil.generateJSAlert("landed on login page");

//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		
//		System.out.println(pageText.contains("Deal Pipeline"));

		// jsUtil.scrollPageDown();

		WebElement ele = driver.findElement(By.xpath("//div[@id='search']//h3[text()='COOL Definition & Meaning']"));
		jsUtil.scrollIntoView(ele);

//		WebElement loginForm = driver.findElement(By.id("hs-login"));
////		jsUtil.drawBorder(loginForm);
//		
//		jsUtil.flash(loginForm);
//
////		
//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//
////		jsUtil.drawBorder(emailId);
//
//		jsUtil.flash(emailId);
//		emailId.sendKeys("naveen@gmail.com");
//		
//		jsUtil.flash(password);
//		password.sendKeys("naveen@123");
//
//		
//		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
//		jsUtil.clickElementByJS(loginBtn);
//		
//		//jsUtil.scrollIntoView(ele);
//		
//		
//		//shadowDOM
//		//Psudeo element

	}

}
