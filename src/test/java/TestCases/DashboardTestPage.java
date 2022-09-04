package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.DashBoardPage;
import Pages.loginePage;

public class DashboardTestPage extends TestBase{
	DashBoardPage dashboard;
	loginePage login;
	
	@BeforeMethod
	public void setup() throws Throwable
	{
		 initilization();
		 login=new loginePage();
	     dashboard=new DashBoardPage();
	     login.loginZerodhaapp();
	     Thread.sleep(2000);
	}
	@Test
	public void verifyNickNameTest() throws Throwable
	{
		String nickName = dashboard.verifyNickName();
		System.out.println(nickName);
	}
	@Test
	public void verifyuserIdLebelTest() throws Throwable
	{
		Thread.sleep(2000);
		dashboard.verifyuserIdLebel();
	}
	@Test
	public void verifycompleteNamTest() throws Throwable  
	{
		dashboard.verifyuserIdLebel();
		String name = dashboard.verifycompleteNam();
		System.out.println(name);
	}
	@Test
	public void verifyemailIdTest() 
	{
		dashboard.verifyuserIdLebel();
		String emailId = dashboard.verifyemailId();
		System.out.println(emailId);
	}
	@Test
	public void verifylogoutbuttonTest() throws Throwable
	{
		dashboard.verifyuserIdLebel();
		dashboard.verifylogoutbutton();
	}
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
