package PageObjetc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class SigninPage {
	
	WebDriver driver = BaseClass.getDriver();
	public SigninPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement Password;
	
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement submitButton;
	
	
	
	//input[@id='signInSubmit']
	
	

}
