package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToExitErrorPageModel extends BaseModel{

	public ToExitErrorPageModel(WebDriver d) {
		super(d);
		

	}

	
	



public WebElement getClickToExitErrorMessage() {
	
	WebElement ClickToExitErrorMessage =  driver.findElement(By.xpath("//button[@class='action-primary action-accept']/descendant::span"));
		
		return ClickToExitErrorMessage;
	}





}
