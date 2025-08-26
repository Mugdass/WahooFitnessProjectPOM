package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToPaymentMethodModel extends BaseModel{

	public ToPaymentMethodModel(WebDriver d) {
		super(d);
		

	}

	
	
	
	
	
public WebElement getSelectCreditCardOption() throws InterruptedException {
		
	
		
		WebElement SelectCreditCardOption =  driver.findElement(By.xpath("//span[text()='Credit Card']"));
		
		
			
			return SelectCreditCardOption;



	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}