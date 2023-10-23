package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();//identify dropdown option and click
		//identify ph.no dropdown
		WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/12')]"));
		Select sel = new Select(dropDown1);
		Thread.sleep(2000);
		sel.selectByIndex(2);//select the option
		//identify country dropdown
		WebElement dropDown2 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel2 = new Select(dropDown2);
		Thread.sleep(2000);
		sel2.selectByIndex(1);
		//identify state dropDown
		WebElement dropDown3 = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select sel3 = new Select(dropDown3);
		Thread.sleep(2000);
		sel3.selectByVisibleText("Maharashtra");
		
		//MultiSelect
		Thread.sleep(2000);
		driver.navigate().to("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/multiSelectDropDown.html");
		WebElement dropDown4 = driver.findElement(By.id("idd"));
		Select sel4 = new Select(dropDown4);
		sel4.selectByIndex(5);
		//select multiple option from multiselect dropdown
		Thread.sleep(2000);
		for(int i=0;i<=5;i++) 
		{
			sel4.selectByIndex(i);
		}
		Thread.sleep(2000);
		driver.navigate().to("http://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.partialLinkText("Multi Select")).click();
		WebElement dropDown5 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select sel5 = new Select(dropDown5);
		sel5.selectByIndex(2);
		Thread.sleep(2000);
		for(int i=0;i<=5;i++)
		{
			sel5.selectByIndex(i);
		}	
			
			
	}
}
