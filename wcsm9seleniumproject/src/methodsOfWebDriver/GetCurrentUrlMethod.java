package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://komalmane/login.do");
	String urlOfLoginPage=driver.getCurrentUrl();
	System.out.println("Actitime login page url"+urlOfLoginPage);
	Thread.sleep(2000);
	driver.close();
	

	}

}
