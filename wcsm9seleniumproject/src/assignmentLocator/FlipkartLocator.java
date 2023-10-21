package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLocator {
       public static void main(String[] args) throws InterruptedException {
    	   WebDriver driver=new ChromeDriver();
   		driver.manage().window().maximize();
   		
   		driver.get("https://affiliate.flipkart.com/login");
   	    Thread.sleep(2000);
   	    
   	    //identify usernameTB by using id 
   	    driver.findElement(By.id("inputEmail")).sendKeys("1234567890");
   	    Thread.sleep(2000);
   	    
   	 //identify passwordTB by using id 
   	    driver.findElement(By.id("inputPassword")).sendKeys("1234567890");
   	  
   	    

	}
}
