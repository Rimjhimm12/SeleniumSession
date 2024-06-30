package opencart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OPLoginPage extends OPBestClass{
	
	@Test
	public void openCartLoginPageTest() {
		
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		Assert.assertEquals(title.contains("Login"), true);
	}
	
	@Test
	public void openCartLoginPageRightColumn() {
		By rightColumn = By.xpath("//div[@class='list-group']/a");
		List<WebElement> rightColumnList = driver.findElements(rightColumn);
		for (WebElement e : rightColumnList) {
			if(e.getText().equals("Register")) {
				Assert.assertEquals(e.getText(), "Register");
				continue;
				
			}
			if(e.getText().equals("Forgotten Password")) {
				Assert.assertEquals(e.getText(), "Forgotten Password");
				break;
			}
			
			
			
		}
		
	}
	

}
