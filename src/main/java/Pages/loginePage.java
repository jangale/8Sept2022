package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.TestBase;
// find the element present on webpage //object repository
public class loginePage extends TestBase{
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kiteLogo;
	@FindBy(xpath = "//img[@alt='Zerodha']")private WebElement zerodalogo;
	@FindBy(xpath="//div[@class='form-header text-center']") private WebElement	loginLabel;
	
	@FindBy(xpath = "//input[@id='userid']")private WebElement userIdTextbox;
	@FindBy(xpath = "//input[@id='password']")private WebElement passWordTextbox;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginBtton;
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton; 
	// initialize the object by constructor
	public loginePage()
	{
		PageFactory.initElements(driver,this);
	}
	//test steps use methods 
	public void loginZerodhaapp() throws Throwable
	{
		userIdTextbox.sendKeys("UY0253");
		passWordTextbox.sendKeys("aarav1911");
		loginBtton.click();
		Thread.sleep(2000);
		pin.sendKeys("123456");
		continueButton.click();
		
		
//		//userIdTextbox.sendKeys("UY0258");
//		userIdTextbox.sendKeys(readPropertyFile("userId"));
//		passWordTextbox.sendKeys(readPropertyFile("password"));
//		loginBtton.click();
//		Thread.sleep(2000);
//		pin.sendKeys(readPropertyFile("pin"));
//		continueButton.click();
	}
	public String verifyAppTital() 
	{
		return driver.getTitle();
	}
	public String verifykiteLebel() 
	{
		return loginLabel.getText();
	}
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed();
	}
}
