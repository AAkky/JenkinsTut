package stepDefinations;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;

public class Steps {
	WebDriver driver;
	CheckoutPage loginPage;
	@Given("^User is in Toolsqa home page$")
	public void user_is_in_Flipkart_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     loginPage = new CheckoutPage(driver);
	    driver.get("http://www.shop.demoqa.com");
	}

	

	@When("^User clicks on my Account link$")
	public void user_clicks_on_my_Account_link() throws Throwable {
		loginPage.dismissLink.click();
	    loginPage.myAcc.click();
	}

	@Then("^User is navigated Register page$")
	public void user_is_navigated_Register_page() throws Throwable {
	    if(loginPage.register.isDisplayed())
	    	System.out.println("User is navigated to registration page");
	
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String name) throws Throwable {
	   loginPage.enter_Name(name);
	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) throws Throwable {
	    loginPage.enter_Password(password);
	}

	@When("^User enters email \"([^\"]*)\"$")
	public void user_enters_email(String email) throws Throwable {
	    loginPage.enter_Email(email);
	}
	@When("^Clicks on clicks on register Button$")
	public void clicks_on_clicks_on_register_Button() throws Throwable {
		loginPage.register.click();
	}

	@Then("^User is successfully registered$")
	public void user_is_successfully_registered() throws Throwable {
	   
	}

	
	



}
