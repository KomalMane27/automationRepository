package testNGAnnotations_Flags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ActiTimetestdata {
  @Test(dataProvider = "TestData")
  public void invalidLoginMethod(String usn,String pass) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://komalmane/login.do");
	
	driver.findElement(By.name("username")).sendKeys(usn);
	driver.findElement(By.name("pwd")).sendKeys(pass);
	driver.findElement(By.id("loginButton")).click();
	driver.findElement(By.name("username")).clear();
  }
  @DataProvider(name="TestData")
  public Object[][] actiTimeTestDataMethod() {
	  Object[][] testData = new Object[5][2];
	  testData[0][0]="ad_min";
	  testData[0][1]="mana_ger";
	
	  testData[1][0]="admin";
	  testData[1][1]="mana_ger1";
	  
	  testData[2][0]="ad_min2";
	  testData[2][1]="mana_ger2";
	  
	  testData[3][0]="ad_min3";
	  testData[3][1]="mana_ger3";
	  
	  testData[4][0]="ad_min4";
	  testData[4][1]="mana_ger4";
	  
	  return testData;
  }
}
