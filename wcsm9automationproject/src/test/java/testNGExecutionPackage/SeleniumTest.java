package testNGExecutionPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.Advice.Enter;

public class SeleniumTest {
  

@Test
  public void selenium_method() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.google.com/");
	  driver.switchTo().activeElement().sendKeys("Sql");
	  
  }
}
