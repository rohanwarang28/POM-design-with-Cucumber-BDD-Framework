package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;



	public TestBase() throws IOException{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("D:\\my_workspace\\POM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
	}

	public static void initialization(){
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
