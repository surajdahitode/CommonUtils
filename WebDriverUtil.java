package Commonutils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {

	
	//1)It is Method for Maximize the window .
	public void maximize(WebDriver driver) {
		
		//To maximize the window
		
		driver.manage().window().maximize();

	}

	
	 //2)It is Method for to get implicitwait .
	public void togetimlicitwait(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//3) It is Method for handle the dropdown element.
	public void tohandledropdown(WebElement targeteddropdown,String targetedoption) {
		
		Select s = new Select( targeteddropdown);
		s.selectByVisibleText(targetedoption);
		
	}
	
	//4)It is Method for to mouse overing element .
	public void Tomouseover(WebDriver driver ,WebElement tagreted)
	{
		Actions a = new Actions(driver);
		a.moveToElement(tagreted);
		a.perform();
	}
}
