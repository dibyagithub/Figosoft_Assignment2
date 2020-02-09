package com.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.Home_page;
import com.pages.Hotels_page;
import com.pages.Review_page;

public class Hotelspagetest extends TestBase{
	Home_page homepage;
	Hotels_page hotelpage;
	Review_page reviewpage;
	public Hotelspagetest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homepage= new Home_page();
}
	
@Test
public void clickReviewbtnTest(){
	reviewpage= hotelpage.clickReviewbtn();
	
}
}
