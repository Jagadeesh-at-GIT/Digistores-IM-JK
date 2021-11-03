package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects_006_RafflesDetailsPage {
	public WebDriver driver;
	public Objects_006_RafflesDetailsPage(WebDriver driver)
	{this.driver=driver;}
	By Rafflebanner= By.xpath("//body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/img[1]");
	By text_buyraffles=By.xpath("//span[contains(text(),'Buy Raffles')]");
	By text_Description=By.xpath("//span[contains(text(),'Description')]");
	By text_TandC=By.xpath("//span[contains(text(),'Terms and Conditions')]");
	By text_Buyrafflesection=By.xpath("//div[contains(text(),'Buy Raffles')]");
	By text_quantity =By.xpath("//div[contains(text(),'Quantity')]");
	By increase=By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[2]/img[1]");
	By decrease=By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/a[1]/img[1]");
	By loginNow=By.xpath("//button[contains(text(),'Login Now')]");
	By Paymentdetails=By.xpath("//div[contains(text(),'Payment Details')]");
	By text_raffletickets=By.xpath("//p[contains(text(),'Raffle Ticket')]");
	By text_payableamount=By.xpath("//p[contains(text(),'Payable Amount')]");
	

//These are the action methods of this base class
	public WebElement Rafflebanner()
	{
		return driver.findElement(Rafflebanner);
	}
	
	public WebElement text_buyraffles()
	{
		return driver.findElement(text_buyraffles);
	}
	public WebElement text_Description()
	{
		return driver.findElement(text_Description);
	}
	public WebElement text_TandC()
	{
		return driver.findElement(text_TandC);
	}
	
	public WebElement text_Buyrafflesection()
	{
		return driver.findElement(text_Buyrafflesection);
	}
	public WebElement text_quantity()
	{
		return driver.findElement(text_quantity);
	}
	public WebElement increase()
	{
		return driver.findElement(increase);
	}
	public WebElement decrease()
	{
		return driver.findElement(decrease);
	}
	
	public WebElement loginNow()
	{
		return driver.findElement(loginNow);
	}
	public WebElement Paymentdetails()
	{
		return driver.findElement(Paymentdetails);
	}
	public WebElement text_raffletickets()
	{
		return driver.findElement(text_Buyrafflesection);
	}
	public WebElement text_payableamount()
	{
		return driver.findElement(text_payableamount);
	}
	
	
	
}
