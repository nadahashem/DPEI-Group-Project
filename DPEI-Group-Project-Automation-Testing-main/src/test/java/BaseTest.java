import com.base.BasePage;
import com.orangehrm.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
	private static final String ORANGE_URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	protected BasePage basePage;
	protected LoginPage loginPage;
	WebDriver driver;

	@BeforeSuite
	public void setUp() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
	}

	@BeforeMethod
	public void loadWebsite() throws InterruptedException {
		driver.get(ORANGE_URL);
		Thread.sleep(1500);
		basePage = new BasePage();
		basePage.setDriver(driver);
		loginPage = new LoginPage();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
