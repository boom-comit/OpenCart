package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBases.BaseClass;
import utilities.ProviderClass;


public class Tc_002_Login_dtt extends BaseClass {
	
	@Test(dataProvider="dp",dataProviderClass=ProviderClass.class)
	
	public void ValidateLogin(String un,String pass,String exp) throws InterruptedException {
		
		
	logger.info("*****Starting Test*****");
	
		
		HomePage hp=new HomePage(driver);
		
		hp.ClickMyAccount();
		
		Thread.sleep(3000);
		hp.ClickLogin();
		Thread.sleep(3000);
		LoginPage lp=new LoginPage(driver);
		
		lp.enterlogin(un);
		lp.enterpass(pass);
		lp.clickloginbtn();
		
		Thread.sleep(4000);
		
		MyAccountPage mp =new MyAccountPage(driver);
		
		String Actual=mp.Getmyaccount();
		
		System.out.println(Actual);
		
		if (exp.equalsIgnoreCase("Valid")) {
			
			mp.Logout();
			
			Assert.assertEquals(Actual,"My Account");
		}
		
		else {
		
		Assert.assertNotEquals(Actual,"My Account");
		
		}
		
		
		logger.info("***Finished Tsting*****");
	}

}
