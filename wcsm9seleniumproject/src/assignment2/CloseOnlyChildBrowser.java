package assignment2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildBrowser {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
	    System.out.println("address of parent window :"+parentHandle);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();

		Set<String> allHandles = driver.getWindowHandles();
        for(String wh:allHandles)
        {
        	if(!parentHandle.equals(wh))
        	{
        		TargetLocator switchTo = driver.switchTo();
        		switchTo.window(wh).manage().window().maximize();
        		Thread.sleep(2000);
        		switchTo.window(wh).close();
        		
        	}
        	        	
        }
	}

}
