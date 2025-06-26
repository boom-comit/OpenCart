package testBases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class BaseClass {
	
public WebDriver driver;
	public Logger logger;
	
	public Properties pf;
	
	public FileInputStream fi;

	@BeforeClass
	@Parameters({"browser"})

	public void setup(String br) throws InterruptedException, IOException {
		
		
		
		 br=br.toLowerCase();
		 
		 fi=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
	    pf=new Properties();
	    
	    pf.load(fi);

	
		logger=LogManager.getLogger(this.getClass());
		
		switch (br) {
		
		
		
		
		case "chrome" : driver=new ChromeDriver();break;
		
		case "firefox" : driver=new FirefoxDriver();break;
		
		default : logger.info("Invaid Browser");return;
		
		}
		
		driver.get(pf.getProperty("appurl"));
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
	}
	
@AfterClass
	
	public void teardown() {
		
		driver.quit();
	}



public String randomstring() {
	
	
	
	String rands=RandomStringUtils.randomAlphabetic(5);
	
	return rands;
	
			
	
}



public String randomint() {
	
	
	String randint=RandomStringUtils.randomNumeric(10);
	
	return randint;
	
			
	
}


public String randomalphanuerc() {
	
	
	String randalphanumeric=RandomStringUtils.randomAlphanumeric(8)+"_";
	
	return randalphanumeric;
	
			
	
}



}
