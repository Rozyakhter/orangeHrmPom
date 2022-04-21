package orangeHrmPom;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import pages.AdminPage;
import pages.DashBoardPage;
import pages.LogInPage;
import pages.MyInfo;

public class TestingLogIn extends BaseTest {
	
	@Test(priority = 1, description = "We are loggin into the application")
	public void logIn() {
		LogInPage login = new LogInPage(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.enterUserName("Admin");
		login.enterPassword("admin123");
		login.clickOnLogIn();
	}

	@Test(priority = 2, dependsOnMethods = { "logIn" }, description = "We are checking info")
	public void checkInfo() {
		MyInfo info = new MyInfo(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		info.clickOnInfo();
	}

	@Test(priority = 3, dependsOnMethods = { "logIn" }, description = "We are clicking adminPage")
	public void adminpage() {
		AdminPage admin = new AdminPage(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		admin.clickOnAdmin();
	}

	@Test(priority = 4, dependsOnMethods = { "logIn" }, description = "We are logging out")
	public void logOut() {
		DashBoardPage logOut = new DashBoardPage(getDriver());
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logOut.clickOnLogout();
	}
}
