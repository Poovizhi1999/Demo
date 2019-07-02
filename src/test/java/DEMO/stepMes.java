package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepMes {
	WebDriver driver;
	@Given("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\NexGenTesting\\sele\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demoaut.com/"); 
	    
	}

	@When("^username \"([^\"]*)\" and password is \"([^\"]*)\"$")
	public void username_and_password_is(String arg1, String arg2) throws Throwable {
		 driver.findElement(By.name("userName")).sendKeys(arg1);
		    driver.findElement(By.name("password")).sendKeys(arg2);
		    driver.findElement(By.name("login")).click();
	   
	}

	@Then("^user does \"([^\"]*)\" login$")
	public void user_does_login(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println(arg1);
	}



}
