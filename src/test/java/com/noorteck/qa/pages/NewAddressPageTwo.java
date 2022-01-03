package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class NewAddressPageTwo extends CommonUI{

	@FindBy(xpath="//div[text()='Address was successfully created.']")
    WebElement displayedMessage;
    
    @FindBy(xpath="//a[text()='Edit']")
    WebElement editButton;
    
    @FindBy(xpath="//a[text()='List']")
    WebElement listButton;
    
    public void newAddressPageTwo() {
    	PageFactory.initElements(driver, this);
    }
    
    public String displayedText() {
    	return getText(displayedMessage);
    }
    
    public void clickEdit() {
    	click(editButton);
    }
    
    public void clickList() {
    	click(listButton);
    }
    
    
}
