package scenarios;
	
	import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

	public class Scenario1 extends BaseClass {

	

	 
    @Test 
    
    public void title() {	

    SoftAssert softassert = new SoftAssert();

    // Define expected title
    String expectedtitle = "Selenium Grid Online | Run Selenium Test On Cloud";

    // Extract Actual title
    String actualtitle = driver.getTitle();
    
    // Soft Assertion applied to validate the result
    softassert.assertEquals(actualtitle, expectedtitle,"Title is not Matched");

    System.out.println("This statement will be executed even the previous statement is failed");
	
	}
   
	}
	

	  

