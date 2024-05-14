package HRpage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class ebaylogin {
	
	static WebDriver driver;
	boolean res;
	//constructor
		public   ebaylogin(WebDriver  driver)
		{
			this.driver=driver;
		}
		
		
		//element decleration
		By signin = By.linkText("Sign in");
		By userid = By.id("userid");
		By continuebtn = By.id("signin-continue-btn");
		By pass = By.id("pass");
		By sgnBt = By.cssSelector("#sgnBt");
		By MenuSearchIcon = By.id("gh-btn");
		By searchBox = By.id("gh-ac");
		By results=By.xpath("//*[contains(@class,\"count-heading\")]");
		
		
		
		//methods
		 
		public void filesignin()
		{
			driver.findElement(signin).click();
		}
			
		public void fileusername(String s) 
		{
			driver.findElement(userid).sendKeys(s);
		}
		
		public void Clickcontinuebtn()
		{
			driver.findElement(continuebtn).click();
		}
		

		
		public void filepassword(String p)
		{
			driver.findElement(pass).sendKeys(p);
			
		}
		
		public void Clickloginbtn()
		{
			driver.findElement(sgnBt).click();
		}
		
		
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
		

			String howmanyequalsto = driver.findElement(results).getText();
			
			if  (howmanyequalsto.startsWith("0")) {
				
				res=false;
				System.out.println("No result found");
				
			}
			else {
				
				System.out.println("result found");
				res=true;
			}
				
				System.out.println(howmanyequalsto);
				
				
			
			
			return res;
			
			
		}
		
		
}

