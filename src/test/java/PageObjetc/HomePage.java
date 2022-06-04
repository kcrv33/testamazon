package PageObjetc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage {
	
	WebDriver driver = BaseClass.getDriver();
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='nav-tools']/a[2]")
	public WebElement LogonButton;

}
