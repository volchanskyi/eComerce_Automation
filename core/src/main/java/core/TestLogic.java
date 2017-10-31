package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLogic {

    static WebDriver driver;

    public static void open(String url) {
	Logger logger = Logger.getLogger("");
	logger.setLevel(Level.OFF);
	ChromeOptions option = new ChromeOptions();
	String driverPath = "";
	if (System.getProperty("os.name").toUpperCase().contains("MAC")) {
	    driverPath = "./resources/webdrivers/mac/chromedriver";
	    option.addArguments("-start-fullscreen");
	} else if (System.getProperty("os.name").toUpperCase().contains("WINDOWS")) {
	    driverPath = "./resources/webdrivers/pc/chromedriver.exe";
	    option.addArguments("--start-maximized");
	} else
	    throw new IllegalArgumentException("Unknown OS");
	System.setProperty("webdriver.chrome.driver", driverPath);
	System.setProperty("webdriver.chrome.silentOutput", "true");
	option.addArguments("disable-infobars");
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);
	PageFactory.initElements(driver, ObjectStorage.class);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// WebDriverWait exWait = new WebDriverWait(driver, 10);
	driver.get(url);
	System.out.println("---------------------------------------------------------------------------------------");
	// System.out.println(
	// "UserAgent: " + (String) ((JavascriptExecutor)
	// driver).executeScript("return navigator.userAgent;"));
	System.out.println("Page URL: " + driver.getCurrentUrl());
	System.out.println("Title: " + driver.getTitle());
	System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void quit() {
	driver.quit();
    }

    public static void close() {
	driver.close();
    }

    public static boolean isPresent(By by) {
	if (driver.findElements(by).size() > 0)
	    return true;
	else
	    return false;
    }

    public static boolean isPresentPF(WebElement element) {
	// if (element.getTagName() != null) return true; else return false;
	try {
	    element.getTagName();
	    return true;
	} catch (NoSuchElementException e) {
	    return false;
	}
    }

    public static boolean isVisible(By by) {
	if ((driver.findElements(by).size() > 0) && driver.findElement(by).isDisplayed())
	    return true;
	else
	    return false;
    }

    public static boolean isVisiblePF(WebElement element) {
	try {
	    element.isDisplayed();
	    return true;
	} catch (NoSuchElementException e) {
	    return false;
	}
    }

    public static String getText(WebElement elemName) {
	if (!elemName.getText().isEmpty()) {
//	    System.out.println("Item has the next name: " + elemName.getText());
	} else {
	    System.out.println("element is empty!");
	}
	return elemName.getText();
    }
    
    public static void updateValidatedText(WebElement elemName) {
	Main.validatedText = getText(elemName);
    }

    public static void validateText(String exp, String actual) {
	if (exp.equals(actual)) {
	    System.out.println("The item saved in the shopping cart mathes the item from the saved for later list (" + actual + ")");
	} else {
	    System.out.println("Error");
//	    System.out.println(Main.validatedText);
	}
    }

    public static void validatePresElem(String testCase, WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out.println(ObjectStorage.getelemChkList(testCase) + (isPresentPF(elemName) ? "Exists" : "Not exist"));
    }

    public static void validateVisElem(String testCase, WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	System.out
		.println(ObjectStorage.getelemChkList(testCase) + (isVisiblePF(elemName) ? "Visible" : "Not visible"));
    }

    public static void clickOn(WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
	    elemName.isDisplayed();
	    elemName.click();
	} catch (NoSuchElementException e) {
	    return;
	}

    }

    public static void clearOutTxtFld(WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
	    elemName.isDisplayed();
	    elemName.clear();
	} catch (NoSuchElementException e) {
	    return;
	}

    }

    public static void typeInTxtFld(WebElement elemName, String keys) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
	    elemName.isDisplayed();
	    elemName.sendKeys(keys);
	} catch (NoSuchElementException e) {
	    return;
	}

    }

    public static void mouseOverOn(WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions builder = new Actions(driver);
	builder.moveToElement(elemName).clickAndHold().build().perform();

    }

    public static void mouseOver(WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions builder = new Actions(driver);
	builder.moveToElement(elemName).build().perform();

    }

    public static void scrollIntoView(WebElement elemName) {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	// Create instance of Javascript executor
	JavascriptExecutor siv = (JavascriptExecutor) driver;
	// now execute query which actually will scroll until that element is
	// not appeared on page.
	siv.executeScript("arguments[0].scrollIntoView(true);", elemName);

    }

    public static String returnUrl() {
	String url = driver.getCurrentUrl();
	return Main.url = url;
    }

    public static void navigateToUrl() {
	driver.navigate().to(Main.url);
    }

}
