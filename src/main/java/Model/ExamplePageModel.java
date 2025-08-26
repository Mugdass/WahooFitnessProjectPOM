package Model;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExamplePageModel extends BaseModel{

	public ExamplePageModel(WebDriver d) {
		super(d);
		

	}

	
	public WebElement getClickOnShopButton() {
		
		WebElement ClickOnShopButton = driver.findElement(By.xpath("//a[@class='cat']"));
		
		return ClickOnShopButton;
	}
	
	
	
	
	
	
	
public List<WebElement> getSelectFirstRandomItemAndAddToTheCart() {
		
	List<WebElement> SelectFirstRandomItemAndAddToTheCart =  driver.findElements(By.xpath("//p[@class='product-name']"));
		
		return SelectFirstRandomItemAndAddToTheCart;
	}
	
	
	








public List<WebElement> getLabel() {
	
	List<WebElement> Label =  driver.findElements(By.xpath("//div[@class='add-to-box']"));
		
		return Label;
	}


















public WebElement getClickAddToShirt() {
	
	WebElement ClickAddToShirt =  driver.findElement(By.xpath("//div/select[@name='super_attribute[231]']"));
		
		return ClickAddToShirt;
	}







public WebElement getClickOutOfStock() {
	
	WebElement ClickOutOfStock =  driver.findElement(By.xpath("//div/p[@class='preordernote']"));
		
		return ClickOutOfStock;
	}










public WebElement getClickAddToSock() {
	
	WebElement ClickAddToSock =  driver.findElement(By.xpath("//div/select[@name='super_attribute[229]']"));
		
		return ClickAddToSock;
	}







public WebElement getClickAddToCart() {
	
	WebElement ClickAddToCart =  driver.findElement(By.xpath("//button[@class='button tocart btn-cart']"));
		
		return ClickAddToCart;
	}



















public WebElement getColorProduct() {
	
	WebElement ColorProduct =  driver.findElement(By.xpath("//p/a[text()='TICKR Heart Rate Monitor']"));
		
		return ColorProduct;
	}







public WebElement getChoseColorProduct() {
	
	WebElement ChoseColorProduct =  driver.findElement(By.xpath("//div[@class='control']/select"));
		
		return ChoseColorProduct;
	}











public WebElement getClose() {
	
	WebElement Close =  driver.findElement(By.xpath("//a[@id='btn-minicart-close']"));
		
		return Close;
	}










public WebElement getClickOnAllProducts() {
	
	WebElement ClickOnAllProducts =  driver.findElement(By.xpath("//a[@class='cat']"));
		
		return ClickOnAllProducts;
	}












public WebElement getSize() {
	
	WebElement ColorProduct =  driver.findElement(By.xpath("//a[text()='Wahooligan T-Shirt']"));
		
		return ColorProduct;
	}







public WebElement getChoseSize() {
	
	WebElement ChoseColorProduct =  driver.findElement(By.xpath("//div/select[@id='attribute231']"));
		
		return ChoseColorProduct;
	}








	
	
	
}
