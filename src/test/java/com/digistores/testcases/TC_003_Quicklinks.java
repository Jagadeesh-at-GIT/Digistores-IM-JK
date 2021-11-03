package com.digistores.testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.digistores.pageojects.Objects_002_Homepage;
import com.digistores.pageojects.Objects_003_VouchersPage;

public class TC_003_Quicklinks extends BaseClass {
	
	
	@Test
	public void Qvoucher() throws InterruptedException {
		Objects_002_Homepage A= new Objects_002_Homepage(driver);
		Objects_003_VouchersPage B= new Objects_003_VouchersPage(driver);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",A.quiklinks_text());
		A.vouchers().click();
		Thread.sleep(2000);
		A.deals().click();
		Thread.sleep(2000);
		//Open a new tab using Ctrl + t
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		//Switch between tabs using Ctrl + \t
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		//ArrayList tabs =new ArrayList(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(1));
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		String tab1 = it.next();
		String tab2 = it.next();
		String tab3 = it.next();
		driver.switchTo().window(tab3);
		if(B.text_Allvouchers().isDisplayed()){System.out.println("Vouchers quiklink is working");};
		driver.close();
		driver.switchTo().window(tab2);
		//if(B.text_Allvouchers().isDisplayed()){System.out.println("Deals quiklink is working");};
		driver.close();
	}
	

}
