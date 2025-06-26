package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage extends BasePageObject{
	

  
  public  HomePage(WebDriver driver) {
	  
	 super(driver);
	  
  }
  
  @FindBy(xpath="//span[normalize-space()='My Account']")
  WebElement Myacc;
  
  
  @FindBy(xpath="//a[normalize-space()='Register']")
  WebElement Register;
  
  @FindBy(xpath="//a[normalize-space()='Login']")
  WebElement login;
  
  
  public void ClickMyAccount() {
	  Myacc.click();
	  
	  
  }
  
  
  public void ClickRegster() {
	  Register.click();
	  
	  
  }
  
  
  public void ClickLogin() {
	  login.click();
	  
	  
  }
  
  
  
  
  
  
}
