package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyInfo {
	WebDriver driver;

	By InfoXpath = By.xpath("//*[@id=\'menu_pim_viewMyDetails\']/b");

	public MyInfo(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnInfo() {
		driver.findElement(InfoXpath).click();
	}

}
