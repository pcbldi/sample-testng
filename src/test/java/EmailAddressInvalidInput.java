package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailAddressInvalidInput {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(com.micar.config.Config.APP_URL);
		//driver.findElement(By.id("email")).sendKeys("email[]");
		String email[] = {"sd@jh","sgfdghs.com","jan@inte","32745367","dhsfshdf","@.com","cm.@sdfs","rediff.gamil.@com"};
		for(int i = 0 ; i < email.length ; i++){
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email[i]);
			driver.findElement(By.xpath(".//*[@id='email']")).clear();
		}
		driver.findElement(By.id("registerMember")).click();
		//System.out.println( driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[1]/div[1]/div/div/div/div[1]/div[2]")).getText());
		String expectedResult = "Please enter valid email id";
	    String actualResult = driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[1]/div[1]/div/div/div/div[1]/div[2]")).getText();
        Assert.assertEquals(actualResult, expectedResult);
        driver.quit();
        
  }
}
