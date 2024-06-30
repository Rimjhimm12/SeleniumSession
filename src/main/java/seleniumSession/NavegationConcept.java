package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavegationConcept {

	public static void main(String[] args) {
		/****
		 * go to url back forward refresh 626604@rimi
		 ****/

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to(
				"https://www.google.com/search?q=amazon+login&sca_esv=779b01740ca52ec5&source=hp&ei=Yk8qZtPyDeOm2roP6Zqa6A0&iflsig=ANes7DEAAAAAZipdcgR0aaVJaXcLeLBvGrHNFUjfhntx&ved=0ahUKEwjTq7LOsd2FAxVjk1YBHWmNBt0Q4dUDCA0&uact=5&oq=amazon+login&gs_lp=Egdnd3Mtd2l6IgxhbWF6b24gbG9naW4yCBAAGIAEGLEDMgsQABiABBixAxiDATIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyCBAAGIAEGLEDSN2wBlAAWEdwAngAkAECmAHaAaABkAaqAQUwLjIuMrgBA8gBAPgBAZgCBKACigOYAwCSBwUyLjEuMaAHwRQ&sclient=gws-wiz");
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());

	}

}
