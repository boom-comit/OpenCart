package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage  extends BasePageObject {
	
	
	
	 public  RegistrationPage(WebDriver driver) {
		  
		 super(driver);
		  
	  }

	 
	 @FindBy(xpath="//input[@id='input-firstname']")
	 
	 WebElement fname;
	 
	 
	 
	 @FindBy(xpath="//input[@value='Continue']")
	 
	 WebElement ContBtn;
	 
	 @FindBy(xpath="//input[@name='agree']")
	 
	 WebElement agreecbox;
	 
	 @FindBy(xpath="//input[@id='input-confirm']")
	 
	 WebElement Confirmass;
	 
	 @FindBy(xpath="//input[@id='input-password']")
	 
	 WebElement password;
	 
	 @FindBy(xpath="//input[@id='input-telephone']")
	 
	 WebElement phoneneo;
	 
	 @FindBy(xpath="//input[@id='input-email']")
	 
	 WebElement email;
	 
	 @FindBy(xpath="//input[@id='input-lastname']")
	 
	 
	 
	 WebElement lastname;
	 
	
	 
	 @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	 
	 WebElement Expected;
	 
	 
	 public void enterfname(String first) {
		 
		 fname.sendKeys(first);
		 
		 
		 
	 }
	 
 public void entelname(String last) {
		 
	 lastname.sendKeys(last);
		 
		 
		 
 }
 
 public void enteremail(String email1) {

	 email.sendKeys(email1);
	 
	 
 }
 
 
 public void enetrphone(String phno) {
	 
	 phoneneo.sendKeys(phno);
	 
	 
 }
 
 public void enterpasword(String pass) {
	 
	 
	 password.sendKeys(pass);
	 
	 
	 
 }
	 public void enterConfirmpas(String Confirmpass) { 
		 
		 Confirmass.sendKeys(Confirmpass);
		 
	 
}
	 
	 public void privacypolicy() {
		 
		 agreecbox.click();
		 
		 
	 }
	 
 public void clickcontbtn() {
		 
	 ContBtn.click();
		 
		 
	 }
	 
	 
	 public String confrommessage() {
		 
		 try {
		 String message= Expected.getText();
		 
		 return message;
		 }
		 
		 catch(Exception e) {
			 
			return(e.getMessage());
		 }
	 }
}