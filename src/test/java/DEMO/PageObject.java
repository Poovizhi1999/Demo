package DEMO;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class PageObject {
	
	//store all the objects/webelements available in every page
	static WebDriver driver;
	//public PageObject(WebDriver driver){
		//PageFactory.initElements(driver, this);
	//}
	
	//identify elements
	@FindBy(name="userName") public static WebElement username;
	@FindBy(name="password") public static WebElement password;
	@FindBy(xpath="//input[@name='login']") public static WebElement Login;
	
	public void login(){
		username.sendKeys("mercury");
		password.sendKeys("mercury");
		Login.click();
	}
}