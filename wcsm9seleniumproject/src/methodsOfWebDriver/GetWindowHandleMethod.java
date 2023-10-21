package methodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

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
			   
			     driver.close();
           
	}
}
