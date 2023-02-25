package scenarios;
	
	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

	public class Scenario3 extends BaseClass {

		

    @Test 
    
  
    	 public void alert()  {

            	//driver.findElement(By.linkText("Javascript Alerts")).click();

    	    driver.findElement(By.xpath("//a[text()='Javascript Alerts']")).click();
    	    	driver.findElement(By.xpath("//button[text()='Click Me']")).click();

    			Alert alert = driver.switchTo().alert();
    			String alertMsg= alert.getText();
    			System.out.println(alertMsg);
    			alert.accept();
    			}
   

	}


