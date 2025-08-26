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
import Model.ToShopPageModel;

public class ToCartPage extends ToCartPageModel{

	public ToCartPage(WebDriver d) {
		super(d);
		

	}
	
	




public void typeEditCartLink() {
	
	
	WebElement EditCartLink = getEditCartLink();
	
	
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",EditCartLink);

	
	EditCartLink.click();
	
	
	
	

	
	
}








public void typeChangeQuantity(/*String quantity*/) {
	
	
	WebElement ChangeQuantity = getChangeQuantity();
	
	
	
	ChangeQuantity.sendKeys(Keys.DELETE);
	
	ChangeQuantity.sendKeys("3");
	
	ChangeQuantity.sendKeys(Keys.ENTER);
	

	
	
}






public void typeClickProceedCheckOutButton() {
	
	
	WebElement ClickProceedCheckOutButton = getClickProceedCheckOutButton();
	
	
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",EditCartLink);

	
	ClickProceedCheckOutButton.click();
	
	
	
	

	
	
}













}



