package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToPaymentMethodForCreditCardModel extends BaseModel{

	public ToPaymentMethodForCreditCardModel(WebDriver d) {
		super(d);
		

	}

	
	
	
	

	
	
	
	
	public WebElement getCreditCardNumber() throws InterruptedException {
		
		
		Thread.sleep(3000);
		
		
		
		
		
		driver.switchTo().frame(0);
		
		
		
		//WebDriverWait w = new WebDriverWait(driver, 10);
		
		By loc = By.xpath("//input[@name='cardnumber']");
	
		//w.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(loc)));
		WebElement CreditCardNumber = null;
		
		for(int i=0; i<=5;i++){
			  try{
 CreditCardNumber = driver.findElement(loc);
			     
			    
			     
			     //.sendKeys("4111111111111111");
			    
			     break;
			  }
			  catch(Exception e){
			     System.out.println("Exception was used");
			  }
			}
		
		
		
//WebElement CreditCardNumber =  driver.findElement(By.xpath("//input[@name='cardnumber']"));
		
		//driver.switchTo().defaultContent();
		
			
			return CreditCardNumber;



	}
	
	
	
	
	
	
	
	

	
	
	
	
public WebElement getExpirationDate() throws InterruptedException {
		
		
		WebElement ExpirationDate =  driver.findElement(By.xpath("//input[@name='exp-date']"));
		
		
		
			
			return ExpirationDate;



	}









public WebElement getCv() throws InterruptedException {
	
	
	WebElement Cv =  driver.findElement(By.xpath("//input[@name='cvc']"));
	
	
	
		
		return Cv;



}














public WebElement getPlaceOrderButton() throws InterruptedException {
	
	
	
	Thread.sleep(2000);
	
	
	
	
	
	driver.switchTo().defaultContent();
	
	
	WebElement PlaceOrderButton =  driver.findElement(By.xpath("//span[text()='Place Order']"));
	
	
	
		
		return PlaceOrderButton;



}















public String getVerifyPaymentDeclined() {
	
	
	
	
	
	
	WebDriverWait w = new WebDriverWait(driver, 20);
	
	By loc = By.xpath("//*[@id=\\\"checkout\\\"]/div[3]/div/div");
	
	
	
	w.until(ExpectedConditions.visibilityOfElementLocated(loc));
	
	
	
String VerifyPaymentDeclined = driver.findElement(By.xpath("//*[@id=\\\"checkout\\\"]/div[3]/div/div")).getText();
	
	return VerifyPaymentDeclined;
	
	
}





}