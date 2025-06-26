package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageObject {
	
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement log_btn;
	
	
	public void enterlogin(String uname) {
		email.sendKeys(uname);
		
	}
	
	public void enterpass(String pswd) {
		pass.sendKeys(pswd);
		
	}
	
	public void clickloginbtn() {
		log_btn.click();
		
	}

}
