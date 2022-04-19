package orangeHrmPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import pages.DashBoardPage;
import pages.LogInPage;

public class TestingLogIn {

	WebDriver driver;

	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\chromedriver.exe";
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";

	@BeforeTest
	public void setUp() {
		System.setProperty(chromeDriver, driverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority=1)
	public void logIn() throws Exception {
		/*Since we have created object of the LogInPage, we have to pass driver as the param
		 *Therefore internally how it would work is;
		 *1. It will get the driver from LogIn page
		 *2. It will match with global variable of this page
		 *3. Finally it will match with line no 20 */
		LogInPage login = new LogInPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.enterUserName("Admin");
		login.enterPassword("admin123");
		login.clickOnLogIn();
	}
	
	@Test(priority=2)
	public void logOut() {
		DashBoardPage logOut = new DashBoardPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logOut.clickOnLogout();
	}

	@AfterTest
	public void closeBorser() {
		driver.close();
	}
}
