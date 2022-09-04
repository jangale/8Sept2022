package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class OrdersPage extends TestBase {
	// object Repository
	
	@FindBy(xpath="//span[text()='Orders']")private WebElement orderbutton;
	@FindBy(xpath="//button[@class='button-blue']")private WebElement getStrbutton;
	@FindBy(xpath="//input[@type='text'][2]")private WebElement searchInbox;
	@FindBy(xpath="//button[text()='Create GTT ']")private WebElement creatGTTbtn;
	@FindBy(xpath="//input[@type='number' and @animate='true' ][1]")private WebElement triggerbtn;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement qntyBtn;
	@FindBy(xpath="//input[@label='Price']")private WebElement pricebtn;
	@FindBy(xpath="//div[text()='Place']")private WebElement placeBtn;
//
//    public OrdersPage() 
//    {
//    	PageFactory.initElements(driver,this);
//    }
  /*  public void verifyorderbuttonOperations() throws Throwable
    {
    	Thread.sleep(1000);
    	orderbutton.click();
   
    	Thread.sleep(1000);
    	getStrbutton.click();
    
    
    	searchInbox.sendKeys(readExcelFile(1, 0));
    	Thread.sleep(1000);
    	Actions a = new Actions(driver);
    	a.moveToElement(searchInbox).build().perform();
    	a.sendKeys(Keys.ENTER).build().perform();
    
    
    	Thread.sleep(1000);
    	creatGTTbtn.click();
    
    
    	Thread.sleep(1000);
    	triggerbtn.sendKeys(readExcelFile(1, 1));
    

    	Thread.sleep(1000);
    	qntyBtn.sendKeys(readExcelFile(1, 2));
    
    
    	Thread.sleep(1000);
    	pricebtn.sendKeys(readExcelFile(1, 3));
   
    	Thread.sleep(1000);
    	placeBtn.click();
    }
    
    }*/
    
    
