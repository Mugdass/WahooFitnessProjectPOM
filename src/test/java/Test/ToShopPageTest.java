package Test;

import static org.testng.Assert.assertEquals;

import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ToShopPageTest extends BaseTest{
	
	@Test
	public void testOpenShopPage() throws InterruptedException {
		
		
		getToShopPage();
		
		
		toshoppage.typeClickOnShopButton();
		
	
		
		
		
		
		
		toshoppage.typeShuffle();
		
		
		
		
		
		
		
		
		toshoppage.typeClickOnShoppingCartIcon();
		
		toshoppage.typeMakeSureCartVisible();
		
		
		
		toshoppage.typeRemoveItem();
		
		
		
		
		toshoppage.typeConfirmOK();
		
		
		
		
		

		String expectedResult = "Item was removed successfully";
		
		String actualResult = toshoppage.typeVerifySuccessfulRemoval();
		
		try {
			
			WebDriverWait w = new WebDriverWait(driver, 20);

			By loc2 = By.xpath("//*[@id=\"minicart-content-wrapper\"]/span/span");
			w.until(ExpectedConditions.textToBePresentInElementLocated(loc2, expectedResult));
		
		assertEquals(expectedResult, actualResult);
		
		} catch(NoSuchElementException e) {
		
		//Assert.assertTrue(actualResult.equals(expectedResult));
		
		
		}
		
		
		
		

		
		
	}

}
