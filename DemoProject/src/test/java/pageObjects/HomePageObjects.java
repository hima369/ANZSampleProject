package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {

	
	
public WebDriver  	bdriver;
	
	public HomePageObjects(WebDriver adriver) {
		bdriver = adriver;
		PageFactory.initElements(adriver, this); 	
	}

	@FindBy(xpath = "*//input[@name='search_query']")
	public WebElement searchBox;
	
	@FindBy(xpath = "*//button[@name='submit_search']")
	public WebElement searchbutton;
	


}
