package core;

import org.openqa.selenium.WebDriver;

public class HomePage {

    public static void validate(WebDriver driver, String url) {

	//PRE-CONDITIONS
	TestLogic.open(url);
	TestLogic.returnUrl();
	SignInPage.validate();
	//TC STARTS HERE
	
	
//	TestLogic.validatePresElem("minimizeOverlay", ObjectStorage.minimizeOverlay);
//	TestLogic.clickOn(ObjectStorage.minimizeOverlay);
//
//	TestLogic.validateVisElem("stickyHeader", ObjectStorage.stickyHeader);
//	TestLogic.clickOn(ObjectStorage.stickyHeader);

	TestLogic.validatePresElem("coockwareMenuBtn", ObjectStorage.coockwareMenuBtn);
	TestLogic.mouseOverOn(ObjectStorage.coockwareMenuBtn);

	TestLogic.validateVisElem("teaKettlesSection", ObjectStorage.teaKettlesSection);
	TestLogic.clickOn(ObjectStorage.teaKettlesSection);

	TestLogic.returnUrl();
	TestLogic.quit();
    }
}
