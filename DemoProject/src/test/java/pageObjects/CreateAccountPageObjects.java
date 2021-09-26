package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPageObjects {

	
	private WebDriver  driver;
	
	public CreateAccountPageObjects(WebDriver driver) {
		this.driver = driver; 	
	}
	
	private By SignIn = By.xpath("//a[@title='Log in to your customer account']");	
	private By Authentication = By.xpath("//*[@id='authentication']");
	private By EmailCreate = By.xpath("//*[@id='email_create']");	
	private By SubmitCreate = By.xpath("//*[@id='SubmitCreate']");

	
	private By PersonalInfo = By.xpath("//*[contains(text(),'personal information')]");
	
	
	private By GenderMrs = By.id("id_gender2");
	private By FirstName = By.xpath("//input[@name='customer_firstname']");
	private By LastName = By.xpath("//input[@name='customer_lastname']");
	private By Password = By.xpath("//input[@id='passwd']");
	private By AdrsFirstname = By.xpath("//input[@id='firstname']");
	private By AdrsLastname = By.xpath("//input[@id='lastname']");
	private By AdressField = By.xpath("//input[@id='address1']");
	private By AdrsCity = By.xpath("//input[@id='city']");
	private By AdrsState = By.xpath("//select[@id='id_state']");
	private By AdrsPostcode = By.xpath("//input[@id='postcode']");
	private By AdrsCountry = By.xpath("//select[@id='id_country']");
	private By AdrsMobile = By.xpath("//input[@id='phone_mobile']");
	private By AdrsAlias = By.xpath("//input[@id='alias']");
	private By SubmitAccount = By.xpath("//button[@id='submitAccount']");
	private By SignOut = By.xpath("//*[@title='Log me out']");
	
	
	// Creating an Account
	public void click_singin() {
		driver.findElement(SignIn).click();
	}
	
	public void check_authenitcation() {
		 if(driver.findElement(Authentication).isDisplayed()) {
				System.out.println("Page is landed on Authentication page");
				Assert.assertTrue("Page is landed on Authentication page", true);	
			}else {
				Assert.assertTrue("Page is not landed on Authentication page", false);
			}		 
	}
	
	public void setEmailAddress(String email)  {
		
		driver.findElement(EmailCreate).sendKeys(email);
		driver.findElement(Authentication).click();
		
	}

	public void click_CreateAccount() {
		driver.findElement(SubmitCreate).click();
	}
	
// Filling Personal information
	public boolean validateText_PersonalInformation() throws Exception {
		Thread.sleep(5000);
		System.out.println(driver.findElement(PersonalInfo).isDisplayed());
		return driver.findElement(PersonalInfo).isDisplayed();
		
	}
	public void set_Title(String title) {
		driver.findElement(GenderMrs).click();
		
	}
	
	public void set_Firstname(String fstname) {
		driver.findElement(FirstName).sendKeys(fstname);
	}
	
	public void set_Lastname(String lstname) {
		driver.findElement(LastName).sendKeys(lstname);
	}
	
	public void set_Password(String pwd) {
		driver.findElement(Password).sendKeys(pwd);	
	}
	
	public void set_Address(String adrss) {
		driver.findElement(AdressField).sendKeys(adrss);
	}
	
	public void set_City(String city) {
		driver.findElement(AdrsCity).sendKeys(city);
	}
	
	public void set_State(String state) {
		Select drpstate = new Select(driver.findElement(AdrsState));
		drpstate.selectByVisibleText(state);
	}
	
	public void set_Postalcode(String postcode) {
		driver.findElement(AdrsPostcode).sendKeys(postcode);
	}
	
	public void set_Mobilephone(String mobphone) {
		driver.findElement(AdrsMobile).sendKeys(mobphone);
	}
	
	public void set_AdrsAlias(String alias) {
		driver.findElement(AdrsAlias).sendKeys(alias);
	}
	
	public void click_Register() {
		driver.findElement(SubmitAccount).click();
	}
}
