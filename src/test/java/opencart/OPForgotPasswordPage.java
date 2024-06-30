package opencart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OPForgotPasswordPage extends OPBestClass {
	@Test
	public void OpenCartForgetPassword() {
		
		driver.findElement(By.linkText("Back")).click();
		Assert.assertEquals(driver.getTitle(), "Account Login");
		
	}
	

}
