package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class Home_page extends TestBase{
	
    //Page Factory
	@FindBy (xpath="//span[contains(text(),'Search')]")
	WebElement searchbtn;
	@FindBy (id="mainSearch")
	WebElement searchbar;
	@FindBy (xpath="(//span[@class='poi-name primaryText'])[1]")
	WebElement hotelname;
	
	public Home_page(){
		PageFactory.initElements(driver, this);
	}
    //Actions
    public void clickSearchbar(){
	searchbtn.click();
}
    public Hotels_page searchHotel(){
	searchbar.sendKeys("Club Mahindra");
	hotelname.click();
	return new Hotels_page();
}
}
