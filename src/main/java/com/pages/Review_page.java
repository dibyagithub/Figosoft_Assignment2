package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;

public class Review_page extends TestBase{
	
    //Page Factory
	@FindBy (xpath="//span[@id='bubble_rating'][@data-value='5']")
	WebElement overalratingbtn;
	@FindBy (id="ReviewTitle")
	WebElement titlefield;
	@FindBy (id="ReviewText")
	WebElement reviewfield;
	@FindBy (xpath="//span[@id='qid12_bubbles'][@data-value='5']")
	WebElement hotelratingbtn;
	@FindBy (xpath="//span[contains(text(),'Submit your review')]")
	WebElement submitbtn;
	
	public Review_page(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void addRating(String title, String review){
		Actions action= new Actions(driver);
		action.moveToElement(overalratingbtn).build().perform();
		overalratingbtn.click();
		titlefield.sendKeys(title);
		reviewfield.sendKeys(review);
		action.moveToElement(hotelratingbtn).build().perform();
		hotelratingbtn.click();
		submitbtn.click();
		
	}
	
}

