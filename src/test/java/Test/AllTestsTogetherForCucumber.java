package Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;


public class AllTestsTogetherForCucumber extends BaseTest{
	
	@Test/*(dataProvider="gm")*/
	public void testsTogether(/*String quantity, String email, String fn, String ln, String sa, String c, String country, String state, String z, String rz, String p*/) throws InterruptedException {
		
		
		getToShopPage();
		
		
		toshoppage.typeClickOnShopButton();
		
	
		
		
		
		
		
		toshoppage.typeShuffle();
		
		
		
		
		
		
		
		
		toshoppage.typeClickOnShoppingCartIcon();
		
		toshoppage.typeMakeSureCartVisible();
		
		
		
		
		toshoppage.typeRemoveItem();
		
		
		toshoppage.typeConfirmOK();
		
		toshoppage.typeMakeSureCartVisible();
		
		
		
		
	
		
		String expectedResult = "Item was removed successfully";
		
		String actualResult = toshoppage.typeVerifySuccessfulRemoval();
		
		
		try {
			
		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/span/span")), expectedResult));
		assertEquals(expectedResult, actualResult);
		
		} catch(NoSuchElementException e) {
		
		//Assert.assertTrue(actualResult.equals(expectedResult));
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		getToCartPage();
		
		
		
		
		
		tocartpage.typeEditCartLink();
		
		tocartpage.typeChangeQuantity();
		
		tocartpage.typeClickProceedCheckOutButton();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		getToTryCheckOutDetailsPage();
		
		
		
		
		totrycheckoutdetailspage.typeClickBluePlaceOrderButton();
		
		
		
		
		
		
		
		
		
		
		
		
		getToExitErrorPage();
		
		
		toexiterrorpage.typeClickToExitErrorMessage();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		getToCheckOutDetailsPage();
		
	
		
		
		
		
		tocheckoutdetailspage.typeEmailAddress();
		
		tocheckoutdetailspage.typeFirstName();
		
		tocheckoutdetailspage.typeLastName();
		
		
		
		
		tocheckoutdetailspage.typeStreetAddress();
		
		//tocheckoutdetailspage.typeContinueAddressValidation();
		
		
		tocheckoutdetailspage.typeCity();
		
		//tocheckoutdetailspage.typeContinueAddressValidation();
		
		
		tocheckoutdetailspage.typeCountry();
		
		//tocheckoutdetailspage.typeContinueAddressValidation();
		
		
		tocheckoutdetailspage.typeState();
		
		//tocheckoutdetailspage.typeContinueAddressValidation();
		
		
		tocheckoutdetailspage.typeZipCode();
		
		
		
		
		
		
		tocheckoutdetailspage.typeRetypeZipCode();
		
		
		//tocheckoutdetailspage.typeContinueAddressValidation();
		//tocheckoutdetailspage.typeContinueAddressValidation();
	
		
		
		tocheckoutdetailspage.typePhoneNumber();
	
		
		tocheckoutdetailspage.typeContinueAddressValidation();
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		getToShippingMethodPage();
		
		
		toshippingmethodpage.typeClickToSwitchToExpressShipping();
		
		
		
		
		
		
		
		
		
		
		
		
		
		getToPaymentMethodPage();
		
		
		
		topaymentmethodpage.typeSelectCreditCardOption();
		
		
		
		
		
		
		
		
		
		
		getToPaymentMethodForCreditCardPage();
		
		
		
		topaymentmethodforcreditcardpage.typeCreditCardNumber();
		
		topaymentmethodforcreditcardpage.typeExpirationDate();
		
		topaymentmethodforcreditcardpage.typeCv();
		
		topaymentmethodforcreditcardpage.typePlaceOrderButton();
		
		
		
		
		
		
		
		
		
		/*
		
String expectedR = "Your card was declined. Your request was in live mode, but used a known test card.";
		
		String actualR = topaymentmethodforcreditcardpage.typeVerifyPaymentDeclined();
		

		
		
		try {
			
			
			WebDriverWait w = new WebDriverWait(driver, 20);
			
			By loc = By.xpath("//div[@class='messages']/descendant::div/descendant::div/descendant::text()");
			
			
			
			w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"checkout\"]/div[3]/div/div"))));
			
			w.until(ExpectedConditions.textToBePresentInElementLocated(loc,expectedR));
			assertEquals(expectedR, actualR);
			
			} catch(NoSuchElementException e) {
			
			
			
			
			
	
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	/*@DataProvider(name="gm")
	public Object[][] dataloader() throws IOException {
		Object[][] t;
		
		String filename = "data/Wahoo.xlsx";
		String sheetname = "Sheet1";
		
		
		
		ExcelReader er = new ExcelReader(filename, sheetname);
		t = er.excelToArray();
		return t;
		
		
		
		}*/

}
	
}
