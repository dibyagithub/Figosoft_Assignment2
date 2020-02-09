package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.Home_page;
import com.pages.Hotels_page;

public class Homepagetest extends TestBase{
	Home_page homepage;
	Hotels_page hotelpage;
	
	public Homepagetest(){
		super();
	}
	@BeforeMethod
	public void setUp(){
		initialization();
		homepage= new Home_page();
}
	@Test
	public void clickSearchbarTest(){
		homepage.clickSearchbar();
	}
	@Test
	public void searchHotelTest(){
		hotelpage= homepage.searchHotel();
	}
	@AfterMethod
	public void tearDown(){
		driver.close();
	}
}

