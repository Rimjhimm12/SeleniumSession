import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		EdgeOptions options = new EdgeOptions();
		options.addArguments("--cgh");
		WebDriver driver = new EdgeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getCurrentUrl());

	}

}
