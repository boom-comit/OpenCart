package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBases.BaseClass;

public class Tc_001_Verify_LoginSuccesful extends BaseClass{
	
	
	@Test
	
	public void LoginSuccessfu() throws InterruptedException {
		
		try {
			
			logger.info("*****Starting Test*****");
	
		
		HomePage hp=new HomePage(driver);
		
		hp.ClickMyAccount();
		
		Thread.sleep(3000);
		hp.ClickLogin();
		Thread.sleep(3000);
		LoginPage lp=new LoginPage(driver);
		
		lp.enterlogin(pf.getProperty("username"));
		lp.enterpass(pf.getProperty("pass"));
		lp.clickloginbtn();
		
		Thread.sleep(4000);
		
		MyAccountPage mp =new MyAccountPage(driver);
		
		String Actual=mp.Getmyaccount();
		
		System.out.println(Actual);
		
		
		
		mp.Logout();
		
		Thread.sleep(3000);
		
		Assert.assertEquals(Actual,"My Account");
		
		}
		
	catch (Exception e)	{
		
		Assert.fail();
	}
		
	}

}
