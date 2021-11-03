package com.digistores.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.digistores.pageojects.Objects_001_LoginPage;
import com.digistores.pageojects.Objects_002_Homepage;
import com.digistores.pageojects.Objects_003_VouchersPage;
import com.digistores.pageojects.Objects_004_VoucherDetailsPage;
import com.digistores.pageojects.Objects_007_HeaderFooter;

public class TC_004_AccrualPayment extends BaseClass {
	
	@Test
	public void AccrualPayment() throws InterruptedException, IOException {
		Objects_002_Homepage A= new Objects_002_Homepage(driver);
		Objects_003_VouchersPage B= new Objects_003_VouchersPage(driver);
		Objects_004_VoucherDetailsPage C=new Objects_004_VoucherDetailsPage(driver);
		Objects_007_HeaderFooter D =new Objects_007_HeaderFooter(driver);
		D.login().click();
		Objects_001_LoginPage E=new Objects_001_LoginPage(driver);
		E.username().sendKeys(username);
		E.password().sendKeys(password);
		E.login().click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",A.quiklinks_text());
		A.vouchers().click();
		Set<String> tabs=driver.getWindowHandles();
		Iterator<String> it=tabs.iterator();
		String tab1=it.next();
		String tab2=it.next();
		driver.switchTo().window(tab2);
		B.searchbox().sendKeys("Flipkart");
		driver.findElement(By.xpath("//div[contains(text(),'Flipkart')]")).click();
		B.searchfirsttile().click();
		Thread.sleep(5000);
		Set<String> tabs2=driver.getWindowHandles();
		Iterator<String> it2=tabs2.iterator();
		String tab=it2.next();
		String tab_1=it2.next();
		String tab_2=it2.next();
		driver.switchTo().window(tab_2);
		C.earnIntermiles().click();
		C.BuyNow().click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[contains(text(),'Netbanking')]")));
		driver.findElement(By.xpath("//div[contains(text(),'Netbanking')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='bank-radio-HDFC']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'Success')]")).click();
		Thread.sleep(3000);
		captureScreen(driver,"Accrual Success");
		
	}

}
