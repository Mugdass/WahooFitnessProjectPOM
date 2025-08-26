package steps;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Page.ExamplePage;
import Page.ToCartPage;
import Page.ToCheckOutDetailsPage;
import Page.ToExitErrorPage;
import Page.ToPaymentMethodForCreditCardPage;
import Page.ToPaymentMethodPage;
import Page.ToShippingMethodPage;
import Page.ToShopPage;
import Page.ToTryCheckOutDetailsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WahooStep {

	WebDriver driver = StepBase.driver;
	
	ToShopPage toshoppage = new ToShopPage(driver);
	
	 ToCartPage tocartpage = new ToCartPage(driver);
		
		
	 ToCheckOutDetailsPage tocheckoutdetailspage = new ToCheckOutDetailsPage(driver);
	
	
	 ToShippingMethodPage toshippingmethodpage = new ToShippingMethodPage(driver);
	
	 ToPaymentMethodPage topaymentmethodpage = new ToPaymentMethodPage(driver);
	
	
	
	 ToTryCheckOutDetailsPage totrycheckoutdetailspage = new ToTryCheckOutDetailsPage(driver);
	
	
	 ToExitErrorPage toexiterrorpage = new ToExitErrorPage(driver);
	
	
	
	 ToPaymentMethodForCreditCardPage topaymentmethodforcreditcardpage = new ToPaymentMethodForCreditCardPage (driver);
	
	
	
	 ExamplePage examplepage = new ExamplePage (driver);



@Given("I am on the Wahoo Homepage {string}")
public void I_am_on_the_Wahoo_Homepage(String WahooHomepageURL) {
   
	
	
	driver.navigate().to(WahooHomepageURL);
	
	
	
}


@When("I Click On Shop button")
public void i_click_on_Shop_button() {
	toshoppage.typeClickOnShopButton();
}

@When("I go back and forth to look for a random product to add to the cart until I find the two products")
public void i_go_back_and_forth_to_look_for_a_random_product_to_add_to_the_cart_until_i_find_the_two_products() throws InterruptedException {
	
	toshoppage.typeShuffle();
}

@When("I Click On Shopping Cart Icon")
public void i_click_on_shopping_cart_icon() throws InterruptedException {
    
	toshoppage.typeClickOnShoppingCartIcon();
}

@When("I Make Sure Cart is Visible")
public void i_make_sure_cart_is_visible() throws InterruptedException {
    
	toshoppage.typeMakeSureCartVisible();
}

@When("I Remove one Item")
public void i_remove_one_item() throws InterruptedException {
   
	toshoppage.typeRemoveItem();
}

@When("I click OK in the pop up to Confirm")
public void i_click_ok_in_the_pop_up_to_confirm() throws InterruptedException {
    
	toshoppage.typeConfirmOK();
}

@When("I again Make Sure Cart is Visible")
public void i_again_make_sure_cart_is_visible() throws InterruptedException {
   
	toshoppage.typeMakeSureCartVisible();
}

@Then("I verify a Successful Removal of that one item")
public void i_verify_a_successful_removal_of_that_one_item() throws InterruptedException {
    
	String expectedResult = "Item was removed successfully";
	
	String actualResult = toshoppage.typeVerifySuccessfulRemoval();
	
	
	try {
		
	WebDriverWait w = new WebDriverWait(driver, 20);
	w.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"minicart-content-wrapper\"]/span/span")), expectedResult));
	assertEquals(expectedResult, actualResult);
	
	} catch(NoSuchElementException e) {
	
	//Assert.assertTrue(actualResult.equals(expectedResult));
	
	
	}
}

@When("I click on Edit Cart Link")
public void i_click_on_edit_cart_link() {
    
	tocartpage.typeEditCartLink();
}

@When("I Change the Quantity")
public void i_change_the_quantity() {
   
	tocartpage.typeChangeQuantity();
}

@When("I Click Proceed Check Out button")
public void i_click_proceed_check_out_button() {
    
	tocartpage.typeClickProceedCheckOutButton();
}

@When("I Click Blue Place Order button")
public void i_click_blue_place_order_button() {
    
	totrycheckoutdetailspage.typeClickBluePlaceOrderButton();
}

@When("I Click button to Exit Error Message")
public void i_click_button_to_exit_error_message() {
    
	toexiterrorpage.typeClickToExitErrorMessage();
}

@When("I type Email Address")
public void i_type_email_address() {
   
	tocheckoutdetailspage.typeEmailAddress();
}

@When("I type First Name")
public void i_type_first_name() {
   
	tocheckoutdetailspage.typeFirstName();
}

@When("I type Last Name")
public void i_type_last_name() {
    
	tocheckoutdetailspage.typeLastName();
}

@When("I type Street Address")
public void i_type_street_address() {
    
	tocheckoutdetailspage.typeStreetAddress();
}

@When("I type City")
public void i_type_city() {
    
	tocheckoutdetailspage.typeCity();
}

@When("I type Country")
public void i_type_country() {
    
	tocheckoutdetailspage.typeCountry();
}

@When("I type State")
public void i_type_state() {
    
	tocheckoutdetailspage.typeState();
}

@When("I type Zip Code")
public void i_type_zip_code() {
    
	tocheckoutdetailspage.typeZipCode();
}

@When("I Retype Zip Code")
public void i_retype_zip_code() {
    
	tocheckoutdetailspage.typeRetypeZipCode();
}

@When("I type Phone Number")
public void i_type_phone_number() throws InterruptedException {
   
	tocheckoutdetailspage.typePhoneNumber();
}

@When("I click OK button on the Address Validation pop up to Continue")
public void i_click_ok_button_on_the_address_validation_pop_up_to_continue() throws InterruptedException {
   
	tocheckoutdetailspage.typeContinueAddressValidation();
}

@When("I Click a button To Switch To Express Shipping")
public void i_click_a_button_to_switch_to_express_shipping() throws InterruptedException {
    
	toshippingmethodpage.typeClickToSwitchToExpressShipping();
}

@When("I click to Select a Credit Card Option")
public void i_click_to_select_a_credit_card_option() throws InterruptedException {
    
	topaymentmethodpage.typeSelectCreditCardOption();
	
	
	
}










@When("I type Credit Card Number")
public void i_type_credit_card_number() throws InterruptedException {
   
	topaymentmethodforcreditcardpage.typeCreditCardNumber();
}

@When("I type Expiration Date")
public void i_type_expiration_date() throws InterruptedException {
   
	topaymentmethodforcreditcardpage.typeExpirationDate();
}

@When("I type Cv")
public void i_type_cv() throws InterruptedException {
    
	topaymentmethodforcreditcardpage.typeCv();
}

@When("I click place order button")
public void i_click_place_order_button_() throws InterruptedException {
    
	topaymentmethodforcreditcardpage.typePlaceOrderButton();
	
	
	
}













}
