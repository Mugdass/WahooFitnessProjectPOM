package Page;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.ToCartPageModel;
import Model.ToCheckOutDetailsPageModel;
import Model.ToShopPageModel;

public class ToCheckOutDetailsPage extends ToCheckOutDetailsPageModel{

	public ToCheckOutDetailsPage(WebDriver d) {
		super(d);
		

	}
	
	






public void typeEmailAddress(/*String email*/) {
	
	
	WebElement EmailAddress = getEmailAddress();
	

	
	EmailAddress.sendKeys("someone@whocares.com");
	

	
}




public void typeFirstName(/*String fn*/) {
	
	
	WebElement FirstName = getFirstName();
	

	
	FirstName.sendKeys("Test");
	

	
}



public void typeLastName(/*String ln*/) {
	
	
	WebElement LastName = getLastName();
	

	
	LastName.sendKeys("Tester");
	

	
}



public void typeStreetAddress(/*String sa*/) {
	
	
	WebElement StreetAddress = getStreetAddress();
	
	/*WebElement ContinueAddressValidation = getContinueAddressValidation();

	
	if(ContinueAddressValidation.isDisplayed()) {
		
		ContinueAddressValidation.click();
		
		StreetAddress.sendKeys("Comandante Izarduy 67");
		
	}
		
		
	else 
	
	StreetAddress.sendKeys("Comandante Izarduy 67");
	
	}
	
	*/
	StreetAddress.sendKeys("Commandante Izarduy 67");
}



public void typeCity(/*String c*/) {
	
	
	WebElement City = getCity();
	
/*WebElement ContinueAddressValidation = getContinueAddressValidation();

	
	if(ContinueAddressValidation.isDisplayed()) {
		
		ContinueAddressValidation.click();
		
		City.sendKeys("Barcelona");
		
	}
		
		
	else {
	
		City.sendKeys("Barcelona");
	
	}*/

	
	City.sendKeys("Barcelona");
	

	
}





public void typeCountry(/*String country*/) {
	
	
	WebElement Country = getCountry();
	
Select s = new Select(Country);

	
	




/*WebElement ContinueAddressValidation = getContinueAddressValidation();


if(ContinueAddressValidation.isDisplayed()) {
	
	ContinueAddressValidation.click();
	
	s.selectByVisibleText("United States");
	
}
	
	
else {

	s.selectByVisibleText("United States");

}*/
	

s.selectByVisibleText("United States");
	
}





public void typeState(/*String state*/) {
	
	
	WebElement State = getState();
	
Select s = new Select(State);




/*WebElement ContinueAddressValidation = getContinueAddressValidation();


if(ContinueAddressValidation.isDisplayed()) {
	
	ContinueAddressValidation.click();
	
	s.selectByVisibleText("California");
	
}
	
	
else {

	s.selectByVisibleText("California");

}*/
	

s.selectByVisibleText("California");
	
	

	
}





public void typeZipCode(/*String z*/) {
	
	
	WebElement ZipCode = getZipCode();
	


/*WebElement ContinueAddressValidation = getContinueAddressValidation();


if(ContinueAddressValidation.isDisplayed()) {
	
	ContinueAddressValidation.click();
	
	ZipCode.sendKeys("08940");
	
}
	
	
else {

	ZipCode.sendKeys("08940");

}*/
	
	ZipCode.sendKeys("08940");
	

	
}













public void typeRetypeZipCode(/*String rz*/) {
	
	
	WebElement RetypeZipCode = getRetypeZipCode();
	

	RetypeZipCode.clear();
	RetypeZipCode.sendKeys("08940");
	
	
	
	

	
}










public void typeContinueAddressValidation() throws InterruptedException {
	
	
	WebElement ContinueAddressValidation = getContinueAddressValidation();
	

	
	//ContinueAddressValidation.click();
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",ContinueAddressValidation);
	
	
	 Thread.sleep(5000);
	
	
	

	
}








public void typePhoneNumber(/*String p*/) throws InterruptedException {
	
	
	WebElement PhoneNumber = getPhoneNumber();
	
	
	
	

/*WebElement ContinueAddressValidation = getContinueAddressValidation();


if(ContinueAddressValidation.isDisplayed()) {
	
	ContinueAddressValidation.click();
	
	PhoneNumber.sendKeys("5555555555");
	
}
	
	
else {

	PhoneNumber.sendKeys("5555555555");

}*/

	
	
	
	PhoneNumber.sendKeys("5555555555");
	 Thread.sleep(5000);


	
}












}



