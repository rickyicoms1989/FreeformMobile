package WebElements;

import java.util.List;

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
import tests.Calc;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import tests.Calc;

public class LoginElements {
	
	WebDriver driver;
	WebDriverWait wait;
	Calc Calc1 = new Calc();
	
	@FindBy(id ="com.evernote:id/already_have_account_sign_in" )
    WebElement Signin;
	@FindBy(id = "com.evernote:id/landing_username")
    WebElement EmailField1;
	@FindBy(id = "com.evernote:id/landing_login_password")
    WebElement PasswordField1;
	@FindBy(id = "com.evernote:id/landing_sign_in_button")
    WebElement LoginButton1;
	@FindBy(id = "android:id/message")
    WebElement message1;
	@FindBy(id = "com.evernote:id/note_list_listview")
    WebElement ListView1;
	
	
	//Emulator
	@FindBy(id ="com.evernote:id/landing_username")
    WebElement EmailEmulator1;
	@FindBy(id ="com.evernote:id/landing_login_password")
    WebElement PasswordEmulator1;
	@FindBy(id ="com.evernote:id/landing_sign_in_button")
    WebElement SigninEmulator1;
	@FindBy(id = "com.evernote:id/note_list_listview")
    WebElement ListViewEmulator1;
	
	
	//API
	@FindBy(id ="Graphics")
    WebElement Section1;


	
	

	
	


	public LoginElements(WebDriver driver2,WebDriverWait wait2){
	       this.driver = driver2;
	       PageFactory.initElements(driver2, this);
	       this.wait=wait2;	
	   }
	
	
	public void  LoginMethod(String Email, String Password){
		Calc1.timer1(10);
		//wait.until(ExpectedConditions.visibilityOf(EmailField1));
		EmailField1.sendKeys(Email);
		PasswordField1.sendKeys(Password);	
		Calc1.timer1(10);
		wait.until(ExpectedConditions.visibilityOf(ListView1));
		
	}
	
	public void  LoginMethodEmulator(String Email, String Password){
		Calc1.timer1(10);
		wait.until(ExpectedConditions.visibilityOf(Signin));
		Signin.click();
		wait.until(ExpectedConditions.visibilityOf(EmailEmulator1));
		EmailEmulator1.sendKeys(Email);
		PasswordEmulator1.sendKeys(Password);
		SigninEmulator1.click();
	}
	
	public void  API1(){
		Calc1.timer1(10);
		wait.until(ExpectedConditions.visibilityOf(Section1));
		Section1.click();
		
	}
	
	
	
	
	
	

}
