package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BrowserSetup;

public class WeekviewPage extends BrowserSetup {

	public WeekviewPage(WebDriver driver) {
		BrowserSetup.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//input[@id='user_email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='user_password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	@FindBy(xpath = "//input[@value='Load']")
	private WebElement loadButton;
	

	public void enterUsername(String value) {
		username.sendKeys(value);
	}

	public void enterPassword(String value) {
		password.sendKeys(value);
	}

	public void loginButtonClick() {
		loginButton.click();
	}
	
	public void loadButtonClick() {
		loadButton.click();
	}
	
	
	/*
	public void Password(String value) {
		Password.sendKeys(value);
	}

	public void LoginBtn() {
		LoginBtn.click();
	}
*/
}
