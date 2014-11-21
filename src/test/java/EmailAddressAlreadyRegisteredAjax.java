import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

// if an email is already registered with MiCar
public class EmailAddressAlreadyRegisteredAjax {
  @Test
  public void f() {
	  
	  WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(Config.APP_URL);
		driver.findElement(By.id("email")).sendKeys("shilpa.ranjan@intelligrape.com"); 
		driver.findElement(By.id("password_id")).sendKeys("");
		WebElement abc = new WebDriverWait(driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[1]/div[1]/div/div/div/div[1]/div[2]")));
      System.out.println(abc.getText());	
      String expectedResult = "Email Address lready registered with MiCar";
	    String actualResult = driver.findElement(By.xpath(".//*[@id='accountCreationForm']/fieldset/div[1]/div[1]/div/div/div/div[1]/div[2]")).getText();
       Assert.assertEquals(actualResult, expectedResult);
       driver.quit();
       
  }
}
