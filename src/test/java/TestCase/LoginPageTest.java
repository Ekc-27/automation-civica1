package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import BaseClass.BrowserSetup;
import PageObjectory.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginPageTest extends BrowserSetup{
	
	static Properties prop;
	static FileInputStream file;
	static File filepath = new File(System.getProperty("user.dir") + "\\config\\file.properties");
	LoginPage lg;
	
	@Before
	public void Configuration(){
		try {
			file = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Given("^User is on login page1$")
	public void user_is_on_login_page() throws Throwable {
		driver = BrowserSetup.startBrowser(prop.getProperty("browserName"), prop.getProperty("Url"));  
	}

	@Then("^User enters Username1\"([^\"]*)\"$")
	public void user_enters_Username(String UserName) throws Throwable {
		Thread.sleep(10000);
	     lg = new LoginPage(driver);
	    lg.UserName(UserName);
	    
	}

	@Then("^User enters Password1 \"([^\"]*)\"$")
	public void user_enters_Password(String Password) throws Throwable {
	    lg.Password(Password);
	    
	}

	@Then("^User clicked on login button1$")
	public void user_clicked_on_login_button() throws Throwable {
	    lg.LoginBtn();
	    
	}

	@Then("^Verify title of the page1$")
	public void verify_title_of_the_page() throws Throwable {
	    driver.getTitle();
	    driver.close();
	    
	}


	

}
