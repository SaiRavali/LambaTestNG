package scenarios;
	
	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

	public class Scenario2 extends BaseClass {

		

	
    @Test 
    
    public void checkboxDemo()  {

    	driver.findElement(By.xpath("//a[text()='Checkbox Demo']")).click();
    	//driver.findElement(By.linkText("Checkbox Demo")).click();
    	WebElement checkBoxSelected = driver.findElement(By.id("isAgeSelected"));
    	boolean isSelected = checkBoxSelected.isSelected();

		// performing click operation if element is not selected 
		if(isSelected == false) {
			checkBoxSelected.click();
		}
    	WebElement checkBoxElement = driver.findElement(By.id("isAgeSelected"));
		boolean isEnabled = checkBoxElement.isEnabled();

		// performing click operation if element is enabled
		if (isEnabled == true) {
			checkBoxElement.click();
		}

		}  

	}

