package Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Model.ToPaymentMethodModel;
import Model.ToShippingMethodModel;
import Page.ExamplePage;
import Page.ToCartPage;
import Page.ToCheckOutDetailsPage;
import Page.ToExitErrorPage;
import Page.ToPaymentMethodForCreditCardPage;
import Page.ToPaymentMethodPage;
import Page.ToShippingMethodPage;
import Page.ToShopPage;
import Page.ToTryCheckOutDetailsPage;



public class BaseTest {
	
	static WebDriver driver;



	
	
	static ToShopPage toshoppage;
	
	
	static ToCartPage tocartpage;
	
	
	static ToCheckOutDetailsPage tocheckoutdetailspage;
	
	
	static ToShippingMethodPage toshippingmethodpage;
	
	static ToPaymentMethodPage topaymentmethodpage;
	
	
	
	static ToTryCheckOutDetailsPage totrycheckoutdetailspage;
	
	
	static ToExitErrorPage toexiterrorpage;
	
	
	
	static ToPaymentMethodForCreditCardPage topaymentmethodforcreditcardpage;
	
	
	
	static ExamplePage examplepage;
	
	
	
	
	

	
	@BeforeSuite
	public void setUp() {
		
System.setProperty("webdriver.chrome.driver", "/Users/matas/Downloads/chromedriver");

	
		



		ChromeOptions handleNotifications = new ChromeOptions();
		
		handleNotifications.addArguments("--disable-notifications");

		driver = new ChromeDriver(handleNotifications);
		
		
		
		//driver = new FirefoxDriver();
		
		driver.get("https://wahoofitness.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		
		
		
	}
	
	
	
	
	

	
public void getToShopPage() {
		
		toshoppage = new ToShopPage(driver);
	}




public void getToCartPage() {
	
	tocartpage = new ToCartPage(driver);
}



public void getToCheckOutDetailsPage() {
	
	tocheckoutdetailspage = new ToCheckOutDetailsPage(driver);
}






public void getToShippingMethodPage() {
	
	toshippingmethodpage = new ToShippingMethodPage(driver);
}



public void getToPaymentMethodPage() {
	
	topaymentmethodpage = new ToPaymentMethodPage(driver);
}





public void getToTryCheckOutDetailsPage() {
	
	totrycheckoutdetailspage = new ToTryCheckOutDetailsPage(driver);
}





public void getToExitErrorPage() {
	
	toexiterrorpage = new ToExitErrorPage(driver);
}




public void getToPaymentMethodForCreditCardPage() {
	
	topaymentmethodforcreditcardpage = new ToPaymentMethodForCreditCardPage(driver);
}








public void getExamplePage() {
	
	examplepage = new ExamplePage(driver);
}


	
	
	@AfterSuite
	public void endTest() throws InterruptedException {
		
	
		Thread.sleep(480000);
		driver.quit();
		
	}
	
}
