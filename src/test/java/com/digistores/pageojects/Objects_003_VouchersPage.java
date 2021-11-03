package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects_003_VouchersPage {
	WebDriver driver;
	public Objects_003_VouchersPage(WebDriver driver)
	{this.driver=driver;}
	By first_banner = By.xpath("//ul/li[1]/div/div[@class='carousel_slide_block']");
	By second_banner = By.xpath("//ul/li[2]/div/div[@class='carousel_slide_block']");
	By third_banner = By.xpath("//ul/li[3]/div/div[@class='carousel_slide_block']");
	By next_banner = By.xpath("//div[@class='jp-page-wrap']/div/div/div/div/button[@aria-label='Go to next slide']");
	By previous_banner = By
			.xpath("//div[@class='jp-page-wrap']/div/div/div/div/button[@aria-label='Go to previous slide']");
	By text_AllVouchers= By.xpath("//h1[contains(text(),'All Vouchers')]");
	
	By text_AvailableVouchers= By.xpath("//h2[contains(text(),'Vouchers Available')]");
	By text_Filters=By.xpath("//span[contains(text(),'Filters')]");
	By reset=By.xpath("//b[contains(text(),'Reset')]");
	By text_Search=By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/p[1]");
	By search_Expansion=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/span[1]/div[1]");
	By text_popularfilters=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]");
	By popularfilters_Expansion=By.xpath("//body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/span[1]/div[1]/img[1]");
	By text_filterbycategories=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/p[1]");
	By filterbycategories_Expansion=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]/span[1]/div[1]/img[1]");
	By text_filterbybrand=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[4]/div[3]/div[1]/div[1]/p[1]");
	By filterbybrand_expansion=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[4]/div[3]/div[1]/div[2]/span[1]/div[1]/img[1]");
	By firstcoupon=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/img[1]");
	By text_filterbycategoriesonPage=By.xpath("//h3[contains(text(),'Filter By Categories')]");
	By filterbycategoriesPage_carousel=By.xpath("//div[@class='Carousel container nested_carousel']/button[(@type='button')]");
	By searchfirsttile=By.xpath("//div[@class='jp-category-all-gift-cards']/div/div[1]");
	By searchbox=By.xpath("//input[@id='search-flyout-mobile-input']");
	
	// These are action methods
	public WebElement searchbox() {
		return driver.findElement(searchbox);
	}
	public WebElement searchfirsttile() {
		return driver.findElement(searchfirsttile);
	}
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
	
	public WebElement text_Allvouchers() {
		return driver.findElement(text_AllVouchers);
	}
	public WebElement text_AvailableVouchers() {
		return driver.findElement(text_AvailableVouchers);
	}

	public WebElement text_Filters() {
		return driver.findElement(text_Filters);
	}
	
	public WebElement reset() {
		return driver.findElement(reset);
	}
	
	public WebElement text_Search() {
		return driver.findElement(text_Search);
	}

	public WebElement search_Expansion() {
		return driver.findElement(search_Expansion);
	}
	
	public WebElement text_popularfilters() {
		return driver.findElement(text_popularfilters);
	}
	
	public WebElement popularfilters_Expansion() {
		return driver.findElement(popularfilters_Expansion);
	}

	public WebElement text_filterbycategories() {
		return driver.findElement(text_filterbycategories);
	}
	
	public WebElement filterbycategories_Expansion() {
		return driver.findElement(filterbycategories_Expansion);
	}
	public WebElement text_filterbybrand() {
		return driver.findElement(text_filterbybrand);
	}
	
	public WebElement filterbybrand_expansion() {
		return driver.findElement(filterbybrand_expansion);
	}
	
	public WebElement firstcoupon() {
		return driver.findElement(firstcoupon);
	}

	public WebElement text_filterbycategoriesonPage() {
		return driver.findElement(text_filterbycategoriesonPage);
	}
	
	public WebElement filterbycategoriesPage_carousel() {
		return driver.findElement(filterbycategoriesPage_carousel);
	}

}
