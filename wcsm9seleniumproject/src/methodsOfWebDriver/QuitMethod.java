package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TO launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
	    //launch the webapplication 
	    driver.get("http://omayo.blogspot.com/");
	    //stop the execution of script for 2sec
	    Thread.sleep(2000);
	    //click on open a pop window link....
	    driver.findElement(By.partialLinkText("Open a popup window")).click();
	    Thread.sleep(2000);
	    //close the browser
	    driver.quit();
	    

	}

}
