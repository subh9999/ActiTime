package POM.ActiTIME.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class heightlight_MAVEN
{
  public static void helper(WebDriver driver,WebElement element)
  {
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].setAttribute('style','background:pink')",element);
  }
}

//JavascriptExecutor js=(JavascriptExecutor)driver;
//js.executeScript("arguments[0].setAttribute('style' , 'background:red')", element);
//Thread.sleep(3000);
//js.executeScript("arguments[0].setAttribute('style' , 'background:white')", element);
//}
//}