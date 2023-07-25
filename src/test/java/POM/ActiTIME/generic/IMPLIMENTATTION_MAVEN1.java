package POM.ActiTIME.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class IMPLIMENTATTION_MAVEN1 extends BASE_PAGE_MAVEN implements AUTOCONSTANT_MAVEN
{
	  public  WebDriver driver;
		
			@FindBy(id = "username")
			private WebElement usernameTextfield;
			
			@FindBy(name = "pwd")
			private WebElement passwordTextfield;
			
			@FindBy(id = "loginButton")
			private WebElement loginButton;
			
			@FindBy(xpath = "//a[.='Logout']")
			private WebElement logoutbuttom;
			
			@FindBy(xpath = "//div[.='Tasks']")
			private WebElement taskbuttom;
			
			@FindBy(xpath = "//div[.='Add New']")
			private WebElement addnewdropdown;
			
			@FindBy(xpath = "//div[.='+ New Customer']")
			private WebElement newcustomer;
			
			@FindBy(xpath = "//input[@class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
			private WebElement entercustomerfield;
			
			@FindBy(xpath = "//textarea[@placeholder=\"Enter Customer Description\"]")
			private WebElement enterdescriptionfield;
			
			@FindBy(xpath = "//div[.='Create Customer']")
			private WebElement createcustomerbuttom;
			
			@FindBy(xpath = "(//div[@class=\"menu_icon\"])[2]")
			private WebElement settingbuttom;
			
			@FindBy(xpath = "//a[.='Types of Work']")
			private WebElement typeofworkbuttom;
			
			@FindBy(xpath = "//span[.='Create Type of Work']")
			private WebElement createtypeofworkbuttom;
			
			@FindBy(xpath = "//input[@name=\"name\"]")
			private WebElement nametextfield;
			
			@FindBy(xpath = "//input[@value=\"   Create Type of Work   \"]")
			private WebElement createtypeofworksummit;
			
			@FindBy(xpath = "//a[.='smruti']/../..//a[contains(text(),'delete')]")
			private WebElement deletetypeofwork;
			
			@FindBy(xpath = "(//div[.='subhra'])[1]/../..//div[@class=\"editButton\"]")  //
			private WebElement CustomerEditButton;
			
			@FindBy(xpath = "//div[@class=\"editCustomerPanelHeader\"]//div[.='ACTIONS']")
			private WebElement ActionButton;
			
			@FindBy(xpath = "//div[@class=\"taskManagement_customerPanel\"]//div[.='Delete']")
			private WebElement DeleteCustomerButton;
			
			@FindBy(xpath = "//span[.='Delete permanently']")
			private WebElement DeletePermanentlyButton;
			
			@FindBy(xpath = "//a[.='Leave Types']")
			private WebElement leavetype;
			
			@FindBy(xpath = "//span[.='Create Leave Type']")
			private WebElement createleavetype;
			
			@FindBy(xpath = "//input[@placeholder=\"Leave Type Name\"]")
			private WebElement leavetypetextfield;
			
			@FindBy(xpath = "//span[.='Create Leave Type']")
			private WebElement summitleavetype;
			
			@FindBy(xpath = "//span[.='prema']/../../../../../..//td[@class=\"leaveTypeDeleteCell last\"]")
			private WebElement deleteleave;
			
			public IMPLIMENTATTION_MAVEN1(WebDriver driver)//login & logout
			{
				this.driver=driver;
				PageFactory.initElements(driver,this);
			}
			
			public void actiTimeLogin() throws IOException
			{
				heightlight_MAVEN.helper(driver,  usernameTextfield);
			    usernameTextfield.sendKeys( EXCELLIBRARY_MAVEN.CELLVALUE(sheet,6,1));
			    
			    heightlight_MAVEN.helper(driver, passwordTextfield);
			    passwordTextfield.sendKeys( EXCELLIBRARY_MAVEN.CELLVALUE(sheet , 7 ,1));
			    
			    javaclick(driver,loginButton);
			    
//			    compare(driver, "Enter Time-Track");		   
//			    delay(driver,logoutbuttom);
//			    javaclick(driver,logoutbuttom);
			}
			public void CREATE_CUSTOMER() throws IOException//login & create customer & delete customer & logout
, InterruptedException
			{
				delay(driver,taskbuttom);
				javaclick(driver,taskbuttom);
				javaclick(driver,addnewdropdown);
				javaclick(driver,newcustomer);
				
				heightlight_MAVEN.helper(driver,entercustomerfield);
				entercustomerfield.sendKeys( EXCELLIBRARY_MAVEN.CELLVALUE(sheet, 8, 1));
				
				heightlight_MAVEN.helper(driver,enterdescriptionfield);
				enterdescriptionfield.sendKeys( EXCELLIBRARY_MAVEN.CELLVALUE(sheet, 9, 1));
				
				javaclick(driver,createcustomerbuttom);
				
				javaclick(driver,CustomerEditButton);
				
				javaclick(driver,ActionButton);
				
				javaclick(driver,DeleteCustomerButton);
				
				javaclick(driver,DeletePermanentlyButton);
//				alertaccept_one(driver);
//				Thread.sleep(4000);
				
				javaclick(driver,logoutbuttom);
			}
			
			public void create_work() throws IOException//login & create work & delete work &logout
			{
				delay(driver,settingbuttom);//SYNCRONISATION
				javaclick(driver,settingbuttom);
				javaclick(driver,typeofworkbuttom);
				javaclick(driver,createtypeofworkbuttom);
				
				heightlight_MAVEN.helper(driver,nametextfield );
				nametextfield.sendKeys( EXCELLIBRARY_MAVEN.CELLVALUE(sheet, 10, 1));
				
				javaclick(driver,createtypeofworksummit);
				
				delay(driver,createtypeofworksummit);
				javaclick(driver,deletetypeofwork);
				alertaccept_one(driver);
				//driver.switchTo().alert().accept();
				
				javaclick(driver,logoutbuttom);
			
			}
			
			public void leave() throws IOException, InterruptedException //create leave&delete leave&logout
			{
				delay(driver,settingbuttom);
				javaclick(driver,settingbuttom);
				javaclick(driver,leavetype);
				Thread.sleep(30);
				javaclick(driver,createleavetype);
				
				heightlight_MAVEN.helper(driver,leavetypetextfield);
				leavetypetextfield.sendKeys( EXCELLIBRARY_MAVEN.CELLVALUE(sheet, 11, 1));
				
				javaclick(driver,deleteleave);
				driver.switchTo().alert().accept();
				javaclick(driver,logoutbuttom);
				
				compare(driver, "Enter Time-Track");
				
			}
}
