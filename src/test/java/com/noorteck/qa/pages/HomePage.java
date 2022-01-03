package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{
	
	
	@FindBy (xpath="//a[@data-test='home']")
	WebElement home;
	
	@FindBy(xpath="//a[text()='Addresses']")
	WebElement address;
	
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOut;
	
	@FindBy(xpath="//h1[text()='Welcome to Address Book']")
	WebElement displayedText;
	
	public void homePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddress() {
		click(address);
	}
	
	public void clickSignOut() {
		click(signOut);
	}
	
	public String displayedTextTitle() {
		return getText(displayedText);
	}
	

}
