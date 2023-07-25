package POM.ActiTIME.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BASETEST_MAVEN1 implements AUTOCONSTANT_MAVEN
{
	public WebDriver driver;
   @BeforeSuite
   public void start()
   {
	   System.out.println("EXECUTION START");
   }
   
   @BeforeClass
   public void setup()
   {
	   ChromeOptions option=new ChromeOptions();
	   option.addArguments("--remote-allow-origins=*");
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver(option);
	   driver.get(url);
   }
   
//   @AfterClass
//   public void close()
//  {
//		driver.close();	   
//  }
//   
   @BeforeSuite
   public void End()
   {
	   System.out.println("EXECUTION END");
   }
   
}
