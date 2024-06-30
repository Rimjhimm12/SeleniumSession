package opencart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OpenCartRegistationPage extends OPBestClass {
	
	public static String getRandomEmailId() {
		String emailId = "opencart"+System.currentTimeMillis()+"@gmail.com";
		return emailId;
	}
	
	@DataProvider
	public Object[][] getRegistorData() {
		return new Object[][] {
			{"Kiki","Rosy","8765123498","kiki@123"}
				/*,
				 * {"Jack","Thomash","Jack1062@gmail.com","8763434980","Jack@123"},
				 * {"Jcobe","Chang","Jcobe1062@gmail.com","8700349980","Jcobe@123"},
				 */
			
		};
		
	}
	
	@Test(dataProvider = "getRegistorData")
	public void registationFormTest(String firstname,String lastName,String telephone, String password) {
	
			
			driver.findElement(By.id("input-firstname")).sendKeys(firstname);
			driver.findElement(By.id("input-lastname")).sendKeys(lastName);
			driver.findElement(By.id("input-email")).sendKeys(getRandomEmailId());
			driver.findElement(By.id("input-telephone")).sendKeys(telephone);
			driver.findElement(By.id("input-password")).sendKeys(password);
			driver.findElement(By.id("input-confirm")).sendKeys(password);

			driver.findElement(By.name("agree")).click();
			driver.findElement(By.xpath("//input[@value='Continue']")).click();
			
			String text = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
			Assert.assertEquals(text, "Your Account Has Been Created!");
			
			driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.linkText("Register")).click();
		
	}

}
