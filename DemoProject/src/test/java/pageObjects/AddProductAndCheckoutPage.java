package pageObjects;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class AddProductAndCheckoutPage {
//Sing in
	private WebDriver driver;
	private static String actualitem1;
	private static String actualitem2;
	
	public AddProductAndCheckoutPage(WebDriver driver) {
		this.driver = driver; 	
	}
	
	private By SignInacc = By.xpath("//a[@title='Log in to your customer account']");
	private By SingInEmailadrs = By.xpath("//input[@id='email']");	
	private By SignInPwd = By.xpath("//input[@id='passwd']");	
	private By SubmitLogin = By.xpath("//button[@id='SubmitLogin']");
	private By Signout = By.xpath("//a[@title='Log me out']");
	
	
	
	private By prodWomen = By.xpath("//*[@title='Women']");
	private By Contshopping = By.xpath("//*[@title='Continue shopping']");
	private By ProceedtoCheckout = By.xpath("//*[@title='Proceed to checkout']");
	private By ShoppingcartSummary = By.xpath("//*[@id='cart_title']");
	private By AdressChekout = By.xpath("//*[@name='processAddress']");
	private By TermsofService = By.xpath("//*[@id='cgv']");
	private By ShippingCheckout = By.xpath("//*[@name='processCarrier']");	
	private By ValidatePaymentmethod = By.xpath("//*[contains(text(),'Please choose your')]");
	private By TotalPrice = By.xpath("//*[@id='total_price_container']");
	private By Item1 = By.xpath("//*[(@title='Faded Short Sleeve T-shirts')]//parent::h5");
	private By Item1AddCart = By.xpath("//*[(@title='Add to cart' and @data-id-product = '1')]");
	private By Item2 = By.xpath("//*[@title='Blouse']//parent::h5");
	private By Item2AddCart = By.xpath("//*[(@title='Add to cart' and @data-id-product = 2)]");
	private By SummaryProceedCheckout  = By.xpath("//*[@id='center_column']/p[2]/a[1]");
	private By ProductValidteItem1 = By.xpath("//a[(text()='Faded Short Sleeve T-shirts')]");
	private By ProductValidteItem2 = By.xpath("//a[(text()='Blouse')]//parent::p");
	
	//
	public void clicksingIn() {
		driver.findElement(SignInacc).click();
	}
	
	public void user_SingIntoApplication(DataTable Mystoretable) {
		
		List<Map<String, String>> usercred = Mystoretable.asMaps();
		String userName = usercred.get(0).get("Username");
		String password = usercred.get(0).get("Password");
		
		driver.findElement(SingInEmailadrs).sendKeys(userName);
		driver.findElement(SignInPwd).sendKeys(password);
		driver.findElement(SubmitLogin).click();		
	}
	
	public void click_Womentab() {
		driver.findElement(prodWomen).click();
	}
	
	public void select_item() {
		//selecting first item
		actualitem1 = driver.findElement(Item1).getText();
		driver.findElement(Item1).click();
		driver.findElement(Item1AddCart).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(Contshopping).click();
	
		//selecting second item
		actualitem2 = driver.findElement(Item2).getText();
		driver.findElement(Item2).click();
		driver.findElement(Item2AddCart).click();
		driver.findElement(ProceedtoCheckout).click();		
	}
	
	public boolean Validate_landedonCartSummary() {
		return driver.findElement(ShoppingcartSummary).isDisplayed();
	}
	
	public void click_SummaryProceedCheckout() {
		driver.findElement(SummaryProceedCheckout).click();
	}
	
	public void click_AddressProceedCheckout() {
		driver.findElement(AdressChekout).click();
	}
	
	public void click_TermsService() {
		driver.findElement(TermsofService).click();
	}
	public void click_ShippingProceedCheckout() {
		driver.findElement(ShippingCheckout).click();
	}
	public void Validate_landedonPaymentMethod() {
		driver.findElement(ValidatePaymentmethod).click();
	}
	
	public void Validate_ProductDetails() {
		String expecteitem1 = driver.findElement(ProductValidteItem1).getText();
		String expecteditem2 = driver.findElement(ProductValidteItem2).getText();
		Assert.assertEquals(expecteitem1, actualitem1);
		Assert.assertEquals(expecteditem2,actualitem2);
	}
	
	public void Validate_TotalPriceofItems() {
		String totalprice = driver.findElement(TotalPrice).getText();
		System.out.println("The total proce of the Item is "+ totalprice);
	}
	
	public void Click_Singout() {
		driver.findElement(Signout).click();
	}
}
