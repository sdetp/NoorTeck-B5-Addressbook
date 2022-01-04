package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	
	@FindBy (xpath="//a[@class='nav-item nav-link active']")
	WebElement home;
	
	@FindBy(xpath="//a[normalize-space()='Addresses']")
	WebElement address;
	
	@FindBy(linkText="Sign out")
	WebElement signOut;
	
	@FindBy(xpath="//h1[contains(text(),'Welcome to Address Book')]")
	WebElement displayedText;
	
	public  HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddress() {
		click(address);
	}
	
	public void clickSignOut() {
		click(signOut);
	}
	
	public boolean displayedTextTitle() {
		return isDisplayed(displayedText);
	}
	

}
