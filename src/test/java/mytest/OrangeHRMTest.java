package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	@Test(description = "checking login page title...")
	public void googleTitleTest() {
		driver.get(
				"https://www.orangehrm.com/en/contact-sales/?_gl=1*a0l9rr*_up*MQ..*_ga*MTQ3Mjg1MDg5Ni4xNzE3MjI5NzU3*_ga_6C6T9MXTRT*MTcxNzIzOTEyMi4yLjEuMTcxNzIzOTEzNS4wLjAuNDAzODg1MjY2");
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		Assert.assertTrue(title.contains("OrangeHRM"), "====title is not matched====");
	}

	@Test(description = "checking login page url...")
	public void googleURLTest() {

		String url = driver.getCurrentUrl();
		System.out.println("page url : " + url);
		Assert.assertTrue(url.contains("orangehrm"), "====url is not matched===");
	}

}
