package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandel {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		// Basic Authentication
		// In basic Auth we should keep the password so simple, we should avoid using @
		// in the password. Otherwise compiler will be confused with the domain name
		// after @.
		/*** driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); */

		// we can write this in different way:

		String username = "admin";
		String password = "admin";

		driver.get("https://" + username + ":" + password + "@the-internet.herokuapp.com/basic_auth");

	}

}
