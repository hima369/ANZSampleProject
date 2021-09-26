package pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingInPageObjects {
	
	
	private WebDriver  	driver;
	
	public SingInPageObjects(WebDriver driver) {
		this.driver = driver; 	
	}
		
	private By SignIn = By.xpath("//a[@title='Log in to your customer account']");	
	private By MyAccount = By.xpath("//h1[text()='My account']");
	private By SingInEmailadrs = By.xpath("//input[@id='email']");	
	private By SignInPwd = By.xpath("//input[@id='passwd']");	
	private By SubmitLogin = By.xpath("//button[@id='SubmitLogin']");
	private By Signout = By.xpath("//a[@title='Log me out']");
	private By Authentication = By.xpath("//*[@id='authentication']");

	
	
	public void click_singin() {

		driver.findElement(SignIn).click();
	}
	

	public void setEmailAddress(String email)  {
		
		driver.findElement(SingInEmailadrs).sendKeys(email);		
		
	}

	public void setPassword(String pwd) throws Exception {
		Thread.sleep(1000);
		driver.findElement(SignInPwd).sendKeys(pwd);
	
	}
	public void click_Submit() {
		
		driver.findElement(SubmitLogin).click();
	}
	
	public void check_MyAccount() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		 if(driver.findElement(MyAccount).isDisplayed()) {
				System.out.println("Page is landed on MyAccount page");
				Assert.assertTrue("Page is landed on MyAccount page", true);	
			}else {
				Assert.assertTrue("Page is not landed on MyAccount page", false);
			}		 
	}
	
	public void Click_Signout() {
		driver.findElement(Signout).click();
	}
}
