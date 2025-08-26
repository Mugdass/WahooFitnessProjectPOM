package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToShippingMethodModel extends BaseModel{

	public ToShippingMethodModel(WebDriver d) {
		super(d);
		

	}

	
	
	
	
	
	public WebElement getClickToSwitchToExpressShipping() {
		
		WebElement ClickToSwitchToExpressShipping =  driver.findElement(By.xpath("//td[text()='FedEx Next Day']"));
			
			return ClickToSwitchToExpressShipping;



	}
	


}