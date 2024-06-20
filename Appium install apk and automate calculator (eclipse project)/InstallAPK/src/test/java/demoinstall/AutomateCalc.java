
//Try some other calculator application if system calc doesnt work properly due to security
package demoinstall;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class AutomateCalc {

		public static void main(String[] args) throws MalformedURLException, InterruptedException {
			// TODO Auto-generated method stub

			//Gather Desired capabilities
			//edited
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			   capabilities.setCapability("deviceName","6a518668");
		       capabilities.setCapability("platformname", "Android");     
		       capabilities.setCapability("automationName","uiautomator2");
		       capabilities.setCapability("platformversion", "14");
		       capabilities.setCapability("appPackage","com.bng.calculator");
		       capabilities.setCapability("appActivity", "com.bng.calc.MainActivity");
			        
			        URL url = URI.create("http://127.0.0.1:4723/").toURL();
			        
			        AndroidDriver driver = new AndroidDriver(url, capabilities);
			       
			        Thread.sleep(5000);
			        System.out.println("Application Started");

			        
			        //click on number 8
			       WebElement num8 =  driver.findElement(By.id("com.bng.calculator:id/btn_8"));
			       num8.click(); //perform click action on number 8
			
			    
			       //click on plus sign
			       WebElement plus =  driver.findElement(By.id("com.bng.calculator:id/plus"));
			       plus.click(); //perform click action on number 8
			    
			        //click on number 5
			       WebElement num5 =  driver.findElement(By.id("com.bng.calculator:id/btn_5"));
			       num5.click(); //perform click action on number 8
			    
			        //click on equal sign
			       WebElement equal =  driver.findElement(By.id("com.bng.calculator:id/equal"));
			       equal.click(); //perform click action on number 8
			    
			       Thread.sleep(5000);   //if formula and result bar is same add waite time
			       
			       //click on result sign 
			     WebElement result =  driver.findElement(By.id("com.bng.calculator:id/formula"));
			     String resultString = result.getText();
			      
			    
			      if(resultString.equals("13"))
			      {
			    	  System.out.println("Pass");
			      }
			      else
			      {
			    	  System.out.println("fail");
			      }
			      	 
			        driver.quit();//CLOSE SESSION
	}

}

