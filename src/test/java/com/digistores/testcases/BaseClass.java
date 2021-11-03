package com.digistores.testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

import com.digistores.utilities.ReadConfig;

//*This is base class which will be part of every test case. We will code setup, tear down in this class.
//*We also code most used methods in this class

public class BaseClass {

ReadConfig readconfig=new ReadConfig(); //*we created object of readconfig utility file. 
//*This object is used to read the parameters from config.properties file.

public static WebDriver driver; //* initializing driver  for first time.
public static Logger logger;
public String browser =readconfig.getBrowser();
//* getting the browser data form properties file
public String URL= readconfig.getApplicationURL();
public String username=readconfig.getUsername();
public String password=readconfig.getPassword();
@BeforeClass
public void setup() {
	
	logger = Logger.getLogger(getClass());
	PropertyConfigurator.configure("log4j.properties");
	
	//* These above two statements are used to create logs in each test case.
	//*---------------------------------------------------------------------------*//
	//*The below code is to invoke browser.
	if(browser.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		driver=new ChromeDriver();
		//* giving life to browser
	}
	else if(browser.equals("Firefox"))
	{
	System.setProperty("webdriver.gecko.river", readconfig.getFirefoxPath());
	driver= new FirefoxDriver();	
	}
	
	//*---------------------------------------------------------------------------*//
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	//* This is used for implicitly waiting if the thread is struck or any other reason
	
	//*---------------------------------------------------------------------------*//
	//*This is used launch the base url
	driver.manage().window().maximize();
    driver.get(URL);
}

@AfterClass
public void tearDown()
{
	driver.quit();
	logger.info("The test is completed");
}
// The below code is for capturing screenshot
public void captureScreen(WebDriver driver, String tname) throws IOException {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	FileUtils.copyFile(source, target);
	System.out.println("Screenshot taken");
}
// The below code is for generating randomstring and random numbers
public String randomestring()
{
	String generatedstring=RandomStringUtils.randomAlphabetic(8);
	return(generatedstring);
}

public static String randomeNum() {
	String generatedString2 = RandomStringUtils.randomNumeric(4);
	return (generatedString2);
}
}
