package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//In this class we wil keep all locators and page actions
public class LogInPage {

	//Here we are setting the driver as a global variable
	WebDriver driver;
	
	//We are storing the locator inside By class
	By loginIdXpath = By.xpath("//input[@id='txtUsername']");
	By logInpsXpath = By.xpath("//input[@id='txtPassword']");
	By loginBtnXpath = By.xpath("//input[@id='btnLogin']");

	/* Since right after creating object of any class, the constuctor gets activated so
	 * here we are passing the driver through the constructor so that on the test class
	 * when we will create object of this class our driver will be automatically passed
	 * to the test class. In this way we will pass constructor in all other pages classes*/	
	
	public LogInPage(WebDriver driver) {
		//Here we are matching the local variable with the global variable
		this.driver = driver;
	}

	//We are creating parameter so that on the test class we can pass it as input
	public void enterUserName(String userID) {
		driver.findElement(loginIdXpath).sendKeys(userID);
	}

	//We are creating parameter so that on the test class we can pass it as input
	public void enterPassword(String pass) {
		driver.findElement(logInpsXpath).sendKeys(pass);
	}

	public void clickOnLogIn() {
		driver.findElement(loginBtnXpath).click();
	}
}
