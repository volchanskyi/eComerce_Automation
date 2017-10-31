package core;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linear {
    static WebDriver driver;
    static String brand = "https://www.williams-sonoma.com";

    static String menu = "Cookware";
    static String category = "Tea Kettles";
    static String item = "KitchenAid Glass Tea Kettle";
    static String qty = "1";

    public static void main(String[] args) throws InterruptedException {
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
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get(brand);
	System.out.println("No errs");
	// driver.quit();
    }
}
