package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
		 // TO launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
	    //launch the webapplication 
	    driver.get("http://omayo.blogspot.com/");
	    String parentHandle = driver.getWindowHandle();
	    System.out.println("address of parent window :"+parentHandle);
	    //stop the execution of script for 2sec
	    Thread.sleep(2000);
	    //click on open a pop window link....
	    driver.findElement(By.partialLinkText("Open a popup window")).click();
	    Thread.sleep(2000);
        Set<String> allHandles = driver.getWindowHandles();
        for(String wh:allHandles)
        {
        	if(!parentHandle.equals(wh))
        	{
        		System.out.println("address of child window :"+wh);
        		Thread.sleep(2000);
        		TargetLocator switchTo = driver.switchTo();
        		switchTo.window(wh).manage().window().maximize();
        		Thread.sleep(2000);
        		switchTo.window(wh).close();
        		//driver.switchTo().window(wh).close();
        	}
        	else
        	{
        		System.out.println("address of parent window :"+wh);
        	}
        }
        driver.quit();


	}

}
