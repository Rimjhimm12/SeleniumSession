package opencart;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OPRegistationPage extends OPBestClass {
	
	@Test
	public void openCartFormTest() {
		
		By formSectios = By.xpath("//form[@class='form-horizontal']/fieldset");
		int formSectionParts = driver.findElements(formSectios).size();
		Assert.assertEquals(formSectionParts, 3);
		
	
	}
	
	

}
