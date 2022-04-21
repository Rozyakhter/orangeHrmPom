package orangeHrmPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

	private WebDriver driver;
	
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\chromedriver.exe";
	static String firefoxDriver = "webdriver.gecko.driver";
	static String ffdriverLocation = "C:\\Users\\Rozy Kabir\\Desktop\\rozy\\geckodriver.exe";
	static String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials";
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(chromeDriver, driverLocation);
			driver = new ChromeDriver();	
		} 
		
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(firefoxDriver, ffdriverLocation);
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeBorser() {
		driver.close();
	}
	
	public WebDriver getDriver() {
        return driver;
    }
}
