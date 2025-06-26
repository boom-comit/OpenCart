package testCases;


import org.testng.Assert;

import org.testng.annotations.Test;


import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBases.BaseClass;

public class VerifyRegistrationSuccessful extends BaseClass {

	
	
	
	
	@Test
	
	public void registration() throws InterruptedException {
		
	try {	
		logger.info("***** Starting the test****");
		
		HomePage hp=new HomePage(driver);
		
		hp.ClickMyAccount();
		
		logger.info("My account clicked");
		
		Thread.sleep(2000);
		
		hp.ClickRegster();
		
		logger.info("Register clicked");
		
		RegistrationPage rp= new RegistrationPage(driver);
		
		
		
		rp.enterfname(randomstring());
		rp.entelname(randomstring());
		rp.enteremail(randomstring()+"@gmail.com");
		rp.enetrphone(randomint());
		
		String a= randomalphanuerc();
		rp.enterpasword(a);
		rp.enterConfirmpas(a);
		rp.privacypolicy();
		rp.clickcontbtn();
		
		
		logger.info("details enterd");
		
		Thread.sleep(4000);
		
		logger.info(rp.confrommessage());
		
		
		
		if (rp.confrommessage().equals("Your Account Has Been Created!")) {
			
			logger.info("Test Passed");
			Assert.assertTrue(true);
			
			
		}
		
		else {
			
			logger.error("Test Failed");
			logger.debug("Debug logs");
			
			Assert.assertTrue(false);
		}
	}	
		catch (Exception e) {
			
			Assert.fail();
			
		}
	
	logger.info("******Finised Tc001*****");
	}
	
	
	
	
}
