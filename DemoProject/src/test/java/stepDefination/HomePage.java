package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;


public class HomePage {
	

	public WebDriver  driver;
	public HomePageObjects hpo;
	
	@Given("User launch the browser")
	public void user_launch_the_browser() {

		System.setProperty("webdriver.chrome.driver","E://JavaTraining//SpringbootJavaWorkspace//DemoProject//Drivers//chromedriver.exe");
		 	driver =new ChromeDriver();
		 	hpo = new HomePageObjects(driver);	 
		
		System.out.println("user launch the browser");
		 	
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	
		System.out.println("user opens url");
	}

	@When("Validate Title of the Page")
	public void validate_title_of_the_page() {
		
		String titlepg = driver.getTitle();
		
		System.out.println(titlepg);
		System.out.println("title of the page is :" + titlepg );

	}

	@When("Validate search box is available on the page")
	public void validate_search_box_is_available_on_the_page() {
		System.out.println(hpo.searchBox.isDisplayed());
		System.out.println(" search box is available on the page");

	}

	@Then("Close Browser")
	public void close_browser() {
		System.out.println("close the brwser");
	}

	

}