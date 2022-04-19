package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

	WebDriver driver;
	By adminXpath = By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b");
	
	public AdminPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnAdmin() {
		driver.findElement(adminXpath).click();
	}
}
