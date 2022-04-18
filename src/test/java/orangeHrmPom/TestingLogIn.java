package orangeHrmPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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
	
	@Test
	public void logIn() {
		/*Since we have created object of the LogInPage, we have to pass driver as the param
		 * as because the parameterized constructor of LogInPage will accept driver as param*/
		LogInPage login = new LogInPage(driver);
		login.enterUserName("Admin");
		login.enterPassword("admin123");
		login.clickOnLogIn();
	}

	@AfterTest
	public void closeBorser() {
		driver.close();
	}
}
