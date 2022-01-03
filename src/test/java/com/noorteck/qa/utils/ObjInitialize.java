package com.noorteck.qa.utils;

import com.noorteck.qa.pages.AddressesPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.NewAddressPage;
import com.noorteck.qa.pages.NewAddressPageThree;
import com.noorteck.qa.pages.NewAddressPageTwo;
import com.noorteck.qa.pages.SignInPage;
import com.noorteck.qa.pages.SignUpPage;

public class ObjInitialize extends Constants {
	
	 
	
	public void initializeClassObj() {
		//initialize each page class objects here..
		signInObj = new SignInPage();
		signUpObj = new SignUpPage();
		homeObj = new HomePage();
		addressesObj = new AddressesPage();
		newAddressObj= new NewAddressPage();
		newAddressTwoObj= new NewAddressPageTwo();
		newAddressThreeObj= new NewAddressPageThree();
	}

}
