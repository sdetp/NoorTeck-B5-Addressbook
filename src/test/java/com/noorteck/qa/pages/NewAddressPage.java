package com.noorteck.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class NewAddressPage extends CommonUI {

	@FindBy(id = "address_first_name")
	WebElement firstNameField;

	@FindBy(id = "address_last_name")
	WebElement lastNameField;

	@FindBy(id = "address_street_address")
	WebElement address1Field;

	@FindBy(id = "address_secondary_address")
	WebElement address2Field;

	@FindBy(id = "address_city")
	WebElement cityField;

	@FindBy(id = "address_state")
	WebElement stateDropdown;

	@FindBy(id = "address_zip_code")
	WebElement zipcodeField;

	@FindBy(id = "address_country_us")
	WebElement unitedStateRadio;

	@FindBy(id = "address_country_canada")
	WebElement canadaRadio;

	@FindBy(id = "address_age")
	WebElement ageField;

	@FindBy(id = "address_website")
	WebElement websiteField;

	@FindBy(id = "address_phone")
	WebElement phoneField;

	@FindBy(id = "address_interest_climb")
	WebElement climbingRadio;

	@FindBy(id = "address_interest_dance")
	WebElement dancingRadio;

	@FindBy(id = "address_interest_read")
	WebElement readingRadio;

	@FindBy(id = "address_note")
	WebElement noteField;

	@FindBy(xpath = "//input[@data-disable-with='Create Address']")
	WebElement createButton;

	public void newAddress() {
		PageFactory.initElements(driver, this);

	}

	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}

	public void enterAddress1(String address1) {
		enter(address1Field, address1);
	}

	public void enterAddress2(String address2) {
		enter(address2Field, address2);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void selectState(String methodName, String indexTextValue) {
		selectFromDropdown(stateDropdown, methodName, indexTextValue);

	}

	public void enterZipcode(String zipcode) {
		enter(zipcodeField, zipcode);
	}

	public void clickUSA() {
		click(unitedStateRadio);
	}

	public void clickCanada() {
		click(canadaRadio);
	}

	public void enterAge(String age) {
		enter(ageField, age);
	}

	public void enterWebsite(String website) {
		enter(websiteField, website);

	}

	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}

	public void clickClimbing() {
		click(climbingRadio);
	}

	public void clickDancing() {
		click(dancingRadio);
	}

	public void clickReading() {
		click(readingRadio);
	}

	public void enterNote(String note) {
		enter(noteField, note);
	}
	
	public void clickCreate() {
		click(createButton);
	}

}
