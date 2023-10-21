package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLocator {
	public static void main(String[] args) throws InterruptedException {
	 	   WebDriver driver=new ChromeDriver();
	   		driver.manage().window().maximize();
	   		
	   		driver.get("https://www.facebook.com/login");
	   	    Thread.sleep(2000);
	   	    
	   	    //identify usernameTB by using idLocator 
	   	    driver.findElement(By.id("email")).sendKeys("komal@123");
	   	    Thread.sleep(2000);
	   	   
	   	//identify passwordTB by using idLocator 
	   	    driver.findElement(By.id("pass")).sendKeys("Abc@123");
	   	    
	   	   
	}

}
