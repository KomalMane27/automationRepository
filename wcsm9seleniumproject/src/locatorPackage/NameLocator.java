package locatorPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/radioButton.html");
		
		Thread.sleep(2000);
		//identify D radio button by using nameLocator
		driver.findElement(By.name("name4")).click();
		Thread.sleep(2000);
		
		//identify A radio button by using nameLocator
		driver.findElement(By.name("name1")).click();
		

	 
	}

}
