package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
	// To launch the firefox browser create the obj of firefoxDriver();
	WebDriver driver =	new FirefoxDriver();
	driver.manage().window().maximize();
	//Stop the execution of script for 2sec
	System.out.println("Firefox is open!!");
	Thread.sleep(2000);
	
	//How to close firefox browser
	driver.close();
	System.out.println("Firefox is close");
	
	}

}
