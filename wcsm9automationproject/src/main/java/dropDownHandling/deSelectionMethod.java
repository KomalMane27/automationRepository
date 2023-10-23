package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectionMethod {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://demoapps.qspiders.com/");
			driver.findElement(By.xpath("//section[text()='Dropdown']")).click();//identify dropdown option and click
		   /* //identify ph.no dropdown
			WebElement dropDown1 = driver.findElement(By.xpath("//select[contains(@class,'transition-all duration-150 w-5/12')]"));
			Select sel = new Select(dropDown1);
			Thread.sleep(2000);
			sel.selectByIndex(2);//select the option
			//deSelection method
			driver.findElement(By.partialLinkText("Multi Select")).click();
			WebElement dropDown5 = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
			Select sel5 = new Select(dropDown5);
			Thread.sleep(2000);
			sel5.selectByIndex(2);//select option by using index
			Thread.sleep(2000);
			sel5.deselectByIndex(2);//deSelect option by using index*/
			
			Thread.sleep(2000);
			driver.navigate().to("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/multiSelectDropDown.html");
			WebElement dropDown4 = driver.findElement(By.id("idd"));
			Select sel4 = new Select(dropDown4);
			sel4.selectByIndex(5);
			//select multiple option from multiselect dropdown
			Thread.sleep(2000);
			sel4.deselectByIndex(5);
			for(int i=0;i<=5;i++) 
			{
				Thread.sleep(2000);
				sel4.selectByIndex(i);
			}
			Thread.sleep(2000);
			for(int i=0;i<=5;i++) 
			{
				Thread.sleep(2000);
				//sel4.deselectByIndex(i);
				sel4.deselectAll();
			}
		/*	Thread.sleep(2000);//select and deSelect by using value
			sel4.selectByValue("v2");
			Thread.sleep(2000);
			sel4.deselectByValue("v2");
			Thread.sleep(2000);//By using VisibleText
			sel4.selectByVisibleText("Shira");
			Thread.sleep(2000);
			sel4.deselectByVisibleText("Shira");
			*/
			
		}
}
