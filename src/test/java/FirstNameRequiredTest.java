


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNameRequiredTest {
  @Test
  public void f() {
	  WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Config.APP_URL);
		driver.findElement(By.id("firstName")).sendKeys("");
		driver.findElement(By.id("registerMember")).click();
		System.out.println( driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[2]/div[1]/div[1]/div/div/div/div[2]")).getText());
		String expectedResult= "First Name is required";
		String actualResult= driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[2]/div[1]/div[1]/div/div/div/div[2]")).getText();
		Assert.assertEquals(actualResult,expectedResult);
		driver.quit();
  }
}
