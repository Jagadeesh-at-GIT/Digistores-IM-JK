package com.digistores.pageojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects_005_Rafflespage {
	public WebDriver driver;
	public Objects_005_Rafflespage(WebDriver driver)
	{this.driver=driver;}
	By first_banner = By.xpath("//ul/li[1]/div/div[@class='carousel_slide_block']");
	By second_banner = By.xpath("//ul/li[2]/div/div[@class='carousel_slide_block']");
	By third_banner = By.xpath("//ul/li[3]/div/div[@class='carousel_slide_block']");
	By next_banner = By.xpath("//div[@class='jp-page-wrap']/div/div/div/div/button[@aria-label='Go to next slide']");
	By previous_banner = By
			.xpath("//div[@class='jp-page-wrap']/div/div/div/div/button[@aria-label='Go to previous slide']");
	By AllRaffles = By.xpath("//span[contains(text(),'All Raffles')]");
	By Rafflewinners= By.xpath("//span[contains(text(),'Raffle Winners')]");
	By Myrafflewins=By.xpath("//span[contains(text(),'My Raffle Wins')]");
	By firstraffle= By.xpath("//body/div[@id='__next']/div[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/img[1]");
	By Merchandise=By.xpath("//span[contains(text(),'Merchandise')]");
	By winnersmonth=By.xpath("//p[contains(text(),'Raffle Winners announced in ')]");
	By Miles=By.xpath("//a[@aria-label='Miles']");
	By previouswinners=By.xpath("//div[contains(text(),'View Previous Raffle Winners')]");
	
	
	
	
//These are the methods of this pbject class	
	
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
	public WebElement AllRaffles() {
		return driver.findElement(AllRaffles);
	}

	public WebElement Rafflewinners() {
		return driver.findElement(Rafflewinners);
	}
	public WebElement Myrafflewins() {
		return driver.findElement(Myrafflewins);
	}

	public WebElement firstraffle() {
		return driver.findElement(firstraffle);
	}
	public WebElement Merchandise() {
		return driver.findElement(Merchandise);
	}

	public WebElement winnersmonth() {
		return driver.findElement(winnersmonth);
	}
	public WebElement Miles() {
		return driver.findElement(Miles);
	}

	public WebElement previouswinners() {
		return driver.findElement(previouswinners);
	}


}
