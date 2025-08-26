package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToCheckOutDetailsPageModel extends BaseModel{

	public ToCheckOutDetailsPageModel(WebDriver d) {
		super(d);
		

	}

	
	




public WebElement getEmailAddress() {
	
	WebElement EmailAddress =  driver.findElement(By.xpath("//div[@class='control _with-tooltip']/descendant::input"));
		
		return EmailAddress;
	}



public WebElement getFirstName() {
	
	WebElement FirstName =  driver.findElement(By.xpath("//div[@class='control']/descendant::input"));
		
		return FirstName;
	}


public WebElement getLastName() {
	
	WebElement LastName =  driver.findElement(By.xpath("(//input[@class='input-text'])[2]"));
		
		return LastName;
	}


public WebElement getStreetAddress() {
	
	WebElement StreetAddress =  driver.findElement(By.xpath("(//input[@class='input-text'])[4]"));
		
		return StreetAddress;
	}



public WebElement getCity() {
	
	WebElement City =  driver.findElement(By.xpath("(//input[@class='input-text'])[6]"));
		
		return City;
	}


public WebElement getCountry() {
	
	WebElement Country =  driver.findElement(By.xpath("//select[@class='select']"));
		
		return Country;
	}



public WebElement getState() {
	
	WebElement State =  driver.findElement(By.xpath("(//select[@class='select'])[2]"));
		
		return State;
	}




public WebElement getZipCode() {
	
	WebElement ZipCode =  driver.findElement(By.xpath("(//input[@class='input-text'])[8]"));
		
		return ZipCode;
	}





public WebElement getContinueAddressValidation() throws InterruptedException {
	
	Thread.sleep(10000);
	
	WebElement ContinueAddressValidation =  driver.findElement(By.xpath("//span[text()='Continue']/parent::button"));
		
		return ContinueAddressValidation;
	}







public WebElement getPhoneNumber() {
	
	WebElement PhoneNumber =  driver.findElement(By.xpath("(//input[@class='input-text'])[9]"));
		
		return PhoneNumber;
	}
























public WebElement getRetypeZipCode() {
	
	WebElement RetypeZipCode =  driver.findElement(By.xpath("(//input[@class='input-text'])[8]"));
		
		return RetypeZipCode;
	}






}
