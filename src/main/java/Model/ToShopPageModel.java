package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ToShopPageModel extends BaseModel{

	public ToShopPageModel(WebDriver d) {
		super(d);
		

	}

	
	public WebElement getClickOnShopButton() {
		
		WebElement ClickOnShopButton = driver.findElement(By.xpath("//nav[@id='top_nav']/ul/li/a"));
		
		return ClickOnShopButton;
	}
	
	
	
	
	
	
	
public List<WebElement> getSelectFirstRandomItemAndAddToTheCart() {
		
	List<WebElement> SelectFirstRandomItemAndAddToTheCart =  driver.findElements(By.xpath("//a[@class='product-image']"));
		
		return SelectFirstRandomItemAndAddToTheCart;
	}
	
	
	

/*

public List<WebElement> getLabel() {
	
	List<WebElement> Label =  driver.findElements(By.xpath("//div[@class='add-to-box']"));
		
		return Label;
	}

*/








public int getsize() {
	
	
	int size = driver.findElements(By.xpath("//div[@class='control']/select")).size();
	
	return size;
}







public WebElement getClickAddToColor() {
	
	WebElement ClickAddToColor =  driver.findElement(By.xpath("//div[@class='control']/select"));
	
	
	
		
		return ClickAddToColor;
	}





public WebElement getClickAddToShirt() {
	
	WebElement ClickAddToShirt =  driver.findElement(By.xpath("(//div[@class='control']/select)[2]"));
		
		return ClickAddToShirt;
	}







public WebElement getClickOutOfStock() {
	
	WebElement ClickOutOfStock =  driver.findElement(By.xpath("//div/p[@class='preordernote']"));
		
		return ClickOutOfStock;
	}




















public int getsize2() {
	
	
	int size2 = driver.findElements(By.xpath("(//div[@class='control']/select)[2]")).size();
	
	
	
	return size2;
}







public WebElement getClickAddToColor2() {
	
	WebElement ClickAddToColor2 =  driver.findElement(By.xpath("(//div[@class='control']/select)[2]"));
	
	
	
		
		return ClickAddToColor2;
	}





public WebElement getClickAddToShirt2() {
	
	WebElement ClickAddToShirt2 =  driver.findElement(By.xpath("//div[@class='control']/select"));
		
		return ClickAddToShirt2;
	}
















public WebElement getClickAddToCart() {
	
	WebElement ClickAddToCart =  driver.findElement(By.xpath("//button[@class='button tocart btn-cart']"));
		
		return ClickAddToCart;
	}














public WebElement getCartsize() {
	
	WebElement Cartsize =  driver.findElement(By.xpath("//span[contains(text(),'item count')]/following-sibling::span"));
	
	
	
		
		return Cartsize;
	}











public WebElement getClose() {
	
	WebElement Close =  driver.findElement(By.xpath("//a[@id='btn-minicart-close']"));
		
		return Close;
	}






public String getcartCount() {
	
	
	String cartCount = driver.findElement(By.xpath("//span[text()='item count']/following-sibling::span")).getText();
	
	return cartCount;
}









public String getcartCount2() {
	
	
	String cartCount2 = driver.findElement(By.xpath("//a[@class='skip-link skip-cart action showcart']/span[contains(text(),'2')]")).getText();
	
	return cartCount2;
}











public WebElement getClickOnShoppingCartIcon() {
	
	WebElement ClickOnShoppingCartIcon =  driver.findElement(By.xpath("//i[@class='wf-cart']"));
		
		return ClickOnShoppingCartIcon;
	}















public WebElement getMakeSureCartVisible() {
	
	WebElement MakeSureCartVisible =  driver.findElement(By.xpath("//div[@class='minicart-wrapper active']"));
		
		return MakeSureCartVisible;
	}


















public WebElement getRemoveItem() {
	
	WebElement RemoveItem =  driver.findElement(By.xpath("//div[@class='secondary']/a/span[contains(text(),'Remove')]"));
		
		return RemoveItem;
	}
	



public String getdetermineS() {
	
	String determineS =  driver.findElement(By.xpath("//select[1]")).getText();
		
		return determineS;
	}
	


public WebElement getquantity() {
	
	WebElement quantity =  driver.findElement(By.xpath("//select[1]"));
		
		return quantity;
	}





public WebElement getConfirmOK() {
	
	WebElement ConfirmOK =  driver.findElement(By.xpath("//button[@class='action-primary action-accept']/span[contains(text(),'OK')]"));
		
		return ConfirmOK;
	}






public String getVerifySuccessfulRemoval() {
	
	String expectedResult = "Item was removed successfully";
	
	WebDriverWait w = new WebDriverWait(driver, 20);
	w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/span/span")), expectedResult));
	
	
	String VerifySuccessfulRemoval = driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/span/span")).getText();
	
	return VerifySuccessfulRemoval;
}










	
}
