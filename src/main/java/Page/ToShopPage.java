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

import Model.ToShopPageModel;

public class ToShopPage extends ToShopPageModel{

	public ToShopPage(WebDriver d) {
		super(d);
		

	}
	
	public void typeClickOnShopButton() {
		
		WebElement ClickOnShopButton = getClickOnShopButton();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ClickOnShopButton);
		
		//ClickOnShopButton.click();
	}
	
	
	
	/*
	
public void typeSelectFirstRandomItemAndAddToTheCart() throws InterruptedException {
		
	List<WebElement> SelectFirstRandomItemAndAddToTheCart = getSelectFirstRandomItemAndAddToTheCart();
		
	int numberOfAllAvailableProducts = SelectFirstRandomItemAndAddToTheCart.size();
  
	Random random = new Random();
	
	int chosenRandomProduct = random.nextInt(numberOfAllAvailableProducts);
    
	SelectFirstRandomItemAndAddToTheCart.get(chosenRandomProduct).click();
   
    
}
   
*/

	

	
	
	
	@SuppressWarnings("unused")
	public void typeShuffle() throws InterruptedException {
	
		WebDriverWait w = new WebDriverWait(driver, 25);
		
	
	List<WebElement> ProductReviews = getSelectFirstRandomItemAndAddToTheCart();
	
	

    

	int numberOfAllAvailableProducts = ProductReviews.size();
	
	
	
	Random random = new Random();
	

	
	
   

	    
	    for (int chosenRandomProduct = random.nextInt(numberOfAllAvailableProducts); chosenRandomProduct < numberOfAllAvailableProducts; chosenRandomProduct++) {
	    	
	    	
	    	
	  
	    
	    	    
	    	    
	    	   try {
	    	    
	    		   
	    	
	    	
	    	    
	    	    Actions actions = new Actions(driver);

	    	    actions.moveToElement(ProductReviews.get(chosenRandomProduct-1)).click().perform();
	    	    
	    	    
	    	   
	    	   
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    
	    	    int size = getsize();
	    		if(size>0) {
	    			
	    		WebElement ClickAddToColor= getClickAddToColor();
	    		
	    		
	    		/*
	    		WebDriverWait wait = new WebDriverWait(driver, 20);

	    		By locator11 = By.xpath("//div[@class='control']/select");
	    		w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ClickAddToColor, locator11));
	    		*/
	    		
	    		Select s = new Select(ClickAddToColor);
	    		s.selectByIndex(1);
	    		

	    		
	    		WebElement ClickAddToCart =  getClickAddToCart();
	    		
	    		

	    	
	    		
	    		JavascriptExecutor js = (JavascriptExecutor)driver;
    			js.executeScript("arguments[0].click()",ClickAddToCart);
	    		
	    		//ClickAddToCart.click();
	    		
    		
    			
    			
/*
    			String cartCount = getcartCount();
    			
    			
    			String cartCount2 = getcartCount2();
    			
    	if(cartCount.equalsIgnoreCase(cartCount2)) {		

    			System.out.println("There are 2 items in your cart!");
    			
    			return;
    		
    			
    			
    	}*/

	    	
	    		
	    		}
	    		
	    		
	    
	    		
	    		
	    		
	    		if(size>1) {
	    			
	    			
	    			
	    			WebElement ClickAddToColor= getClickAddToColor();
	    			
	    			/*
	    			WebDriverWait wait = new WebDriverWait(driver, 20);

		    		By locator12 = By.xpath("//div[@class='control']/select");
		    		w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ClickAddToColor, locator12));
		    		
		    		*/
	    			
	    			
		    		Select s = new Select(ClickAddToColor);
		    		s.selectByIndex(1);
	    			
		    		
		    		
		    		
		    		
		    		
	    			WebElement ClickAddToShirt= getClickAddToShirt();
	    			
	    	
	    			
	    			/*
		    		By locator111 = By.xpath("(//div[@class='control']/select)[2]");
		    		w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ClickAddToShirt, locator111));
	    			
	    			*/
	    			
	    			
	    			
	    			Select s2 = new Select(ClickAddToShirt);
	    			s2.selectByIndex(1);
	    			
	    			
	    			

	    			
	    			WebElement ClickAddToCart =  getClickAddToCart();
	    			
	    			
	    			
	    			
	    			
	    			
	    			JavascriptExecutor js = (JavascriptExecutor)driver;
	    			js.executeScript("arguments[0].click()",ClickAddToCart);
	    			
	    			
	    			//ClickAddToCart.click();
	    	
	    	
	    			
	    			
	    			/*String cartCount = getcartCount();
	    			
	    			
	    			String cartCount2 = getcartCount2();
	    			
	    	if(cartCount.equalsIgnoreCase(cartCount2)) {		

	    			System.out.println("There are 2 items in your cart!");
	    			return;
	    	}*/
	    		
    			
    			
    			
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		 
	    	    int size2 = getsize2();
	    		if(size2>0) {
	    		WebElement ClickAddToColor2= getClickAddToColor2();
	    		
	    		
	    		
	    		/*
	    		WebDriverWait wait = new WebDriverWait(driver, 20);

	    		By locator1121 = By.xpath("(//div[@class='control']/select)[2]");
	    		w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ClickAddToColor2, locator1121));
	    		
	    		*/
	    		
	    		
	    		
	    		Select s = new Select(ClickAddToColor2);
	    		s.selectByIndex(1);
	    		

	    		
	    		WebElement ClickAddToCart =  getClickAddToCart();
	    		
	    		

	    	
	    		
	    		JavascriptExecutor js = (JavascriptExecutor)driver;
    			js.executeScript("arguments[0].click()",ClickAddToCart);
	    		
	    		
    			//ClickAddToCart.click();
	    		
    		
    			
    			

    			/*String cartCount = getcartCount();
    			
    			
    			String cartCount2 = getcartCount2();
    			
    	if(cartCount.equalsIgnoreCase(cartCount2)) {		

    			System.out.println("There are 2 items in your cart!");
    			
    			return;
    		
    			
    			
    	}*/

	    	
	    		
	    		}
	    		
	    		
	    
	    		
	    		
	    		
	    		if(size2>1) {
	    			
	    			
	    			
	    			WebElement ClickAddToColor2= getClickAddToColor2();
	    			
	    			
	    			/*
	    			WebDriverWait wait = new WebDriverWait(driver, 20);

		    		By locator11212 = By.xpath("(//div[@class='control']/select)[2]");
		    		w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ClickAddToColor2, locator11212));
		    		
		    		*/
	    			
	    			
		 
		    		Select s = new Select(ClickAddToColor2);
		    		s.selectByIndex(1);
	    			
	    			WebElement ClickAddToShirt2= getClickAddToShirt2();
	    			
	    			/*
	    			By locator112121 = By.xpath("//div[@class='control']/select");
		    		w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ClickAddToShirt2, locator112121));
	    			
	    			*/
	    			
	    			
	    			Select s2 = new Select(ClickAddToShirt2);
	    			s2.selectByIndex(1);
	    			

	    			
	    			WebElement ClickAddToCart =  getClickAddToCart();
	    			
	    			
	    			
	    			
	    			
	    			
	    			JavascriptExecutor js = (JavascriptExecutor)driver;
	    			js.executeScript("arguments[0].click()",ClickAddToCart);
	    			
	    			//ClickAddToCart.click();
	    			
	    	
	    	
	    		
	    			
	    			/*String cartCount = getcartCount();
	    			
	    			
	    			String cartCount2 = getcartCount2();
	    			
	    	if(cartCount.equalsIgnoreCase(cartCount2)) {		

	    			System.out.println("There are 2 items in your cart!");
	    			return;
	    	}*/
	    		
    			
    			
    			
	    		}
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		
	    		String cartCount = getcartCount();
    			
    			
    			String cartCount2 = getcartCount2();
    			
    	if(cartCount.equals("2")) {		

    			System.out.println("There are 2 items in your cart!");
    			return;
    			
    			
    	}
	    		
	    		
	    	   }
	    		
	    	   
	    		
	    	    catch (Exception e) {
	                
	    	    
	    	   
	    	    		
	    	}
	    		
	    		
	    		
	    		break;
	    		
	    
	    		
	    		
	    }
	 
	

	
	    		
	   
	    			
	    			driver.navigate().back();
	    			
	    			typeShuffle();
	    			
	    			
	    	
	    		
	    			
	    	

	}

	
	

public void typeClickOnShoppingCartIcon() throws InterruptedException {
	
	
	WebElement ClickOnShoppingCartIcon = getClickOnShoppingCartIcon();
	
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",ClickOnShoppingCartIcon);
	
	Thread.sleep(4000);
	ClickOnShoppingCartIcon.click();
	
	
	
	
}











public void typeMakeSureCartVisible() throws InterruptedException {
	
	
	WebElement MakeSureCartVisible = getMakeSureCartVisible();
	
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",ClickOnShoppingCartIcon);
	
	
	
	WebDriverWait w2 = new WebDriverWait(driver, 10);
	
	w2.until(ExpectedConditions.visibilityOf(MakeSureCartVisible));
	
	MakeSureCartVisible.isDisplayed();
	
	
	
	
}
	    	    	











public void typeRemoveItem() throws InterruptedException {
	
	
	WebElement RemoveItem = getRemoveItem();


	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",RemoveItem);
	

	
		
		Thread.sleep(3000);
	RemoveItem.click();
	

	
	
}







public void typeConfirmOK() throws InterruptedException {
	
	
	WebElement ConfirmOK = getConfirmOK();
	
	
	//ConfirmOK.click();
	//ConfirmOK.sendKeys(Keys.ESCAPE);
	
	

	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",ConfirmOK);
		
		
		
		
		
		
		
    
	
}

	
	



public String typeVerifySuccessfulRemoval() throws InterruptedException {




String VerifySuccessfulRemoval = getVerifySuccessfulRemoval();


System.out.println("\n\nTo confirm that the item should be successfully removed from the cart.\n\nIt has been verified that: \n\n"+
VerifySuccessfulRemoval+"\n");








return VerifySuccessfulRemoval;

}





















}



