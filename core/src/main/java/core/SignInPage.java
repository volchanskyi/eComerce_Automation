package core;

public class SignInPage {

    public static void validate() {

//	TestLogic.open(url);
	TestLogic.validatePresElem("minimizeOverlay", ObjectStorage.minimizeOverlay);
	TestLogic.clickOn(ObjectStorage.minimizeOverlay);
	
	TestLogic.validateVisElem("stickyHeader", ObjectStorage.stickyHeader);
	TestLogic.clickOn(ObjectStorage.stickyHeader);
	
	TestLogic.validateVisElem("myAccBtn", ObjectStorage.myAccBtn);
	TestLogic.clickOn(ObjectStorage.myAccBtn);

	TestLogic.validateVisElem("emailTxtFld", ObjectStorage.emailTxtFld);
	TestLogic.clearOutTxtFld(ObjectStorage.emailTxtFld);
	TestLogic.typeInTxtFld(ObjectStorage.emailTxtFld, ObjectStorage.getTestDataKey("testUserEmail"));

	TestLogic.validateVisElem("pwdTxtFld", ObjectStorage.pwdTxtFld);
	TestLogic.clearOutTxtFld(ObjectStorage.pwdTxtFld);
	TestLogic.typeInTxtFld(ObjectStorage.pwdTxtFld, ObjectStorage.getTestDataKey("testUserPassword"));

	TestLogic.validateVisElem("logInBtn", ObjectStorage.logInBtn);
	TestLogic.clickOn(ObjectStorage.logInBtn);
//
	
	TestLogic.navigateToUrl();
//	TestLogic.quit();
    }
}
