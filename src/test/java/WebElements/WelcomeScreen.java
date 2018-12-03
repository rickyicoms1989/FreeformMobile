package WebElements;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.pagefactory.AndroidFindBy;
//import test.java.screen.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import static org.junit.Assert.*;
import tests.Calc;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.Calc;


public class WelcomeScreen {
	
	WebDriver driver;
	WebDriverWait wait;
	Calc Calc1 = new Calc();
	boolean bool;
	
	
	//Welcome Screen
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/tv_skip")
	@iOSFindBy(id ="")
    WebElement SkipforNow1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_login")
	@iOSFindBy(id ="")
    WebElement LoginButton1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_sign_up")
	@iOSFindBy(id ="")
    WebElement Signup1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/img_logo")
	@iOSFindBy(id ="")
    WebElement Logo1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/tv_title")
	@iOSFindBy(id ="")
    WebElement tvtitle1;
	
	//Second Screen for account
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/txt_play")
	@iOSFindBy(id ="")
    WebElement PlayMessage;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/txt_sync")
	@iOSFindBy(id ="")
    WebElement SyncMessage;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/txt_access")
	@iOSFindBy(id ="")
    WebElement AccessMessage;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/txt_notif")
	@iOSFindBy(id ="")
    WebElement NotiMessage;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_create_account")
	@iOSFindBy(id ="")
    WebElement CreateAccountButton1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_no_tv")
	@iOSFindBy(id ="")
    WebElement SkipButton1;	
	
	//tv Provider
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/img_lock")
	@iOSFindBy(id ="")
    WebElement LockImage1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/txt_title")
	@iOSFindBy(id ="")
    WebElement Title2;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_connect_provider")
	@iOSFindBy(id ="")
    WebElement ConnectProviderButon1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_no_tv")
	@iOSFindBy(id ="")
    WebElement NotvButton1;
	
	@AndroidFindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/button_tv_skip")
	@iOSFindBy(id ="")
    WebElement tvskipButton3;
	
	


	public WelcomeScreen(WebDriver driver2,WebDriverWait wait2){
	       this.driver = driver2;
	       //PageFactory.initElements(driver2, this);
	        PageFactory.initElements(new AppiumFieldDecorator(driver2),this);
	        this.wait=wait2;	
	   }
	
	public void  WelcomeScreenSkip() throws Exception{
		
		try {
			Calc1.timer1(10);	
			wait.until(ExpectedConditions.visibilityOf(SkipforNow1));
			Assert.assertEquals(true, LoginButton1.isDisplayed());
			Assert.assertEquals(true, Signup1.isDisplayed());
			Assert.assertEquals(true,Logo1.isDisplayed());		
			SkipforNow1.click();
	        System.out.println("Skip FirstWelcome Screen Sucessfully");

	      }
	      catch (Exception e) { 
	    	  	System.out.println("Skip FirstWelcome Screen Failed" + e);
	  	  	   throw(e);

	      }
		
		
	
	}
	public void AssertionScreen2() throws Exception{
		try {
			Calc1.timer1(10);
			wait.until(ExpectedConditions.visibilityOf(SkipButton1));		
			Assert.assertEquals(true, Logo1.isDisplayed());
			Assert.assertEquals(PlayMessage.getText(),"Watch thousands of hours of shows and movies for free");		
			Assert.assertEquals(SyncMessage.getText(),"Sync your viewing history across all your devices");		
			Assert.assertEquals(AccessMessage.getText(),"Access members-only content and behind the scenes exclusives");		
			Assert.assertEquals(NotiMessage.getText(),"Get reminders when new episodes of your favorite shows are available");	
			Assert.assertEquals(true, CreateAccountButton1.isDisplayed() /*bool*/);
			Assert.assertEquals(true,SkipButton1.isDisplayed());
 	  	    System.out.println("Assertion of second Screen Sucessfully");

		}
		catch (Exception e) { 
    	  	   System.out.println("Assertion of second Screen failed" + e.getMessage());
     	  	   org.testng.Assert.fail("Assertion of second Screen failed");
     	  	   throw(e);

		}
	}
	public void SkipScreen2() throws Exception{
		try
		{
			SkipButton1.click();	
	 	  	System.out.println("Skip  Button Pressed Sucessfully");
			
		}
		catch (Exception e) { 
 	  	   System.out.println("Skip  Button Pressed failed"+ e.getMessage());
 	  	   org.testng.Assert.fail("Skip  Button Pressed failed");

 	  	   throw(e);

		}
	}
	public void AssertionScreen3() throws Exception{
		try {
			Calc1.timer1(5);
			wait.until(ExpectedConditions.visibilityOf(LockImage1));
			wait.until(ExpectedConditions.visibilityOf(ConnectProviderButon1));
			wait.until(ExpectedConditions.visibilityOf(NotvButton1));
			wait.until(ExpectedConditions.visibilityOf(tvskipButton3));
			Assert.assertEquals(true,LockImage1.isDisplayed());
			Assert.assertEquals(true,ConnectProviderButon1.isDisplayed());
			Assert.assertEquals(true,NotvButton1.isDisplayed());
			Assert.assertEquals(true,tvskipButton3.isDisplayed());
			Assert.assertEquals(Title2.getText(),"Connect your TV Provider to unlock more content, at no added cost!");	
	 	  	System.out.println("Asertion of tv provider first view Sucessfully");

		}
		catch (Exception e) { 
	 	  	   System.out.println("Asertion of tv provider first view failed" + e.getMessage());
	 	  	   org.testng.Assert.fail("Asertion of tv provider first view failed");

	 	  	   throw(e);

			}
	}
	public void  SkipScreen3() throws Exception {
		try {
			tvskipButton3.click();	
	 	  	System.out.println("Click skip tv provider Sucessfully");

		}
		
		catch (Exception e) { 
	 	  	   System.out.println("Click skip tv provider Failed"+ e.getMessage());
	 	  	   org.testng.Assert.fail("Click skip tv provider Failed");

	 	  	   throw(e);
			}
	}
	
	


}
