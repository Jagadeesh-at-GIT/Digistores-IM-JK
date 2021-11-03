package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects_004_VoucherDetailsPage {
	public WebDriver driver;
	public Objects_004_VoucherDetailsPage(WebDriver driver)
	{this.driver=driver;}
	By text_BuyVouchers=By.xpath("//span[contains(text(),'Buy Voucher')]");
	By text_Description=By.xpath("//span[contains(text(),'Description')]");
	By text_HowToRedeem=By.xpath("//span[contains(text(),'How to Redeem')]");
	By text_TandC=By.xpath("//span[contains(text(),'Terms and Conditions')]");
	By text_VoucherDetails=By.xpath("//h1[contains(text(),'Voucher Details')]");
	By text_cardamount=By.xpath("//h4[contains(text(),'Card Amount')]");
	By cardamountBox=By.xpath("//input[@placeholder='Enter voucher amount']");
	By text_amountrange=By.xpath("//div[@class='jp-cardamt-inputbox']/span");
	By text_offersandpayment=By.xpath("//h4[contains(text(),'Offers & Payment Options')]");
	By earnIntermiles=By.xpath("//span[contains(text(),'Earn InterMiles')]");
	By SWM= By.xpath("//div[contains(text(),'Save with Inter')]");
	By useMiles= By.xpath("//span[contains(text(),'USE MILES TO GET THIS FREE')]");
	By loginNow= By.xpath("//a[contains(text(),'Login Now')]");
	By text_paymentdetails=By.xpath("//div[contains(text(),'Payment Details')]");
	By text_voucheramount=By.xpath("//p[contains(text(),'Voucher Amount')]");
	By text_payableAmount=By.xpath("//b[contains(text(),'Payable Amount')]");
	By text_promocode=By.xpath("//h4[contains(text(),'Promo Code')]");
	By promocodeBox=By.xpath("//input[@placeholder='Enter code here']");
	By BuyNow=By.xpath("//a[contains(text(),'Buy Now')]");
	
//These are the action methods for this class
	public WebElement BuyNow() {
		return driver.findElement(BuyNow);
	}
	
	public WebElement text_BuyVouchers() {
		return driver.findElement(text_BuyVouchers);
	}
	public WebElement text_Description() {
		return driver.findElement(text_Description);
	}
	public WebElement text_HowToRedeem() {
		return driver.findElement(text_HowToRedeem);
	}
	public WebElement text_TandC() {
		return driver.findElement(text_TandC);
	}
	public WebElement text_VoucherDetails() {
		return driver.findElement(text_HowToRedeem);
	}
	public WebElement text_cardamount() {
		return driver.findElement(text_TandC);
	}
	public WebElement cardamountBox() {
		return driver.findElement(cardamountBox);
	}
	public WebElement text_amountrange() {
		return driver.findElement(text_amountrange);
	}
	public WebElement text_offersandpayment() {
		return driver.findElement(text_offersandpayment);
	}
	public WebElement earnIntermiles() {
		return driver.findElement(earnIntermiles);
	}
	public WebElement SWM() {
		return driver.findElement(SWM);
	}
	public WebElement useMiles() {
		return driver.findElement(useMiles);
	}
	public WebElement loginNow() {
		return driver.findElement(loginNow);
	}
	public WebElement text_paymentdetails() {
		return driver.findElement(text_paymentdetails);
	}
	public WebElement text_voucheramount() {
		return driver.findElement(text_voucheramount);
	}
	public WebElement text_payableAmount() {
		return driver.findElement(text_payableAmount);
	}
	public WebElement text_promocode() {
		return driver.findElement(text_promocode);
	}
	public WebElement promocodeBox() {
		return driver.findElement(promocodeBox);
	}

}
