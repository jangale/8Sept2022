package Base;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	public void initilization()
	{
		System.setProperty("webdriver.chrome.driver","chromedriver");
		//WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}
	
//	public void initilization() throws Exception
//	{
//		String brows = readPropertyFile("browser") ;
//		if(brows.equals("chrome"))
//			//or//if(readPropertyFile.equals("chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//			 driver = new ChromeDriver();
//		}
//		else if(brows.equals("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver=new EdgeDriver();
//		}
//		else if(brows.equals("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver=new FirefoxDriver();
//		}
//		driver.manage().window().maximize();
//		driver.get(readPropertyFile("url"));
//		//driver.get(readExcelFile(0,0));
//	}
//	public String readPropertyFile(String value) throws Exception 
//	{
//		Properties prop = new Properties();
//		FileInputStream file = new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Frame30\\TestData\\Config.Prorerties");
//		prop.load(file);
//		return (String) prop.get(value);
//	}
//	public String readExcelFile(int row,int cell) throws Exception
//	{
//		FileInputStream file1 = new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Frame30\\TestData\\Test Data.xlsx");
//		Sheet excelValue = WorkbookFactory.create(file1).getSheet("Sheet1");
//		String dataReading = excelValue.getRow(row).getCell(cell).getStringCellValue();
//		return dataReading;
	//}
}
// i just updated my project with som modifications
