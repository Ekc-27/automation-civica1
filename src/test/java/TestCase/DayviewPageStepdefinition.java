package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import BaseClass.BrowserSetup;
import PageObjectory.LoginPage;
import PageObjectory.DayviewPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DayviewPageStepdefinition extends BrowserSetup {

    static Properties prop;
    static FileInputStream file;
    static File filepath = new File(System.getProperty("user.dir") + "\\config\\file.properties");
    LoginPage lg;
    DayviewPage dayviewpage;

    @Before
    public void Configuration() {
        // Initialize the browser and navigate to the URL before each scenario
        if (driver == null) {  // Check if the driver is not already initialized
            // Pass browser type ("Chrome") and the URL for the login page
            driver = startBrowser("Chrome", "https://www.google.co.uk/");
        }

        // Load configuration properties
        try {
            file = new FileInputStream(filepath);
            prop = new Properties();
            prop.load(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Given("^User is on login page$")
    public void user_is_on_login_page() throws Throwable {
        dayviewpage = new DayviewPage(driver);  // Pass WebDriver instance to Page Object
        // Optionally, navigate to a specific page here, but we are already on the login page
        driver.get("https://next.malinko-uat.co.uk");
        Thread.sleep(3000);
    }

    @Then("^User enters Username\"([^\"]*)\"$")
    public void user_enters_Username(String UserName) throws Throwable {
        dayviewpage.enterUsername(UserName);
    }

    @Then("^User enters Password \"([^\"]*)\"$")
    public void user_enters_Password(String Password) throws Throwable {
        dayviewpage.enterPassword(Password);
    }

    @Then("^User clicked on login button$")
    public void user_clicked_on_login_button() throws Throwable {
        dayviewpage.loginButtonClick();
    }

    @Then("^the user goes to the dayview page$")
    public void the_user_goes_to_the_dayview_page() throws Throwable {
        driver.get("https://next.malinko-uat.co.uk/day/user");
        Thread.sleep(3000);
    }

    @Then("^the user clicks the load button$")
    public void the_user_clicks_the_load_button() throws Throwable {
        dayviewpage.loadButtonClick();
        Thread.sleep(3000);
       // driver.close();
        
        if (driver != null) {
            driver.quit();  // This closes the browser and ends the WebDriver session
            driver = null;
        }        
        
        
    }
}
