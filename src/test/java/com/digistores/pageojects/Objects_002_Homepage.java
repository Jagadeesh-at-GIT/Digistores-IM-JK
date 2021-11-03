package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects_002_Homepage {
	public WebDriver driver;
	public Objects_002_Homepage(WebDriver driver)
	{this.driver=driver;}
	By first_banner = By.xpath("//ul/li[1]/div/div[@class='carousel_slide_block']");
	By second_banner = By.xpath("//ul/li[2]/div/div[@class='carousel_slide_block']");
	By third_banner = By.xpath("//ul/li[3]/div/div[@class='carousel_slide_block']");
	By next_banner = By.xpath("//div[@class='jp-page-wrap']/div/div/div/div/button[@aria-label='Go to next slide']");
	By previous_banner = By  
			.xpath("//div[@class='jp-page-wrap']/div/div/div/div/button[@aria-label='Go to previous slide']");
	By vouchers = By.xpath("//div[@class='Carousel__trackContainer']/ul/li/a/div/h2[text()='Vouchers']");
	By raffles = By.xpath("//div[@class='Carousel__trackContainer']/ul/li/a/div/h2[text()='Raffles']");
	By deals = By.xpath("//div[@class='Carousel__trackContainer']/ul/li/a/div/h2[text()='Deals']");
	By co_brand = By.xpath("//div[@class='Carousel__trackContainer']/ul/li/a/div/h2[text()='Co-Brand Offers']");
	By Carousel_next = By.xpath("//div[@class='quick-link-carousel']/div/button[@aria-label='Go to next slide']");
	By Carousel_previous = By
			.xpath("//div[@class='quick-link-carousel']/div/button[@aria-label='Go to previous slide']");
	By Vouchers_next = By
			.xpath("//div[@class='jp-col-lg-10 ']/div[3]/div[2]/div[1]/div[1]/button[@aria-label='Go to next slide']");
	By Vouchers_previous = By.xpath(
			"//div[@class='jp-col-lg-10 ']/div[3]/div[2]/div[1]/div[1]/button[@aria-label='Go to previous slide']");
	By T_Vouchers_next = By
			.xpath("//div[@class='jp-col-lg-10 ']/div[2]/div[2]/div/div/button[@aria-label='Go to next slide']");
	By T_Vouchers_previous = By.xpath(
			"//div[@class='jp-col-lg-10 ']/div[2]/div[2]/div/div/button[@aria-label='Go to previous slide']");
	By Deals_next = By
			.xpath("//div[@class='jp-col-lg-10 ']/div[4]/div[1]/div[1]/div[1]/button[@aria-label='Go to next slide']");
	By Deals_previous = By.xpath(
			"//div[@class='jp-col-lg-10 ']/div[4]/div[1]/div[1]/div[1]/button[@aria-label='Go to previous slide']");
	By quiklinks_text=By.xpath("//h1[contains(text(),'Quick links')]");
	By vouchers_text=By.xpath("//body/div[@id='__next']/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/h2[1]");
	By TravelVouchers_Text=By.xpath("//h2[contains(text(),'Travel Vouchers')]");
	
//Action methods for this objects class
	
	public WebElement first_banner() {
		return driver.findElement(first_banner);
	}

	public WebElement second_banner() {
		return driver.findElement(second_banner);
	}
	
	public WebElement third_banner() {
		return driver.findElement(third_banner);
	}
	
	public WebElement next_banner() {
		return driver.findElement(next_banner);
	}

	public WebElement previous_banner() {
		return driver.findElement(previous_banner);
	}

	public WebElement vouchers() {
		return driver.findElement(vouchers);
	}

	public WebElement raffles() {
		return driver.findElement(raffles);
	}

	public WebElement deals() {
		return driver.findElement(deals);
	}

	public WebElement co_brand() {
		return driver.findElement(co_brand);
	}

	public WebElement Carousel_next() {
		return driver.findElement(Carousel_next);
	}

	public WebElement Carousel_previous() {
		return driver.findElement(Carousel_previous);
	}

	public WebElement Vouchers_next() {
		return driver.findElement(Vouchers_next);
	}

	public WebElement Vouchers_previous() {
		return driver.findElement(Vouchers_previous);
	}

	public WebElement T_Vouchers_next() {
		return driver.findElement(T_Vouchers_next);
	}

	public WebElement T_Vouchers_previous() {
		return driver.findElement(T_Vouchers_previous);
	}

	public WebElement Deals_next() {
		return driver.findElement(Deals_next);
	}

	public WebElement Deals_previous() {
		return driver.findElement(Deals_previous);
	}
	
	public WebElement quiklinks_text() {
		return driver.findElement(quiklinks_text);
	}
	public WebElement vouchers_text() {
		return driver.findElement(vouchers_text);
	}
	
	public WebElement TravelVouchers_Text() {
		return driver.findElement(TravelVouchers_Text);
	}
}
