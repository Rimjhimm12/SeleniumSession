package opencart;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OPHomePage extends OPBestClass {
	
	@Test
	public void openCartHomePageTest() {
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals(title, "Your Store");
		
	}
	
	@Test
	public void openCartHomePageGlobalMenuTest() {
		By globalMenu = By.xpath("(//div[@class='container'])[1]//span[@class='hidden-xs hidden-sm hidden-md']");
		List<WebElement> globalMenuList = driver.findElements(globalMenu);
		for (WebElement e : globalMenuList) {
			String menus = e.getText();
			Assert.assertEquals(menus, e.getText());
			System.out.println(menus);
			
		}
		
		Assert.assertEquals(globalMenuList.size(), 6);
		
		
	}

}
