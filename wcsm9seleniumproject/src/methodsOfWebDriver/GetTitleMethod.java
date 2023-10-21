package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
	      //maximize the chrome browser
	   driver.manage().window().maximize();
	   
	   driver.get("http://komalmane/login.do");
	  
	   String loginPageTitle=driver.getTitle();
	   System.out.println("Actitime login page title :"+driver.getTitle());
	   /*
	   System.out.println(loginPageTitle);
	   driver.findElement(By.name("username").sendKeys("admin"));
	   driver.findElement(By.name("pwd").sendKeys("manage"));
       driver.findElement(By.name)*/
	   
	   Thread.sleep(2000);
	   driver.close();

	}

}
