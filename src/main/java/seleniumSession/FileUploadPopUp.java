package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");

		// Note*** : File type == file; make sure always file type will be 'file';
		// if type !=file then below code will not work.
		// below code is applicable for the windows/mac/linux mechine
		driver.findElement(By.name("upfile")).sendKeys("F:\\Wallpapers\\99717.jpg");

		/*****
		 * 
		 * *AutoIT--tool: is not compatible with the linux and windows Sikuli--lib: is
		 * also not recommended for the linux Robot--- class: does not support Windows *
		 * These days every framework has to run in the headless mode, in the AWS env,
		 * pipeline etc, in that case these above solution do not support the linux env,
		 * Hence we avoid to use these solution and recommended solution is SendKeys()
		 * method---- which support Windows/MAC/linux all 3.
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
