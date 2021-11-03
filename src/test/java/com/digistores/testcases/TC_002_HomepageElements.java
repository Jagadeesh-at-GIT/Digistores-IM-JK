package com.digistores.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.digistores.pageojects.Objects_002_Homepage;

public class TC_002_HomepageElements extends BaseClass {
	
	
	@Test
	public void banner() throws InterruptedException {
		Objects_002_Homepage A= new Objects_002_Homepage(driver);
		
		//if(A.first_banner().isDisplayed())
		//{System.out.println("Banners are displayed");}
		//else {System.out.println("Banners are not displayed");}
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",A.first_banner());
		//A.next_banner().click();
		Thread.sleep(100);
		//A.previous_banner().click();
		Thread.sleep(2000);
		logger.info("Banner section is working");	
	}
	@Test
	public void quiklinks() throws InterruptedException {
		Objects_002_Homepage A= new Objects_002_Homepage(driver);
		if(A.quiklinks_text().isDisplayed())
		{System.out.println("Quiklinks text is displayed");}
		else {System.out.println("Quiklinks text is not displayed");}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",A.quiklinks_text());
		A.Carousel_next().click();
		Thread.sleep(2000);
		A.Carousel_previous().click();
		Thread.sleep(2000);
		logger.info("quiklinks carousel is working");
	}
	
	@Test
	public void VouchersSection() throws InterruptedException {
		Objects_002_Homepage A= new Objects_002_Homepage(driver);
		if(A.vouchers_text().isDisplayed())
		{System.out.println("Vouchers text is displayed");}
		else {System.out.println("Vouchers text is not displayed");}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",A.vouchers_text() );
		A.Vouchers_next().click();
		Thread.sleep(2000);
		A.Vouchers_previous().click();
		logger.info("Vouchers carousel is working");
		Thread.sleep(2000);
	}
	//body/div[@id='__next']/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[2]
	//body/div[@id='__next']/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/button[2]
	
	@Test
	public void TravelVouchersSection() throws InterruptedException {
		Objects_002_Homepage A= new Objects_002_Homepage(driver);
		if(A.TravelVouchers_Text().isDisplayed())
		{System.out.println("Travel Vouchers text is displayed");}
		else {System.out.println("Travel Vouchers text is not displayed");}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",A.TravelVouchers_Text());
		A.T_Vouchers_next().click();
		Thread.sleep(2000);
		A.T_Vouchers_previous().click();
		Thread.sleep(2000);
		logger.info("Travel Vouchers carousel is working");
	}
	
	

}
