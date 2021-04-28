package productDetailsPage;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.Logger.LoggerHelper;
import pageobject.HomePage;
import pageobject.LoginPage;
import pageobject.ProductCategoryPage;
import testbase.Config;
import testbase.TestBase;



/**
 * @author Bhanu Pratap
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 */
public class VerifyProductCounts extends TestBase{
	private final Logger log = LoggerHelper.getLogger(VerifyProductCounts.class);
	LoginPage loginPage;
	HomePage homePage;
	
	@Test
	public void testVerifyProductCounts(){
		log.info(VerifyProductCounts.class.getName()+" started");	
		
		Config config = new Config(OR);
		driver.get(config.getWebsite());
		
		homePage = new HomePage(driver);
		ProductCategoryPage pCate = homePage.clickOnMenu(homePage.womenMenu);
		pCate.selectColor(pCate.Orange);
		int count = pCate.getTotalProducts();
		
		if(count==3){
			log.info("product count is matching");
		}
		else{
			Assert.assertTrue(false,"product count is not matching");	
		}
		
	}

}
