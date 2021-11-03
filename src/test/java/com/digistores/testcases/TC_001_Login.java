package com.digistores.testcases;

import org.testng.annotations.Test;

import com.digistores.pageojects.Objects_001_LoginPage;
import com.digistores.pageojects.Objects_007_HeaderFooter;

public class TC_001_Login extends BaseClass {

	@Test
	public void login()
	{
		logger.info("Digistores site is launched");
		Objects_007_HeaderFooter A =new Objects_007_HeaderFooter(driver);
		A.login().click();
		logger.info("Redirecting to login page");
		Objects_001_LoginPage B=new Objects_001_LoginPage(driver);
		B.username().sendKeys(username);	
		B.password().sendKeys(password);
		B.login().click();
		if(A.userwelcome().isDisplayed())
		{logger.info("User is successfully logged in");}
		else
		{logger.info("LoginFailed");
		}	
	}
	 
}
