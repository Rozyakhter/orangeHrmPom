package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	WebDriver driver;

	By loginIdXpath = By.xpath("//input[@id='txtUsername']");
	By logInpsXpath = By.xpath("//input[@id='txtPassword']");
	By loginBtnXpath = By.xpath("//input[@id='btnLogin']");

	//Here we are passing the driver through the constructor
	public LogInPage(WebDriver driver) {
		this.driver=driver;
	}

	public void enterUserName(String userID) {
		driver.findElement(loginIdXpath).sendKeys(userID);
	}

	public void enterPassword(String pass) {
		driver.findElement(logInpsXpath).sendKeys(pass);
	}

	public void clickOnLogIn() {
		driver.findElement(loginBtnXpath).click();
	}
}
