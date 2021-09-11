package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("./src/main/java/com/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
		
	}
	

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("FF")) {
//			WebDriverManager.gecko.driver().setup();
			System.setProperty("webdriver.gecko.driver", "D:\\\\Automation\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		
	}
	
	
	
	
	public static void TerminateBrowser() {
		
		driver.close();
	}

}

