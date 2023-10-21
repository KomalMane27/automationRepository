package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		// launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
	    
	    driver.get("http://omayo.blogspot.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.partialLinkText("Open a popup window")).click();
	    Thread.sleep(2000);
	    //close the browser
	    driver.close();
	    

	}

}
