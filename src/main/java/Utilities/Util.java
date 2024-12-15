package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import BaseClass.BrowserSetup;

public class Util extends BrowserSetup {

	public Util(WebDriver driver) {
		BrowserSetup.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void DropdownValue(WebElement xpath , String value) {
		Select dropdownValue = new Select(xpath);
		dropdownValue.selectByVisibleText(value);
	}
	

	
	

}
