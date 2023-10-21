package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLocator {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://komalmane/login.do ");
    Thread.sleep(2000);
    
    //identify usernameTB by using name 
    driver.findElement(By.name("username")).sendKeys("Admin");
    //Thread.sleep(2000);
    
    //identify passwordTB by using name
    driver.findElement(By.name("pwd")).sendKeys("Manager");
    

	}
}
