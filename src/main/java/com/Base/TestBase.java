package com.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.Testutils;

public class TestBase {
	public static WebDriver driver;
	public static Properties pro;
	public TestBase(){
		
		 try{
			 pro=new Properties();
			 FileInputStream fi = new FileInputStream("E:\\Selenium\\Workspace\\Figosoft_assignment2\\src\\main\\java\\com\\config\\config.properties");
			 pro.load(fi);
		 }
		 catch(FileNotFoundException e){
			 e.printStackTrace();	 
		 }
		 catch(IOException e){
				e.printStackTrace();
			}
	}
	public static void initialization(){
		String browsername=pro.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(Testutils.IMPLICITY_TIMEOUT, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
		}
	}
 
	
	
}
