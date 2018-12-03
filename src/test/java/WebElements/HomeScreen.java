package WebElements;


import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import org.openqa.selenium.Dimension;
import static org.junit.Assert.*;
import tests.Calc;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.Calc;


import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomeScreen {
	
	
	WebDriver driver;
	WebDriverWait wait;
	Calc Calc1 = new Calc();
	boolean bool;
	Dimension size;
	
	//HomeScreen
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/freeform_logo")
	@iOSFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/freeform_logo")
    WebElement LogoHomeScreen1;
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/iv_menu")
    WebElement HBMenu1;
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/iv_search")
    WebElement SearchButton1;

	
	
	
	public HomeScreen(WebDriver driver2,WebDriverWait wait2){
	       this.driver = driver2;
	       //PageFactory.initElements(driver2, this);
	       PageFactory.initElements(new AppiumFieldDecorator(driver2),this);
	       this.wait=wait2;	
	   }
	
	
	public void HomeScreenAssertions() throws Exception{	
		
		try {			
			Calc1.timer1(5);
			wait.until(ExpectedConditions.visibilityOf(LogoHomeScreen1));
			wait.until(ExpectedConditions.visibilityOf(HBMenu1));
			wait.until(ExpectedConditions.visibilityOf(SearchButton1));
			//bool= HBMenu1.isDisplayed();
			Assert.assertEquals(true, /*bool*/HBMenu1.isDisplayed());
			//bool= SearchButton1.isDisplayed();
			Assert.assertEquals(true, /*bool*/SearchButton1.isDisplayed());
    	  	System.out.println("Home Screen Asertion Sucessfully" );

	      }
	      catch (Exception e) { 
	    	  	System.out.println("Home Screen Asertion Failed" + e.getMessage());
		 	  	org.testng.Assert.fail("Home Screen Asertion Failed");

		  	  	throw(e);

	      }
		
				        
	}
	 
	
	public void swipe2 (int startx, int starty, int endx,int endy) {
		try {
			
			  size = driver.manage().window().getSize();
			  TouchAction action = new TouchAction((MobileDriver)driver);
			  action.press(startx,starty).moveTo(endx,endy).release().perform();
	    	  System.out.println("Swipe from the top to the button Sucessfully" +":" + startx +":"+ starty );
	    	  

	      }
	      catch (Exception e) { 
	    	  	System.out.println("Swipe from the top to the button Failed" + e);
		  	  	   

	      }
	 
	}
	
	public void HBMenu() throws Exception{
		try {
			
			HBMenu1.click();	
	    	System.out.println("Click on HB sucessfully");

	      }
	      catch (Exception e) { 
		    	System.out.println("Click on HB Failed"+ e);
		  	  	throw(e);

	      }
				
	}
	
	

}
		
