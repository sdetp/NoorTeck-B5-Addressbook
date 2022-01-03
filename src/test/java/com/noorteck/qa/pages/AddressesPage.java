package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class AddressesPage extends CommonUI {

	@FindBy(xpath="//a[text()='New Address']")
	WebElement newAddressLink;
	
	public void addressPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickAddress() {
		click(newAddressLink);
	}
	
}
