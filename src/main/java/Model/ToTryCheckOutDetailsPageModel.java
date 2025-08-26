package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToTryCheckOutDetailsPageModel extends BaseModel{

	public ToTryCheckOutDetailsPageModel(WebDriver d) {
		super(d);
		

	}

	
	



public WebElement getClickBluePlaceOrderButton() {
	
	WebElement ClickBluePlaceOrderButton =  driver.findElement(By.xpath("//span[contains(text(),'Place Order')]"));
		
		return ClickBluePlaceOrderButton;
	}






public WebElement getClickToExitErrorMessage() {
	
	WebElement ClickToExitErrorMessage =  driver.findElement(By.xpath("//button[@class='action-primary action-accept']/descendant::span"));
		
		return ClickToExitErrorMessage;
	}





}
