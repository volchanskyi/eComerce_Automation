package core;

import org.openqa.selenium.WebDriver;

public class Main {
    static long start;
    static long finish;
    static String url;
    static String validatedText;
    static WebDriver driver;

    public static void main(String[] args) {
	System.out.println("Browser: Chrome");
	start = System.currentTimeMillis();
//	SignInPage.validate(driver, "https://www.williams-sonoma.com");
	HomePage.validate(driver, "https://www.williams-sonoma.com");
	ItemListPage.validate(driver, url);
	PDP.validate(driver, url);
	ShoppingCartPage.validate(driver, url);
	finish = System.currentTimeMillis();
	System.out.println("---------------------------------------------------------------------------------------");
	System.out.println("Test suit response time: " + (finish - start) + " ms");
	TestLogic.quit();
    }
}
