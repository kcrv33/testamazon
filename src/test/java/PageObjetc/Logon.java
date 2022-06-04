package PageObjetc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class Logon {
	
	WebDriver driver = BaseClass.getDriver();
	
	public Logon() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement InputUser;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement ContinueButton;
	
			
			

}
