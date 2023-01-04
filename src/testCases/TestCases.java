package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AddToCart;
import pages.HomePage;
import pages.List_of_products;


public class TestCases {
	 public void TestPrintListOfProducts() {
	    	
	        
//       driver
       List_of_products listPage = new List_of_products();
       HomePage home = new HomePage();
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
       home.SearchProduct(driver);
       listPage.PrintFirst4Products_Name(driver);
       listPage.PrintFirst4Products_Price(driver);
       
       driver.close();

}
	 public void ValidateListOfProducts() {
	        
//       driver
		 List_of_products listPage = new List_of_products();
       HomePage home = new HomePage();
       WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       
       home.SearchProduct(driver);
       listPage.ValidateListofProducts(driver, listPage.PrintFirst4Products_Name(driver), listPage.PrintFirst4Products_Price(driver));
//       listPage.ClickOnProduct(driver);
//       AddtoCart
       
       driver.close();
       
       
       
   }


public void clickonproducts() {
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	HomePage home =new HomePage();
	List_of_products listpage = new List_of_products();
	AddToCart cart = new AddToCart();
	
	home.SearchProduct(driver);
	listpage.ClickOnProduct(driver);
	cart.addintocart(driver);
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
//	cart.viewCart(driver);
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
