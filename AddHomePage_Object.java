package AdvantageShoppingOnline;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AddHomePage_Object {
	
	 
	static WebDriver driver;
	
	boolean res;
	
	
	//constructor
	
	public AddHomePage_Object(WebDriver driver) {
		
		this.driver=driver;
	}
	
	//Element references 
	
	By MenuSearchIcon = By.id("menusearch");
	By searchBox = By.id("autoComplete");
	By results = By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p");
	
	
	// methods
	

	public void SearchLens()
	{
	driver.findElement(MenuSearchIcon).click();
	
	

}
	
	public boolean ChSearchBox()
	
	{
		
		try {
			driver.findElement(searchBox);
			res = true;
		}
		
		catch (NoSuchElementException e)
		{
			res= false;
		}
		return res;
		
	}
	
	public void enterSearch(String s) {
		
		driver.findElement(searchBox).sendKeys(s);
		
		
	}
	
	
	public boolean ChkSearch() {
		
		try {
			
			String howmanyequalsto = driver.findElement(results).getText();
			
			System.out.println("howmanyequalsto");
			
			res= true;
		}
		
		catch(NoSuchElementException e)
		
		{
			res= false;
		}
		
		return res;
	}
	
	
	
}

