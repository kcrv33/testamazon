package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjetc.HomePage;
import Utilities.BaseClass;

public class testcase1 {
	
	HomePage hp = new HomePage();
	
  @BeforeClass
  public void SetUp() {
	  BaseClass.getDriver();
	  
  }
   
  
  @Test
  public void Test() {
	  hp.LogonButton.click();
	  
  }
  
  @AfterClass
  public void tearDown() {
	  //BaseClass.teardown();
  }
  
  

}
