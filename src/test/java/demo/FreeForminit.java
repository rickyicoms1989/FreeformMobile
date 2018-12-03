package demo;
 
import tests.Calc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Resources.BrowserStackTestNGTest;
import Resources.GlobalVariables;
import WebElements.HomeScreen;
import WebElements.LoginElements;
import WebElements.WelcomeScreen;
import io.appium.java_client.TouchAction;;
 
public class FreeForminit extends BrowserStackTestNGTest{
 
 	
 	@Test
 	public void Signin() { 
 		
 		/*
 		 How to upload app(browserStack)
 		 curl -u "eldercerrato3:kTN3uKCew9NSNqk5AdBh" -X POST "https://api-cloud.browserstack.com/app-automate/upload" -F "file=@/Users/rickycasco/Downloads/Evernote.apk"
		 bs://7035f1127ff77e6129704661f0aedea2956b7875   
 		*/
 		try {
 		//Instance Declaration
 		Calc Calc1 = new Calc(); 		
 		GlobalVariables variables = new GlobalVariables();
 		WelcomeScreen WelcomeScreen = new WelcomeScreen(driver,wait);
 		HomeScreen homescreen = new HomeScreen(driver,wait);
 		WelcomeScreen.WelcomeScreenSkip();
 		WelcomeScreen.AssertionScreen2();
 		WelcomeScreen.SkipScreen2();
 		WelcomeScreen.AssertionScreen3();
 		WelcomeScreen.SkipScreen3();
 		homescreen.HomeScreenAssertions();
 		homescreen.swipe2(800,1867,745,498);
 		homescreen.swipe2(740,654,794,2639);
 		}
 		catch (Exception e) { 
    	  	System.out.println(e);

			}
 		
 		}
 	
} 