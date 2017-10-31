package core;

import org.openqa.selenium.WebDriver;

public class PDP {

    public static void validate(WebDriver driver, String url) {

	//PRE-CONDITIONS
		TestLogic.open(url);
		TestLogic.returnUrl();
		SignInPage.validate();
		//TC STARTS HERE
	
	
//	TestLogic.open(url);
//	TestLogic.validatePresElem("minimizeOverlay", ObjectStorage.minimizeOverlay);
//	TestLogic.clickOn(ObjectStorage.minimizeOverlay);
//	
//	TestLogic.validatePresElem("stickyHeader", ObjectStorage.stickyHeader);
//	TestLogic.clickOn(ObjectStorage.stickyHeader);
	
	TestLogic.validateVisElem("addToCartBtn", ObjectStorage.addToCartBtn);
	TestLogic.scrollIntoView(ObjectStorage.breadcrumbList);
	TestLogic.clickOn(ObjectStorage.addToCartBtn);
	

	TestLogic.validateVisElem("checkoutBtn", ObjectStorage.checkoutBtn);
	TestLogic.clickOn(ObjectStorage.checkoutBtn);
	
	TestLogic.returnUrl();
	TestLogic.quit();
    }
}
