package POM.ActiTIME.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BASE_PAGE_MAVEN 
{
	 //SELECT
		public void selecttext_one(WebElement element, String text)
		{
			Select select=new Select(element);
			select.selectByVisibleText(text);
		}
		
		//Action
		public  void mpovetoelement_one(WebDriver driver,WebElement element)
		{
			Actions action=new Actions(driver);
			action.moveToElement(element).perform();
		}
		
		//ROBOT
		public void robot() throws AWTException
		{
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		//ALERT
		public void alertaccept_one(WebDriver driver)
		{
		 driver.switchTo().alert().accept();
		}
		public void allertvalue_one(WebDriver driver,String text)
		{
			driver.switchTo().alert().sendKeys(text);
		}
		
		//JAVASCRIPT
		public void javaclick(WebDriver driver,WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",element);
		}
		
		//TITLE COMPARE
		public void compare(WebDriver driver, String text)
		{
			String title=driver.getTitle();
			System.out.println(title);
			if(title.contains(text))
			{
				System.out.println("TITLE MATCHING");
			}
			else
			{
				System.out.println("TITLE NOT MATCHING");
			}
		}
		
		//SYNCRIONISATION
		public void delay(WebDriver driver ,WebElement element)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
			
		}
	//hoe to perform conformationpopup???
