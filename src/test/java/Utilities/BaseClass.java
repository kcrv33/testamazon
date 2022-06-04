package Utilities;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	
	public static WebDriver driver;
	
    public static WebDriver getDriver() {
    	
    	if(driver == null) {
    	    switch (BaseClass.getProperty("browser")){
    	    	
    	    	case "chrome":
    	    		WebDriverManager.chromedriver().setup();
    	    		driver = new ChromeDriver();
    	    		break;
    	    	case "safari":
    	    		WebDriverManager.safaridriver().setup();
    	    		driver = new SafariDriver();
    	    		break;   	  	    	
    	    	
    	    }
    		
    		
    	}
    	
    	
    	driver.get(BaseClass.getProperty("url"));
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	
    	
    	return driver;
    }
    

 		private static Properties configFile;

 		static {

 			try {
 				String filePath = "src/test/resources/propertyFolder/config.properties";

 				FileInputStream input = new FileInputStream(filePath);

 				configFile = new Properties();
 				configFile.load(input);

 				input.close();

 			} catch (Exception e) {
 				e.printStackTrace();
 			}

 		}
    
    public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
    
    public static void  teardown() {
       driver.quit();
    }
    
    
	
	
	

}
