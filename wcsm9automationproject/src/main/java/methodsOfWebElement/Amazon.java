package methodsOfWebElement;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

/*public class Scenario4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Apple watch");
		
	}*/
		public class Amazon{
			static WebDriver driver;
		public static void main(String[] args) {
			Scanner sc = new scanner(System.in);
			System.out.println("pass the browsername which u want to launch");
			String browservalue = sc.next();
			if(browservalue.equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();
			}
			else if(browservalue.equalsIgnoreCase("firefox"))
			{
				driver=new ChromeDriver();

			}
			else if(browservalue.equalsIgnoreCase("edge"))
			{
				driver=new ChromeDriver();

			}
			
			else {
				System.out.println("not a browser");
			}
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.amazon.in/");
			
			//search for the product 
}
			public static void searchProduct(String product)
			{
				driver.findElement(By.id(""))
			}
	
			driver.findElement(By.name("url"))
			driver.findElement(By.xpath("//option[text()='Watches']"))
			
			
			
			
			
			
			
			
			
			
		//}
	//	}
		

//}
