package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openChromeBrowser {
	
	WebDriver driver;
	
	public WebDriver openChrome() {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\git\\UST_Project\\UST_Project\\chromedriver-win64\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
    //options.setBrowserVersion("124");
    driver = new ChromeDriver();
    return driver;
    
	}

}