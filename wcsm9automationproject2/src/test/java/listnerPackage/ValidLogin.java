package listnerPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomeListner.class)
public class ValidLogin extends BaseTest{
	static WebDriver driver;
  @Test
  public void validLoginMethod() {
	  String expectedLoginTitle = "actiTIME - Login";
	  Assert.assertEquals(driver.getTitle(), expectedLoginTitle);
	  driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
  }
}
