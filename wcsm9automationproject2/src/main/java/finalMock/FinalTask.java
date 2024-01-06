package finalMock;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class FinalTask {
	public static void main(String[] args) {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev/");
	TakesScreenshot ts = (TakesScreenshot)driver;
           File src = ts.getScreenshotAs(OutputType.FILE);
           File dest = new File("./Screenshots/selenium.png");
           
	}

}
