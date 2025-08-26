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
import Model.ToPaymentMethodForCreditCardModel;
import Model.ToPaymentMethodModel;
import Model.ToShippingMethodModel;
import Model.ToShopPageModel;

public class ToPaymentMethodForCreditCardPage extends ToPaymentMethodForCreditCardModel{

	public ToPaymentMethodForCreditCardPage(WebDriver d) {
		super(d);
		

	}
	
	

	
	
	
	
	
	
	
	


public void typeCreditCardNumber() throws InterruptedException {
	
	

	
	WebElement CreditCardNumber = getCreditCardNumber();
	
	


	//CreditCardNumber.click();
	
	
	
    CreditCardNumber.sendKeys("4111111111111111");

    Thread.sleep(3000);
  


	
}









public void typeExpirationDate() throws InterruptedException {
	
	

	
	WebElement ExpirationDate = getExpirationDate();
	
	


	//CreditCardNumber.click();
	
	
	
	ExpirationDate.sendKeys("0824");

  
  


	
}









public void typeCv() throws InterruptedException {
	
	

	
	WebElement Cv = getCv();
	
	


	//CreditCardNumber.click();
	
	
	
	Cv.sendKeys("111");

  
  


	
}
















public void typePlaceOrderButton() throws InterruptedException {
	
	

	
	WebElement PlaceOrderButton = getPlaceOrderButton();
	
	
Thread.sleep(2000);

JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",PlaceOrderButton);
	

	
	

	
}
















public String typeVerifyPaymentDeclined() throws InterruptedException {




String VerifyPaymentDeclined = getVerifyPaymentDeclined();


System.out.println("\n\nTThe expected result of the payment is declined.\n\nIt has been verified that: \n\n"+
		VerifyPaymentDeclined+"\n");








return VerifyPaymentDeclined;

}













}



