package Resources;
import com.browserstack.local.Local;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSDriver;

import java.io.FileReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserStackTestNGTest {
    public WebDriver driver;
    public WebDriverWait wait;
    private Local l;
    public String url;

    @BeforeMethod(alwaysRun=true)
    @org.testng.annotations.Parameters(value={"config", "environment"})
    public void setUp(String config_file, String environment) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject config = (JSONObject) parser.parse(new FileReader("src/test/java/Configuration/" + config_file));
        JSONObject envs = (JSONObject) config.get("environments");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        Map<String, String> envCapabilities = (Map<String, String>) envs.get(environment);
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
        }
        
        Map<String, String> commonCapabilities = (Map<String, String>) config.get("capabilities");
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            if(capabilities.getCapability(pair.getKey().toString()) == null){
                capabilities.setCapability(pair.getKey().toString(), pair.getValue().toString());
            }
        } 

        String username = System.getenv("BROWSERSTACK_USERNAME");
        if(username == null) {
            username = (String) config.get("user");
        }

        String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
        if(accessKey == null) {
            accessKey = (String) config.get("key");
        }
                        
        String BrowserStack=(String) config.get("BrowserStack");
        if(BrowserStack==null){
        	
        	    url="http://127.0.0.1:4723/wd/hub"; 
        	    
        }
        else {
        		url="http://"+username+":"+accessKey+"@"+config.get("server")+"/wd/hub";
     
        }
        
        String app = System.getenv("BROWSERSTACK_APP_ID");
        if(app != null && !app.isEmpty()) {        		
        		capabilities.setCapability("app", app);	       		 
        	}
             
        if(capabilities.getCapability("browserstack.local") != null && capabilities.getCapability("browserstack.local") == "true"){
            l = new Local();
            Map<String, String> options = new HashMap<String, String>();
            options.put("key", accessKey);
            l.start(options);
        }

        
        driver = new AndroidDriver(new URL(url/*"http://"+username+":"+accessKey+"@"+config.get("server")+"/wd/hub"*//*"http://127.0.0.1:4723/wd/hub"*/), capabilities);		
        //driver = new IOSDriver(new URL(url/*"http://"+username+":"+accessKey+"@"+config.get("server")+"/wd/hub"*//*"http://127.0.0.1:4723/wd/hub"*/), capabilities);
        wait= new WebDriverWait(driver, 30);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);               

    }

    @AfterMethod(alwaysRun=true)
    public void tearDown() throws Exception {
        driver.quit();
        if(l != null) l.stop();
    }
}
