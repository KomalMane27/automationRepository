package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/TextBox.html");
	    Thread.sleep(2000);
	    
	    //identify usernameTB by using id 
	    driver.findElement(By.id("id1")).sendKeys("Admin");
	    Thread.sleep(2000);
	    
	    //identify passwordTB by using id
	    driver.findElement(By.id("id2")).sendKeys("Manager");
	    
	}

}
