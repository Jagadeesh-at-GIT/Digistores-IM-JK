package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class Objects_001_LoginPage {

	public WebDriver driver; // local driver of this object class
	
	//The below method is constructor to give life to the driver of this object class
	
	public Objects_001_LoginPage(WebDriver driver)
	{this.driver=driver;}
	
	//**There are different ways by which we can capture webelements
	
	// Firstly by using "BY" keyword
	By header_login =By.xpath("//a[@id='jp-adobe-login']");
	//By userName=By.cssSelector("#userName");
	//By userName=By.cssSelector("[id='usrName']");
	By password=By.xpath("//input[@id='password']");
	By login = By.xpath("//button[contains(text(),'Login')]");
	
	//Secondly by FindBy keyword
	By forgot_password= By.xpath("//a[@id='fp-link']");
	//@FindBy(xpath="//a[@id='fp-link']")WebElement forgot_password;
	By username =By.xpath("//input[@id='userName']");
	//@FindBy(xpath="//input[@id='userName']")WebElement username;
	
	//@FindBy(xpath="//a[contains(text(),'Sign up now!')]")WebElement signup;
	By signup= By.xpath("//a[contains(text(),'Sign up now!')]");
	
	//These are the action methods of the elements present in the login page
	
	//the below are methods for which By keyword is used
	public WebElement headerLogin()
	{return driver.findElement(header_login);}
	
	public WebElement password()
	{return driver.findElement(password);}
	
	public WebElement login()
	{return driver.findElement(login);}
	
	//the below are methods for Findby keyword webelements
	
	//public WebElement forgotPassword(){return forgot_password;}
	
	//public WebElement signup(){return signup;}
	
	public WebElement forgotPassword(){return driver.findElement(forgot_password);}
	public WebElement signup(){return driver.findElement(signup) ;}
	public WebElement username(){return driver.findElement(username);}
}
