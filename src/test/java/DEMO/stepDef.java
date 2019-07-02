package DEMO;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;
public class stepDef{
	WebDriver driver;
	String e="Find a Flight: Mercury Tours:";
@Given("^User is on the home page$")
public void user_is_on_the_home_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\sele\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://demoaut.com/"); 
}

@When("^User enter correct credentials$")
public void user_enter_correct_credentials() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    PageObject.username.sendKeys("mercury");
   PageObject.password.sendKeys("mercury");
   PageObject.Login.click();
}

@Then("^User does successfull login$")
public void user_does_successfull_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //Assert.assertEquals(e,driver.getTitle());
	System.out.println("success");
}
}