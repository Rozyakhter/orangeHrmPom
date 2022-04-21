package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfo extends BasePage {
	

	By InfoXpath = By.xpath("//*[@id=\'menu_pim_viewMyDetails\']/b");

	public MyInfo(WebDriver driver) {
		super(driver);
	}

	public void clickOnInfo() {
		driver.findElement(InfoXpath).click();
	}

}
