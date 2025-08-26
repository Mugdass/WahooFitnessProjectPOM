package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToCartPageModel extends BaseModel{

	public ToCartPageModel(WebDriver d) {
		super(d);
		

	}

	
	


public WebElement getEditCartLink() {
	
	WebElement EditCartLink =  driver.findElement(By.xpath("(//div[@class='secondary'])[3]/a/span[contains(text(),'View and Edit Cart')]"));
		
		return EditCartLink;
	}




public WebElement getChangeQuantity() {
	
	WebElement ChangeQuantity =  driver.findElement(By.xpath("//div[@class='control qty']/descendant::input"));
		
		return ChangeQuantity;
	}

	



public WebElement getClickProceedCheckOutButton() {
	
	WebElement ClickProceedCheckOutButton =  driver.findElement(By.xpath("//ul[@class='checkout methods items checkout-methods-items']/descendant::li/button/span[contains(text(),'Proceed to Checkout')]"));
		
		return ClickProceedCheckOutButton;
	}




}
