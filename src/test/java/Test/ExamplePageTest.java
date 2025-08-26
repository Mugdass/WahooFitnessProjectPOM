package Test;

import org.testng.annotations.Test;


public class ExamplePageTest extends BaseTest{
	
	@Test
	public void testOpenShopPage() throws InterruptedException {
		
		
		getExamplePage();
		
		
		examplepage.typeClickOnShopButton();
		
		
		
		
		examplepage.typeColorProduct();
		
		examplepage.typeChoseColorProduct();
		
		
		
		examplepage.typeClose();
		
		
		
		examplepage.typeClickOnAllProducts();
		
		
		

		examplepage.typeSize();
		
		
		
		
		examplepage.typeChoseSize();
		
		
		
		
		
		examplepage.typeClose();
		
		
		
		
		
		
	}

}
