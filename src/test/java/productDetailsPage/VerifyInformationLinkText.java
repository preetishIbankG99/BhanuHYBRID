package productDetailsPage;

import org.apache.log4j.Logger;

import helper.Logger.LoggerHelper;
import testbase.Config;
import testbase.TestBase;



/**
 * @author Bhanu Pratap
 * https://www.youtube.com/user/MrBhanupratap29/playlists
 */
public class VerifyInformationLinkText extends TestBase{
	private final Logger log = LoggerHelper.getLogger(VerifyInformationLinkText.class);
	
	public void testVerifyInformationLinkText(){
		log.info(VerifyInformationLinkText.class.getName()+" started");	
		
		Config config = new Config(OR);
		driver.get(config.getWebsite());
	}
}
