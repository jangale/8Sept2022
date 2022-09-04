package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.OrdersPage;
import Pages.loginePage;

public class OrdersPageTest extends TestBase {
	
	loginePage login;
	
	@BeforeMethod
	public void setUp() throws Throwable
	{
		 initilization();
		 Thread.sleep(2000);
		 login =new loginePage();
		 login.loginZerodhaapp();
	}
	
	@Test
	public void verifyorderbuttonOperationsTest() throws Throwable
	{
		OrdersPage order=new OrdersPage();
		order.verifyorderbuttonOperations();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
