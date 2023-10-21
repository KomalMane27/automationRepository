package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/accounts/login");
	    Thread.sleep(2000);
	    
	    //identify usernameTB by using tagName 
	    driver.findElement(By.tagName("input")).sendKeys("1234567890");
	    Thread.sleep(2000);
	    
	    //identify passwordTB by using name 
	    driver.findElement(By.name("password")).sendKeys("A@2722");
	    

	}

}
