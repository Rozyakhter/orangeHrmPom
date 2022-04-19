package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

	WebDriver driver;
	
	By welcomeXpath = By.xpath("//*[@id=\"welcome\"]");
	By logoutXpath = By.xpath("//*[@id=\'welcome-menu\']/ul/li[3]/a");
	
	public DashBoardPage(WebDriver driver){
		this.driver = driver;
		
	}
	public void clickOnLogout() {
		driver.findElement(welcomeXpath).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(logoutXpath).click();
	}
	
}

