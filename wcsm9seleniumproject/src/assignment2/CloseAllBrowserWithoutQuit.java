package assignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllBrowserWithoutQuit {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://omayo.blogspot.com/");
	Thread.sleep(2000);
	
	String parentHandle = driver.getWindowHandle();
    System.out.println("address of parent window :"+parentHandle);
	
	driver.findElement(By.partialLinkText("Open a popup window")).click();
	//how to close all browser without using quit();
			Set<String> allHandles = driver.getWindowHandles();
	        for(String wh:allHandles)
	        {
        		driver.switchTo().window(wh).close();
	        }


	}

}
