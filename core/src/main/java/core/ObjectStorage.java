package core;

import java.util.TreeMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectStorage {

    @FindBy(linkText = "minimize")
    static WebElement minimizeOverlay;

    @FindBy(linkText = "Cookware")
    static WebElement coockwareMenuBtn;

    @FindBy(linkText = "Tea Kettles")
    static WebElement teaKettlesSection;

    @FindBy(className = "stickyHeaderCloseButton")
    static WebElement stickyHeader;

    @FindBy(xpath = "//*[@id='facetedNavHorizontalContainer']/div[1]/h4")
    static WebElement selectPriceRangeDDmenu;

    @FindBy(xpath = "id('facetedNavHorizontalContainer')/div[1]/div[2]/ul[1]/li[4]/label[1]/a[1]")
    static WebElement priceRangeFourthMenuItem;

    @FindBy(xpath = "//*[@id='subCatListContainer']/ul/li[1]/a[2]")
    static WebElement firstItem;

    @FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
    static WebElement addToCartBtn;

    @FindBy(id = "anchor-btn-checkout")
    static WebElement checkoutBtn;

    @FindBy(xpath = "//a[contains(text(),'Save For Later')]")
    static WebElement saveForLaterLink;

    @FindBy(xpath = "id('cartForm')/h2[contains(text(),'Save For Later')]")
    static WebElement savedNumberOfItemText;

    @FindBy(xpath = "//*[@id='cartForm']/div/div/div[2]/div[1]")
    static WebElement savedNameOfItemTextShoppingCart;
    
    @FindBy(xpath = "id('cartForm')/div[4]/div[1]/div[1]/div[2]/div[1]/a[1]")
    static WebElement savedNameOfItemTextCheckout;

    @FindBy(xpath = "//*[@id='sub-brand-bar-container']/section/div/div/div[1]")
    static WebElement myAccBtn;

    @FindBy(xpath = "//a[contains(text(), 'Sign In')]")
    static WebElement signInBtn;
    //
    @FindBy(id = "login-email")
    static WebElement emailTxtFld;
    //
    @FindBy(id = "login-password")
    static WebElement pwdTxtFld;

    @FindBy(id = "btn-sign-in")
    static WebElement logInBtn;
    
    @FindBy(id = "breadcrumb-list")
    static WebElement breadcrumbList;
    
    @FindBy(id = "topnav-container")
    static WebElement mainNavMenu;

    // @FindBy(xpath = "/html/head/title")
    // static WebElement title;

    // String title = "Empty Shopping Cart | Williams Sonoma";

    private static final TreeMap<String, String> elemChkList = createElemChkListMap();
    private static final TreeMap<String, String> testDataList = createTestDataMap();

    public static String getelemChkList(Object key) {
	return elemChkList.get(key);
    }
    
    public static String getTestDataKey(Object key) {
	return testDataList.get(key);
    }

    public static TreeMap<String, String> getList() {
	return elemChkList;
    }

    private static TreeMap<String, String> createElemChkListMap() {
	TreeMap<String, String> elemChkList = new TreeMap<String, String>();
	elemChkList.put("minimizeOverlay", "Minimize Button on Overlay? ");
	elemChkList.put("coockwareMenuBtn", "Coockware menu button? ");
	elemChkList.put("teaKettlesSection", "Tea kettle menu section? ");
	elemChkList.put("selectPriceRangeDDmenu", "Price range Drop-Down Menu? ");
	elemChkList.put("maxPriceRangeMenuItem", "Price range items? ");
	elemChkList.put("addToCartBtn", "Add to cart button? ");
	elemChkList.put("checkoutBtn", "Checkout button? ");
	elemChkList.put("saveForLaterLink", "Save for later Link? ");
	elemChkList.put("savedNumberOfItemText", "Number of saved items text? ");
	elemChkList.put("savedNameOfItemTextShoppingCart", "Text of the item was saved (Shopping Cart Page)? ");
	elemChkList.put("savedNameOfItemTextCheckout", "Text of the item was saved (CheckOut Page)? ");
	elemChkList.put("title", "Page title? ");
	elemChkList.put("stickyHeader", "Sticky Overlay? ");
	elemChkList.put("priceRangeFourthMenuItem", "Fourth item from DD menu? ");
	elemChkList.put("selectPriceRangeDDmenu", "Price Range DD Menu? ");
	elemChkList.put("addToCartBtn", "Add to Cart button? ");
	elemChkList.put("checkoutBtn", "Checkout button? ");
	elemChkList.put("myAccBtn", "My Account Button? ");
	elemChkList.put("emailTxtFld", "Email Text Field? ");
	elemChkList.put("pwdTxtFld", "Password Text Field? ");
	elemChkList.put("logInBtn", "Login Button? ");
	elemChkList.put("firstItem", "First Item from the list(image)? ");
	return elemChkList;
    }
    
    private static TreeMap<String, String> createTestDataMap() {
	TreeMap<String, String> testDataList = new TreeMap<String, String>();
	testDataList.put("testUserEmail", "testusera056@gmail.com");
	testDataList.put("testUserPassword", "passwordForUser056");
	return testDataList;
    }
    
    
}
