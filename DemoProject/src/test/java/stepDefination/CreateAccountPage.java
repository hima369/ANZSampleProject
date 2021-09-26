package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.en.*;
import pageObjects.CreateAccountPageObjects;
import pageObjects.HomePageObjects;
import pageObjects.SingInPageObjects;

public class CreateAccountPage {

	public CreateAccountPageObjects createacct = new CreateAccountPageObjects(DriverFactory.getDriver());

	@When("Validate user landed on Authenticatoin page")
	public void validate_user_landed_on_authenticatoin_page() {

		DriverFactory.getDriver().get("http://automationpractice.com/index.php");

		createacct.click_singin();
		createacct.check_authenitcation();

	}

	@When("Enter EmailID {string} in createAccountEmail field")
	public void enter_email_id_in_create_account_email_field(String createEmailId) {
		createacct.setEmailAddress(createEmailId);

	}

	@Then("Click on CreatAnAccount button")
	public void click_on_creat_an_account_button() {
		createacct.click_CreateAccount();
	}

	@Then("User Land on Create An Account Page")
	public void user_land_on_create_an_account_page() throws Exception {
		Assert.assertTrue(createacct.validateText_PersonalInformation());
	}

	@Then("Select Title {string} from personalInformation")
	public void select_title_from_personal_information(String string) {
		createacct.set_Title(string);
	}

	@Then("Enter Firstname {string} on PersonalInforamtion")
	public void enter_firstname_on_personal_inforamtion(String firstname) {
		createacct.set_Firstname(firstname);
	}

	@Then("Enter Lastname {string} on PersonalInformation")
	public void enter_lastname_on_personal_information(String lastname) {
		createacct.set_Lastname(lastname);

	}

	@Then("Enter Password {string} on PersonalInformation")
	public void enter_password_on_personal_information(String password) {

		createacct.set_Password(password);
	}

	@Then("Enter Address {string} in Your Address field")
	public void enter_address_in_your_address_field(String address) {
		createacct.set_Address(address);
	}

	@Then("Enter City {string} in Your Address section")
	public void enter_city_in_your_address_section(String city) {
		createacct.set_City(city);

	}

	@Then("Select State {string}")
	public void select_state(String state) {
		createacct.set_State(state);
	}

	@Then("Enter PostalCode {string}")
	public void enter_postal_code(String postalcode) {
		createacct.set_Postalcode(postalcode);
	}

	@Then("Enter Mobile Phone {string}")
	public void enter_mobile_phone(String mobilephone) {
		createacct.set_Mobilephone(mobilephone);
	}

	@Then("Click on Resister button")
	public void click_on_resister_button() {
		createacct.click_Register();
	}

}
