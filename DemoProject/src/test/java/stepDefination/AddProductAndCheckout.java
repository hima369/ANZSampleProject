package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import driverFactory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.AddProductAndCheckoutPage;

public class AddProductAndCheckout {

	AddProductAndCheckoutPage addprodcheckout = new AddProductAndCheckoutPage(DriverFactory.getDriver());

	@Given("User is already login to the application")
	public void user_is_already_login_to_the_application(DataTable Mystoretable) {

		DriverFactory.getDriver().get("http://automationpractice.com/index.php");

		addprodcheckout.clicksingIn();
		addprodcheckout.user_SingIntoApplication(Mystoretable);

	}

	@Given("User is click on Womens tab to shop")
	public void user_is_click_on_womens_tab_to_shop() {
		addprodcheckout.click_Womentab();
	}

	@Then("User select itmes and Add to cart and proceed to checkout")
	public void user_select_item1_and_add_to_cart() {
		addprodcheckout.select_item();
	}

	@Then("User should be landed on Shopping cart Summary")
	public void user_should_be_landed_on_shopping_cart_summary() {
		addprodcheckout.Validate_landedonCartSummary();
	}

	@Then("User continues to Summary Checkout")
	public void user_continues_to_summary_checkout() {
		addprodcheckout.click_SummaryProceedCheckout();
	}

	@Then("User Continues to Address Checkout")
	public void user_continues_to_address_checkout() {
		addprodcheckout.click_AddressProceedCheckout();
	}

	@Then("Select Terms of service on Shipping tab")
	public void select_terms_of_service_on_shipping_tab() {
		addprodcheckout.click_TermsService();
	}

	@Then("User Continues to Shipping Checkout")
	public void user_continues_to_shipping_checkout() {
		addprodcheckout.click_ShippingProceedCheckout();
	}

	@Then("User should land on PaymentMethod tab")
	public void user_should_land_on_payment_method_tab() {
		addprodcheckout.Validate_landedonPaymentMethod();
	}

	@Then("Validate the product detiails")
	public void validate_the_product_detiails() {
		addprodcheckout.Validate_ProductDetails();
	}

	@Then("Check the total price of the item")
	public void check_the_total_price_of_the_item() {
		addprodcheckout.Validate_TotalPriceofItems();
	}

	@Then("User Sign out of the application")
	public void user_sign_out_of_the_application() {

	}

}
