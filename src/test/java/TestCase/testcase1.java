package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import PageObjetc.HomePage;
import PageObjetc.Logon;
import PageObjetc.SigninPage;
import Utilities.BaseClass;
import Utilities.Constants;

public class testcase1 {
	
	HomePage hp = new HomePage();
	Logon lg = new Logon();
	SigninPage sp = new SigninPage();
	
  @BeforeMethod
  public void SetUp() {
	  BaseClass.getDriver();
	  
  }
   
  
  @Test
  @Ignore
  public void TestLogin() {
	  hp.LogonButton.click();
	  lg.InputUser.sendKeys(Constants.user);
	  lg.ContinueButton.click();
	  sp.Password.sendKeys(Constants.password);
	  sp.submitButton.click();
	  
	  	  
  }
  
  @Test
  public void SearchItem() {

	  this.TestLogin();	  
	  hp.inputSearch.sendKeys("Labtop"+ "\n");
	  
	  	  
  }
  
  
  
  @AfterClass
  public void tearDown() {
	  BaseClass.teardown();
  }
  
  

}
