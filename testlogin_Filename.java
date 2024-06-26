package webdrivertest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import utils.CaptureScreenShot;
import utils.fileNameMaker;
import utils.openChromeBrowser;

public class testlogin_Filename {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		openChromeBrowser ob = new openChromeBrowser();
		
		driver = ob.openChrome();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecord!");
	
		driver.findElement(By.cssSelector("#login > button")).click();
		
		try {
			driver.findElement(By.partialLinkText("Logout"));
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Login Failed.");
			
			fileNameMaker fn = new fileNameMaker();
			String filename = fn.fileNameForLogin("abc", "def");
			System.out.println(filename);
			
			CaptureScreenShot cs = new CaptureScreenShot();
			cs.takeSnapShot(driver, filename);
			
			
		
		}
		

	}

}
