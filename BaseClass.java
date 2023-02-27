package scenarios;



import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	

	public String username = "sairavali.g";
    public String accesskey = "m7Mx3NLqkmU57aXtM8FfTJl1P2CwR65Ip3tFcrm5M21radI58J";
    
    public static RemoteWebDriver driver = null;
    public String gridURL = "@hub.lambdatest.com/wd/hub";
    boolean status = false;
   
    
    @BeforeMethod
    public void setUp() throws Exception {
       DesiredCapabilities capabilities = new DesiredCapabilities();
       ChromeOptions browserOptions = new ChromeOptions();
       capabilities.setCapability("browserName", "chrome");
       browserOptions.setPlatformName("MacOS Monterey");
       browserOptions.setBrowserVersion("110.0");
       HashMap<String, Object> ltOptions = new HashMap<String, Object>();
       ltOptions.put("username", "sairavali.g");
       ltOptions.put("accessKey", "m7Mx3NLqkmU57aXtM8FfTJl1P2CwR65Ip3tFcrm5M21radI58J");
       ltOptions.put("visual", true);
       ltOptions.put("video", true);
       ltOptions.put("build", "Lambda TestNG");
       ltOptions.put("project", "Lambda");
       ltOptions.put("tunnel", true);
       ltOptions.put("w3c", true);
       ltOptions.put("plugin", "java-testNG");
       browserOptions.setCapability("LT:Options", ltOptions);
        try {
            driver = new RemoteWebDriver(new URL("https://" + username + ":" + accesskey + gridURL), capabilities);
        } catch (MalformedURLException e) {
            System.out.println("Invalid grid URL");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
   }
    
    @Parameters({"browser","url"})
	
	public void beforeTest(String browser,String url) {

	  if(browser.equalsIgnoreCase("chrome")) {
	  driver = new ChromeDriver();	  
    }
	  else if (browser.equalsIgnoreCase("safari")) { 
    driver = new SafariDriver();
    } 
    driver.get("https://www.lambdatest.com/selenium-playground/."); 
   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
   //wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    
    }

	
    @AfterClass
    public void tearDown() throws Exception {
       if (driver != null) {
          //  ((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
            driver.quit();
        }
    }
}
		












    
