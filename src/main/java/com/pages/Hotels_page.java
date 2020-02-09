package com.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class Hotels_page extends TestBase{
	
    //Page Factory
	@FindBy (xpath="//a[@class='ui_button primary']")
	WebElement reivewbtn;
	
    public Hotels_page(){
	PageFactory.initElements(driver, this);
}
    //Actions
    public Review_page clickReviewbtn(){
	reivewbtn.click();
	Set<String> windows= driver.getWindowHandles();
	Iterator<String> it= windows.iterator();
	String parent= it.next();
	String child= it.next();
	driver.switchTo().window(child);
	return new Review_page();
}

}
