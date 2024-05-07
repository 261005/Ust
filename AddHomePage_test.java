package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import AdvantageShoppingOnline.AddHomePage_Object;

import utils.openChromeBrowser;

@Test
public class AddHomePage_test {
	
	
	static WebDriver driver;
	static  AddHomePage_Object hp;
	
	boolean res;
	
	
	@AfterClass
	public void closeDriver()
	{
		
		driver.quit();
	}
	
	@BeforeClass
	public void initDriver()
	{
		
		openChromeBrowser ob = new openChromeBrowser();
		driver = ob.openChrome();
		driver.get("https://advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		hp = new AddHomePage_Object(driver);
	}
	
	@Test
	public void ClickSearchLens() {
		
		
		hp.SearchLens();
	}
	
	
@Test(dependsOnMethods = "ClickSearchLens")
  public void ChkSearchBox() {
		
		Assert.assertEquals(true, hp.ChSearchBox());
		
}
	
	
	@Test(dependsOnMethods ="ChkSearchBox")
	
	public void enterSearchWord()
	{
		hp.enterSearch("mouse");
	}
	
	
	@Test (dependsOnMethods = "enterSearchWord")
	public void CheckSearchResults()
	
	{
		Assert.assertEquals(true, hp.ChkSearch());
	}
	
	

	
	
	
}
	







	

	
	

