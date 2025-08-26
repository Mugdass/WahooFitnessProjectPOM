package Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.ToCartPageModel;
import Model.ToPaymentMethodModel;
import Model.ToShippingMethodModel;
import Model.ToShopPageModel;

public class ToPaymentMethodPage extends ToPaymentMethodModel{

	public ToPaymentMethodPage(WebDriver d) {
		super(d);
		

	}
	
	

	
	
	
	public void typeSelectCreditCardOption() throws InterruptedException {
		
		

		
		WebElement SelectCreditCardOption = getSelectCreditCardOption();
		
		

		Thread.sleep(3000);
	    
		SelectCreditCardOption.click();

	    Thread.sleep(5000);
	  
	    
	    
	   


		
	}

	
	
	
	
	
	
	






}



