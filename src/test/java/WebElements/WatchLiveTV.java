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


public class WatchLiveTV {

	
	WebDriver driver;
	WebDriverWait wait;
	Calc Calc1 = new Calc();
	boolean bool;
	Dimension size;
	
	@FindBy(id ="com.disney.datg.videoplatforms.android.abcf:id/iv_menu")
    WebElement HBMenu1;
	
	
	public WatchLiveTV(WebDriver driver2,WebDriverWait wait2){
	       this.driver = driver2;
	       PageFactory.initElements(driver2, this);
	       this.wait=wait2;	
	   }
	
	
}
