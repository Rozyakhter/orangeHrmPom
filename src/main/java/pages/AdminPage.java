package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage extends BasePage  {
	
	By adminXpath = By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b");
	
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	
	public void clickOnAdmin() {
		driver.findElement(adminXpath).click();
	}
}
