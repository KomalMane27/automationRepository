package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(2000);
		
	  //driver.switchTo().activeElement().sendKeys("joey tribbiani",Keys.ENTER);
	     //Thread.sleep(2000);
		  

		 driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
	    //Thread.sleep(2000);
	  
	     //driver.findElement(By.className("lNPNe")).click();
	    
		 //driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		//driver.switchTo().activeElement().sendKeys("Rachel green",Keys.ENTER);
	    Thread.sleep(2000);

		driver.findElement(By.className("lNPNe")).click();
		
		
	}

}
