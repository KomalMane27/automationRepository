package synchronizationPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartiphone {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();

		//get the address of parent window
        String parentHandle=driver.getWindowHandle();

		driver.findElement(By.xpath("(//div[@class='col col-5-12 nlI3QM'])[2]")).click();
		//get the address of all the wimdows

        Set<String> allHandles = driver.getWindowHandles();

        for(String wh:allHandles)
        {
        	if(!parentHandle.equals(wh))

        	{

        		driver.switchTo().window(wh);
        		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

		//WebElement ele= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='kmlXmn']")));

			//ele.click();	

		driver.findElement(By.xpath("//a[@class='kmlXmn']")).click();//color change

		driver.findElement(By.xpath("//a[@class='_1fGeJ5']")).click();//storage change

		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("411335");//pincode

		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();//check button

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();//add to cart button

		driver.findElement(By.xpath("//div[@class='_3fSRat']")).click();//remove from add to cart


        	}

        }
        
	}
}
