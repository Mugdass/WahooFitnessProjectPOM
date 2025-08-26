package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Page.ExamplePage;
import Page.ToCartPage;
import Page.ToCheckOutDetailsPage;
import Page.ToExitErrorPage;
import Page.ToPaymentMethodForCreditCardPage;
import Page.ToPaymentMethodPage;
import Page.ToShippingMethodPage;
import Page.ToShopPage;
import Page.ToTryCheckOutDetailsPage;


public class StepBase {

	static WebDriver driver;
	
ToShopPage toshoppage;
	
	
	 ToCartPage tocartpage;
	
	
	 ToCheckOutDetailsPage tocheckoutdetailspage;
	
	
	 ToShippingMethodPage toshippingmethodpage;
	
	 ToPaymentMethodPage topaymentmethodpage;
	
	
	
	 ToTryCheckOutDetailsPage totrycheckoutdetailspage;
	
	
	 ToExitErrorPage toexiterrorpage;
	
	
	
	 ToPaymentMethodForCreditCardPage topaymentmethodforcreditcardpage;
	
	
	
	 ExamplePage examplepage;
	
	
	
	
	@io.cucumber.java.Before
	public void before() {
		
System.setProperty("webdriver.chrome.driver", "/Users/matas/Downloads/chromedriver");
		
ChromeOptions handleNotifications = new ChromeOptions();

handleNotifications.addArguments("--disable-notifications");

driver = new ChromeDriver(handleNotifications);
		
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	   
	    	    
	        }
	       
	
	


	@io.cucumber.java.After
	public void after() throws InterruptedException {
		
		Thread.sleep(4800);
		driver.quit();
	}
}
