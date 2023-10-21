package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/TextBox.html");
	
	Thread.sleep(2000);
	//identify usernameTB and pass input as "Admin"
	driver.findElement(By.tagName("input")).sendKeys("Admin");
	Thread.sleep(2000);
	//identify PasswordTB and pass input as "manager"
	
	driver.findElement(By.tagName("input")).sendKeys("Manager");
	
	
	}

}
