import com.orangehrm.page.DashboardPage;
import com.orangehrm.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends BaseTest{
	@Test
	public void testValidLogin(){
		DashboardPage dashboardPage = loginPage.login("Admin","admin123");
		assertEquals(dashboardPage.getUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	}
	@Test
	public void testValidLoginWithLeadingSpace() throws InterruptedException {
		loginPage.login("   Admin","admin123");
		assertTrue(loginPage.isAlertDisplayed());
	}
}
