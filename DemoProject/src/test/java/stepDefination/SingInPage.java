package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverFactory.DriverFactory;

import io.cucumber.java.en.*;
import pageObjects.AddProductAndCheckoutPage;
import pageObjects.SingInPageObjects;

public class SingInPage {
	
//public WebDriver  driver;
	
 SingInPageObjects singInsignOut = new SingInPageObjects(DriverFactory.getDriver());
	
	@When("User click on SignIn")
	public void user_click_on_sign_in() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php");
		singInsignOut.click_singin();
	}

	

	@And("Enter EmailID {string} in EmailAddress field")
	public void enter_email_id_in_email_address_field(String Email) {
		singInsignOut.setEmailAddress(Email);
	}

	@And("Enter password {string} in Password field")
	public void enter_password_in_password_field(String password) throws Exception {
		singInsignOut.setPassword(password);
	}

	@And("Click on SignIn button")
	public void click_on_sign_in_button(){
	
		singInsignOut.click_Submit();
	}
	
	@When("Validate user landed on MyAccount page")
	public void validate_user_landed_on_MyAccount_page() {
		singInsignOut.check_MyAccount();
		singInsignOut.Click_Signout();
	}
	
	

}
