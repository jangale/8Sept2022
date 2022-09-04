package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class DashBoardPage extends TestBase
{
	@FindBy(xpath="//span[@class='nickname']")private WebElement nickenameLebel;
	@FindBy(xpath="//span[@class='user-id']")private WebElement userIdLebel;
	@FindBy(xpath="//h4[@class='username']")private WebElement completeNam; 
	@FindBy(xpath="//div[@class='email']")private WebElement emailId; 
	@FindBy(xpath="//span[@class='icon icon-exit']")private WebElement logoutbutton;
	
    public DashBoardPage()
     {
    	PageFactory.initElements(driver, this);
     }
    
    public String verifyNickName() throws Throwable 
    {
    	Thread.sleep(1000);
	    return nickenameLebel.getText();
    }
    public void verifyuserIdLebel() 
    {
    	
    	userIdLebel.click();
    }
    public String verifycompleteNam() throws Throwable 
    {
    	Thread.sleep(1000);
    	return completeNam.getText();
    }
    public String verifyemailId() 
    {
    	
    	return emailId.getText();
    }
    public void verifylogoutbutton() throws Throwable
    {
    	Thread.sleep(1000);
    	logoutbutton.click();
    }
    }
    