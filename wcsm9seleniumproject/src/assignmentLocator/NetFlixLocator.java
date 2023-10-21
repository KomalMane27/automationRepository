package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixLocator {
	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/login");
	    Thread.sleep(2000);
	    
	    //identify usernameTB by using tagName 
	    driver.findElement(By.tagName("input")).sendKeys("1234567890");
	    Thread.sleep(2000);
	    
	    //identify passwordTB by using id 
	    driver.findElement(By.id("id_password")).sendKeys("A@2722");
	    Thread.sleep(2000);
	    
	    //identify sign in button by using cssSelector
	    driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();


	}

}
