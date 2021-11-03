package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects_007_HeaderFooter {
	public WebDriver driver;
	public Objects_007_HeaderFooter(WebDriver driver)
	{this.driver=driver;}

	By Login=By.xpath("//a[@id='jp-adobe-login']");
	By userwelcome=By.xpath("//span[contains(text(),'Hi')]");
	
	public WebElement login()
	{return driver.findElement(Login);}
	
	public WebElement userwelcome()
	{return driver.findElement(userwelcome);}
	
}
