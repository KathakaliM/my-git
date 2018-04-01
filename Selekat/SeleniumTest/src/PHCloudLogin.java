


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


//@Kathakali

public class PHCloudLogin {
	private static final long timeOutInSeconds = 0;
	private WebDriver driver;
	private String baseUrl;
	private String itemNumber = "TEST_1234";
	 private String itemNumber1 = "11";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		
		//baseUrl = "https://adc-fap0828-fa-ext.oracledemos.com/fscmUI/faces/FuseWelcome";
		baseUrl = "https://ecdy-test.prc.us2.oraclecloud.com/procurement/faces/FndOverview";
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	}

	//@Test
	public void loginToPHCloud() throws Exception {
		try {
			driver.get(baseUrl);		
			assertEquals(driver.getTitle(), "Sign In");
			driver.findElement(By.id("userid")).clear();
			//driver.findElement(By.id("userid")).sendKeys("scm_impl");
			driver.findElement(By.id("userid")).sendKeys("Lakshaman.parihar");
			driver.findElement(By.id("password")).clear();
			//driver.findElement(By.id("password")).sendKeys("Nfu54679");
			driver.findElement(By.id("password")).sendKeys("Honey1comb");
			driver.findElement(By.id("btnActive")).click();
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	

	public void navigateToPHHome() throws Exception {
		try {
			
			driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("pt1:nvi_itemNode_product_management_items::icon")).click();
			TimeUnit.SECONDS.sleep(20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public  void searchItem() throws Exception {
		try {
			//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt1:0:pt1:ip1:dc_cil2::icon")).click();
			TimeUnit.SECONDS.sleep(40);
			WebElement Locate = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
			Locate.click();
			Locate.click();
			TimeUnit.SECONDS.sleep(40);
			
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(itemNumber);//enter search text
		
			TimeUnit.SECONDS.sleep(20);
			WebElement Locate6 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon"));//click search button
			Locate6.click();
			
			//Locate6.click();
			TimeUnit.SECONDS.sleep(20);
			WebElement Locate2 = driver.findElement(By.linkText("Specifications"));//specification
			Locate2.click();
			Locate2.click();
			TimeUnit.SECONDS.sleep(30);
			WebElement Locate3 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:0:ItemCos:0:inputText1::content"));//enter search text
			Locate3.clear();
			Locate3.sendKeys(itemNumber1);
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.linkText("Save")).click();
			System.out.println("Update Item is Successfull");
			
			TimeUnit.SECONDS.sleep(20);

			
			WebElement Locate4 = driver.findElement(By.linkText("Categories"));
			Locate4.click();
			Locate4.click();
			TimeUnit.SECONDS.sleep(20);

			WebElement Locate5 = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:create::icon"));//add row
			Locate5.click();
			Thread.sleep(3000);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Catalog::lovIconId")).click();
			//WebElement Locate8 = driver.findElement(By.xpath("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:4:Catalog::dropdownPopup::popup-container"));
			//Locate8.click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("E Catalog")).click();
			TimeUnit.SECONDS.sleep(20);
			//Locate8.click();
			/*Select obj = new Select(Locate8);
			Thread.sleep(3000);
			 List <WebElement> option = obj.getOptions();
			System.out.println(option.size()); 
			
			Thread.sleep(2000);
			obj.selectByIndex(2);
			driver.findElement(By.linkText("Save")).click();
			System.out.println("Categories Item is Successfull");
			*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
	
	public void invokeBrowser(){
		try {
			//
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.get(" https://adc-fap0846-fa-ext.oracledemos.com/fscmUI/faces/FuseWelcome");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:4:Catalog::dropdownPopup::dropDownContent::db
}
