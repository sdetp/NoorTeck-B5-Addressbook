package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class NewAddressPageThree extends CommonUI {

	@FindBy(xpath="//td[text()='Cheryl']")
	WebElement displayedFirstName;
	
	@FindBy(xpath="//td[text()='Thai']")
	WebElement displayedLastName;
	
	@FindBy(xpath="//td[text()='Gainesville']")
	WebElement displayedCity;
	
	@FindBy(xpath="//td[text()='AL']")
	WebElement displayedState;
	
	public void newAddressPageThree() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean displayedFN() {
		return isDisplayed(displayedFirstName);
	}
	
	public boolean displayedLN() {
		return isDisplayed(displayedLastName);
	}
	
	public boolean displayedCity() {
		return isDisplayed(displayedCity);
	}
	
	public boolean displayedSt() {
		return isDisplayed(displayedState);
	}
	
}
