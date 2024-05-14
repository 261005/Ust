package Lavanyanew;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HRpage.ebaylogin;
public class EbayLoginTest {
	
	static WebDriver driver;
	static HRpage.ebaylogin ebay;

	boolean res;
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	@BeforeClass
	
	
	public void intiDriver(){
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("124");
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ebay = new HRpage.ebaylogin(driver);
	}
		
		
//	@Test
//	public void doLogin()
//	{
//		ebay.filesignin();
	//	ebay.fileusername("Lavanya.burri123@gmail.com");
		//ebay.Clickcontinuebtn();
		//ebay.filepassword("Lavanya@0107");
		//ebay.Clickloginbtn();
		
	
 //}
	@Test
	public void ClickSearchLens() {
		
		
		ebay.SearchLens();
	}
	
	@Test(dependsOnMethods = "ClickSearchLens")
	  public void ChkSearchBox() {
			
			AssertJUnit.assertEquals(true, ebay.ChSearchBox());
	}
			
		
			
			
			
			@DataProvider
			  public Object[][] dp() {
			    return new Object[][] {
			      new Object[] { "mouse"+Keys.ENTER},
			      new Object[] { "xcxdcd"+Keys.ENTER },
			    
			    
			   
			      
			    };
			  }
			@Test(dataProvider = "dp")
			
			public void dosearch(String s)
			{
				
				ebay.enterSearch(s);


				Assert.assertEquals(true, ebay.ChkSearch());
			}


		
		
			
			
			
			

			

	
		
		
	}


