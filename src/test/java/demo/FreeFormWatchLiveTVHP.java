package demo;


import tests.Calc;
import org.testng.annotations.Test;
import Resources.BrowserStackTestNGTest;
import Resources.GlobalVariables;
import WebElements.HomeScreen;
import WebElements.WelcomeScreen;


public class FreeFormWatchLiveTVHP extends BrowserStackTestNGTest{

	@Test
 	public void Signin(){ 
 		
 		//Instance Declaration
		try {
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
 		homescreen.HBMenu();
		}
		catch (Exception e) { 
    	  	System.out.println(e);
		}
 		
 		}
	
	
	
	
	
}
