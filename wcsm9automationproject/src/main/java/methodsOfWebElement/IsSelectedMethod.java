package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	//Verify check box on login page selected or not
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://komalmane/login.do");
		WebElement checkBoxElement=driver.findElement(By.id("keepLoggedInCheckBox"));
		 boolean status=checkBoxElement.isSelected();
		System.out.println(status);
	}

}
