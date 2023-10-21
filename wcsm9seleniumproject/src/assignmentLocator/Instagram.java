package assignmentLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		//identify usernameTextBox and pass inputs
        driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("komal22_27");
        //identify passwordTextBox and pass inputs
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("123456");
		//indentify loginButton and click()
		driver.findElement(By.xpath("//button[contains(@class,'_acan _acap _acas _aj1-')]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();

		Thread.sleep(2000);
		driver.quit();
		
	}

}
