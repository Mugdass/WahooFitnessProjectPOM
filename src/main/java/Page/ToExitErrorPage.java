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
import Model.ToExitErrorPageModel;
import Model.ToShopPageModel;
import Model.ToTryCheckOutDetailsPageModel;

public class ToExitErrorPage extends ToExitErrorPageModel{

	public ToExitErrorPage(WebDriver d) {
		super(d);
		

	}
	
	



	public void typeClickToExitErrorMessage() {
		
		
		WebElement ClickToExitErrorMessage = getClickToExitErrorMessage();
		

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ClickToExitErrorMessage);
		

		
	}











}



