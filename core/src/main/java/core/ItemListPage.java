package core;

import org.openqa.selenium.WebDriver;

public class ItemListPage {

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
	
	TestLogic.validatePresElem("selectPriceRangeDDmenu", ObjectStorage.selectPriceRangeDDmenu);
	TestLogic.scrollIntoView(ObjectStorage.breadcrumbList);
	TestLogic.mouseOverOn(ObjectStorage.selectPriceRangeDDmenu);

	TestLogic.validatePresElem("priceRangeFourthMenuItem", ObjectStorage.priceRangeFourthMenuItem);
	TestLogic.clickOn(ObjectStorage.priceRangeFourthMenuItem);

	TestLogic.validatePresElem("firstItem", ObjectStorage.firstItem);
	TestLogic.clickOn(ObjectStorage.firstItem);
	TestLogic.returnUrl();
	TestLogic.quit();
    }
}
