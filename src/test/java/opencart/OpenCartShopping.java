package opencart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class OpenCartShopping extends OPBestClass{
	
	public static String getSearchText() {
		String searchData = "macbook";
		return searchData;
	}
	
	@DataProvider
	public Object[][] searchMacProduct(){
		return new Object[][] {
			{"MacBook Pro", "2"}
			
			};
	}
	
	
	@Parameters({"username","password"})
	@Test
	public void OCloginPageTest(String userName, String passWord) {
		driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Assert.assertEquals(driver.getTitle(), "My Account");
	}
		
		@Test(dataProvider = "searchMacProduct")
		public void OCsearchMacbookProTest(String itemName, String itemCount) {
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(getSearchText());
		driver.findElement(By.xpath("//button[@type='button']/i[@class='fa fa-search']")).click();
		
		
		driver.findElement(By.linkText(itemName)).click();
		driver.findElement(By.id("input-quantity")).clear();
		driver.findElement(By.id("input-quantity")).sendKeys(itemCount);
		Assert.assertTrue(driver.getTitle().contains("MacBook"));
		 
		
	}

}
