package Page;

import java.awt.Color;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import Model.ExamplePageModel;
import Model.ToShopPageModel;

public class ExamplePage extends ExamplePageModel{

	public ExamplePage(WebDriver d) {
		super(d);
		

	}
	
	public void typeClickOnShopButton() {
		
		WebElement ClickOnShopButton = getClickOnShopButton();
		
		ClickOnShopButton.click();
	}
	
	
	
	
	






public void typeColorProduct() {
	
	WebElement ColorProduct = getColorProduct();
	
	ColorProduct.click();
}

	
	


public void typeChoseColorProduct() {

WebElement ChoseColorProduct =  getChoseColorProduct();


Select s = new Select(ChoseColorProduct);

s.selectByIndex(1);








WebDriverWait w = new WebDriverWait(driver, 20);


By loc = By.xpath("//div[@class='control']/select");
w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ChoseColorProduct, loc));


ChoseColorProduct.sendKeys(Keys.ENTER);



}








public void typeClose() {
	
	WebElement Close = getClose();
	
	//Close.click();
	
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",Close);
	
	
	//WebDriverWait w = new WebDriverWait(driver, 30);

	
	//w.until(ExpectedConditions.elementToBeClickable(Close));
	
	
}











public void typeClickOnAllProducts() {
	
	WebElement ClickOnShopButton = getClickOnShopButton();
	
	ClickOnShopButton.click();
	
	
}








public void typeSize() throws InterruptedException {
	
	WebElement Size = getSize();
	
	Thread.sleep(4000);
	
	Size.click();
}

	
	





public void typeChoseSize() {

WebElement ChoseSize =  getChoseSize();





WebElement ChoseColorProduct =  getChoseColorProduct();


Select s2 = new Select(ChoseColorProduct);

s2.selectByIndex(1);






WebDriverWait w = new WebDriverWait(driver, 20);

By loc2 = By.xpath("//div/select[@id='attribute92']");
w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ChoseColorProduct, loc2));





Select s = new Select(ChoseSize);

s.selectByIndex(1);




By loc = By.xpath("//div/select[@id='attribute231']");
w.until(ExpectedConditions.presenceOfNestedElementLocatedBy(ChoseSize, loc));




ChoseSize.sendKeys(Keys.ENTER);


}






    
	

}




	












	







