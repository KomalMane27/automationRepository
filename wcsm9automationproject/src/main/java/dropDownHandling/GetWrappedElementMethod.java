package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/manes/OneDrive/Desktop/wcsm9webElement/singleSelectDropdown.html");
		WebElement dropDown1 = driver.findElement(By.id("idd"));//single select dropDown
		Select sel = new Select(dropDown1);
		WebElement allops = sel.getWrappedElement();
		System.out.println(allops.getText());
		
		List<WebElement> option = sel.getOptions();
		//select the option from dropdown without using selection method

		for(WebElement op:option)
		{
			Thread.sleep(2000);
			if(op.getText().equals("Vadapav"))
			{
				op.click();
				break;
			}
			//System.out.println(op.getText());
		}
		
	}

}
