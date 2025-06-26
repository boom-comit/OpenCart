package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePageObject {
	
	public MyAccountPage (WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement Myacc;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement logout;
	
	public String Getmyaccount () {
		
		try {
		String acc= Myacc.getText();
				return acc;
				
		}
		
		catch(Exception e) {
			
			return e.toString();
		}
		
		
	}
	
public void  Logout () {
		
	logout.click();
		
		
		
	}
	
	
	
}
