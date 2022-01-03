package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {
		String url = "http://a.testaddressbook.com/sign_up";
		CommonUI obj = new CommonUI();

		obj.openBrowser("chrome");
		obj.navigate(url);

		AddressBookTest testObj = new AddressBookTest();
		testObj.testCaseOne();
		testObj.testCaseTwo();
		ObjInitialize initializeClassObj = new ObjInitialize();

		initializeClassObj.initializeClassObj();

		obj.quitBrowser();

	}

	public void testCaseOne() {
		signUpObj.enterEmail("cqt1@gmail.com");
		signUpObj.enterPassword("123456789");
		signUpObj.clickSignUp();
		homeObj.displayedTextTitle();

	}

	public void testCaseTwo() {
		homeObj.clickSignOut();
		signInObj.enterEmail("cqt1@gmail.com");
		signInObj.enterPassword("123456789");
		signInObj.clickSignIn();
		homeObj.clickAddress();
		newAddressObj.enterFirstName("Chau");
		newAddressObj.enterLastName("Hoang");
		newAddressObj.enterAddress1("123 Road");
		newAddressObj.enterCity("Woodbridge");
		newAddressObj.selectState("text", "ON");
		newAddressObj.clickUSA();
		newAddressObj.enterAge("22");
		newAddressObj.enterPhone("123-2334-3434");
		newAddressObj.enterNote("Automation is Fun");
		newAddressObj.clickCreate();
		newAddressTwoObj.clickList();
		newAddressThreeObj.displayedFN();
		newAddressThreeObj.displayedLN();
		newAddressThreeObj.displayedCity();
		newAddressThreeObj.displayedSt();

	}

}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com
 *  Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com
 *  Fahim: --> NTKBatch5
 * 
 * 
 */
