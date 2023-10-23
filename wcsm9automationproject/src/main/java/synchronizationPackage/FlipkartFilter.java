package synchronizationPackage;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartFilter {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();//launch the browser
		driver.manage().window().maximize();//maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit
		driver.get("https://www.flipkart.com/");//launch the webApplication
		driver.findElement(By.xpath("//span[text()='✕']")).click();//handle the pop up
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("laptop");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='13 MORE']")).click();

		driver.findElement(By.xpath("//div[@class='_3879cV' and (text()='Core i7')]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
	    Thread.sleep(2000);
	    //select the 4 and above ratings from customer rating
	    driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
	    Thread.sleep(2000);
	    
	    //identify the name of laptops
	    List<WebElement> allLaptops = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']"));
	    //identify the price of laptops
	    List<WebElement> allPrices = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
	    
	    for(int i=0;i<allLaptops.size();i++)
	    {
	    	String laptops = allLaptops.get(i).getText();
	    	Thread.sleep(2000);
	    	for(int j=1;j<=i;j++)
	    	{
	    		String prices = allPrices.get(j).getText();
	    		Thread.sleep(2000);
	    		System.out.println(laptops+" : "+prices);
	    		
	    	}
	    }
	


	}

}
