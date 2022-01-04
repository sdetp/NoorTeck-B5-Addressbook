package com.noorteck.qa.test;



import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class AddressBookTest extends ObjInitialize {

	public static void main(String[] args) {
		String url = "http://a.testaddressbook.com/sign_up";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);

		initializeClassObj();
	//	testCaseOne();
		testCaseTwo();

		

		CommonUI.quitBrowser();

	}

	public static void testCaseOne() {
	
		signUpObj.enterEmail("cthait@gmail.com");
		signUpObj.enterPassword("123456789");
		signUpObj.clickSignUp();
	    System.out.println(homeObj.displayedTextTitle());

	}

	public static void testCaseTwo() {
	
		signUpObj.clickSignIn();
		signInObj.enterEmail("cthait@gmail.com");
		signInObj.enterPassword("123456789");
		signInObj.clickSignIn();
		homeObj.clickAddress();
		addressesObj.clickAddress();
		addressesObj.enterFirstName("John");
		addressesObj.enterLastName("Cena");
		addressesObj.enterAddress1("111 John Cena Rd");
		addressesObj.enterCity("Reston");
		addressesObj.selectState("text", "Virginia");
		addressesObj.clickUSA();
		addressesObj.enterAge("22");
		addressesObj.enterPhone("123-2334-3434");
		addressesObj.clickDancing();
		addressesObj.enterNote("Automation is Fun");
		addressesObj.clickCreate();
		addressesObj.clickList();
	
	System.out.println(	addressesObj.displayedFN());
	System.out.println(	addressesObj.displayedLN());
    System.out.println(addressesObj.displayedCity());
	System.out.println(addressesObj.displayedSt());
		

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
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
