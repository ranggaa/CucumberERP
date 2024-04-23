package stepDefination;

import org.openqa.selenium.WebDriver;

import commonFunctions.FunctionLibrary;




public class CustomerSteps {
	WebDriver driver;

@Given("^User launch Browser$")
public void startBrowser() throws Throwable {
     driver=FunctionLibrary.startBrowser();
}

@When("^user Enter url as \"([^\"]*)\" in a browser$")
public void openUrl(String url) throws Throwable {
    FunctionLibrary.openUrl(url);
}

@When("^User Wait for username with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitforUser(String LocatorName, String LocatorValue) throws Throwable {
    FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
}

@When("^user enter user name with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void enterUser(String LocatorName, String LocatorValue, String TestData) throws Throwable {
    FunctionLibrary.typeAction(LocatorName, LocatorValue, TestData);
}

@When("^user enter password with \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void Enterpass(String LocatorName, String LocatorValue, String TestData) throws Throwable {
	FunctionLibrary.typeAction(LocatorName, LocatorValue, TestData);
}

@When("^user click login with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickLogin(String LocatorName, String LocatorValue) throws Throwable {
    FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^user Wait for customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitforCustomerlink(String LocatorName, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
}

@When("^user click customer link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickCustomerlink(String LocatorName, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^Wait for Add icon with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitforAddicon(String LocatorName, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
}

@When("^click Add icon button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickAddiconbutton(String LocatorName, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^Wait for Customer Number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void waitforcustomernumber(String LocatorName, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
}

@When("^capture customer number with \"([^\"]*)\" and \"([^\"]*)\"$")
public void capturecNumber(String LocatorName, String LocatorValue) throws Throwable {
    FunctionLibrary.captuerCustomer(LocatorName, LocatorValue);
}
@When("^Enter in \"([^\"]*)\" with \"([^\"]*)\" and \"([^\"]*)\"$")
public void AddCustomer(String TestData, String LocatorName, String LocatorValue) throws Throwable {
    FunctionLibrary.typeAction(LocatorName, LocatorValue, TestData);
}

@When("^Click Add button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clickAddbutton(String LocatorName, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^Wait for Confirm Ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_Confirm_Ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
}

@When("^Clcik confirm ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clcik_confirm_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^Wait for Alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void wait_for_Alert_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
	 FunctionLibrary.waitForElement(LocatorName, LocatorValue, "10");
}

@When("^Click Alert ok button with \"([^\"]*)\" and \"([^\"]*)\"$")
public void click_Alert_ok_button_with_and(String LocatorName, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^validate customer table$")
public void validate_customer_table() throws Throwable {
    FunctionLibrary.customerTable();
}

@When("^Click logout link with \"([^\"]*)\" and \"([^\"]*)\"$")
public void clicklogout(String LocatorName, String LocatorValue) throws Throwable {
	  FunctionLibrary.clickAction(LocatorName, LocatorValue);
}

@When("^Close Browser$")
public void close_Browser() throws Throwable {
    driver.quit();
}


}
