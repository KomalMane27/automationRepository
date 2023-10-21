package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		//To launch chrome browser we need to create obj of ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		//How to maximize the browser
		driver.manage().window().maximize();
		System.out.println("Chrome is open!!!");
		//Stop the execution of script for 2sec
        Thread.sleep(2000);
    	
        //How to close chrome browser
        driver.close();
		System.out.println("Chrome is close");
    
	}

}
