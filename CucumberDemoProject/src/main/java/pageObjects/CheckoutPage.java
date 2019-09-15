package pageObjects;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	public CheckoutPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='My Account']")
	public WebElement myAcc;
	
	@FindBy(xpath="//*[text()='Dismiss']")
	public WebElement dismissLink;
	
	@FindBy(xpath="//*[@class='u-column2 col-2']//h2")
	public WebElement register;
	
	@FindBy(xpath="//*[@id='reg_username']")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id='reg_email']") 
	private WebElement userEmail;
	
	@FindBy(xpath="//*[@id='reg_password']") 
	private WebElement UserPassword;
	
	@FindBy(xpath="//*[@value='Register']") 
	private WebElement registerButton;
	
	public void enter_Name(String name) {
		userName.sendKeys(name);
	}
	
	

	public void enter_Email(String email) {
		
		userEmail.sendKeys(email);
	}
	
	public void enter_Password(String password) {
		
		UserPassword.sendKeys(password);
	}
	
	
		
	}
	
	
