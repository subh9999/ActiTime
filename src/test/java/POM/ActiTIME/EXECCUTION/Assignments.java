package POM.ActiTIME.EXECCUTION;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.ActiTIME.generic.BASETEST_MAVEN1;
import POM.ActiTIME.generic.IMPLIMENTATTION_MAVEN1;

public class Assignments extends BASETEST_MAVEN1
{
	@Test
  public void ActiTIME_LOGIN() throws IOException
  {
	  IMPLIMENTATTION_MAVEN1 one=new IMPLIMENTATTION_MAVEN1(driver);
	  one.actiTimeLogin();
  }
	
	@Test(enabled=false)
	public void create_delete_customer() throws IOException, InterruptedException 
	{
		 IMPLIMENTATTION_MAVEN1 two=new IMPLIMENTATTION_MAVEN1(driver);
		  two.CREATE_CUSTOMER();
	}
	
	@Test
	public void  create_delete_work() throws IOException
	{
		IMPLIMENTATTION_MAVEN1 three=new IMPLIMENTATTION_MAVEN1(driver);	
		three.create_work();
	}
	@Test(enabled=false)
	public void create_delete_leave() throws IOException, InterruptedException
	{
		IMPLIMENTATTION_MAVEN1 four=new IMPLIMENTATTION_MAVEN1(driver);
		four.leave();
	}
	
}
