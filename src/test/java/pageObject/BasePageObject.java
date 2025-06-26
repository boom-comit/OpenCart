package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageObject {

	WebDriver driver;
	  
	   BasePageObject(WebDriver driver) {
		  
		  this.driver=driver;
		  
		  PageFactory.initElements(driver,this);
		  
	  }

	
	
	
	
}
