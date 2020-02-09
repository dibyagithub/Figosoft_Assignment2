package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.Home_page;
import com.pages.Hotels_page;
import com.pages.Review_page;

public class Reviewpagetest extends TestBase{
	Home_page homepage;
	Hotels_page hotelspage;
	Review_page reviewpage;
	
	public Reviewpagetest(){
		super();	
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homepage= new Home_page();
	}
	
	@Test
	public void searchHotelTest(){
		homepage.clickSearchbar();
		hotelspage= homepage.searchHotel();
		
	}
	
	@Test
	public void reviewbtnTest(){
		reviewpage= hotelspage.clickReviewbtn();
		
	}
	@Test
	public void addreviewTest(){
		reviewpage.addRating("Title of review", "good");
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.close();
	}

}
