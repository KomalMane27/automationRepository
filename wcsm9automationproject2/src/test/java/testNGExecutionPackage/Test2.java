package testNGExecutionPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  
  @Test
  public void metod1() {
	  Reporter.log("method1 from test2 class", true);
  }
  @Test
  public void metod2() {
	  int a=4;
	  int b=1;
	  int res=a/b;
	  Reporter.log("method2 from test2 class"+res, true);
  }
}
