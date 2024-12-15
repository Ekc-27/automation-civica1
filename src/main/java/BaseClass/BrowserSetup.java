package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	public static WebDriver driver;
	static String chromepath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
	
	public static WebDriver startBrowser(String browserName, String Url ){
		if(browserName.equalsIgnoreCase("Chrome")) {
			// WebDriverManager.chromedriver().setup();
			 System.setProperty("webdriver.chrome.driver", chromepath);
				driver= new ChromeDriver();
		}else
		if(browserName.equalsIgnoreCase("IE")) {
			 WebDriverManager.iedriver().setup();
				driver= new InternetExplorerDriver();
		}else
		if(browserName.equalsIgnoreCase("Firefox")) {
			 WebDriverManager.firefoxdriver().setup();
				driver= new FirefoxDriver();
				}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(Url);
		return driver;
	}
	

}
