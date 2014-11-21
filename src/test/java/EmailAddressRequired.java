package test.java; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert; 

public class EmailAddressRequired { 
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		driver.get(com.micar.config.Config.APP_URL);
		driver.findElement(By.id("email")).sendKeys(""); 
		driver.findElement(By.id("registerMember")).click();
		//System.out.println( driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[1]/div[1]/div/div/div/div[1]/div[2]")).getText());
	    String expectedResult = "Email Address is required";
	    String actualResult = driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[1]/div[1]/div/div/div/div[1]/div[2]")).getText();
	    Assert.assertEquals(actualResult, expectedResult);
	    driver.quit();
	}
	
}



