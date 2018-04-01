
//package com.kpit.selenium.phcloud.webdrive.testcases;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.support.ui.Select;

/**
 * @author RajasekarG
 *
 */
public class PHcld {
	private WebDriver driver;
	private String baseUrl;
	private String itemNumber = "TestItem11";
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Raj\\Projects\\Java_Projects\\Selenium\\lib\\chromedriver.exe");
		driver = new FirefoxDriver();
		// System.setProperty("webdriver.firefox.marionette","C:\\Raj\\Projects\\Java_Projects\\Selenium\\lib\\geckodriver.exe");
		// driver = new FirefoxDriver();
		baseUrl = "https://ecdy-test.login.us2.oraclecloud.com/";
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	//@Test
	public void loginToPHCloud() throws Exception {
		try {
			driver.get(baseUrl
					+ "/oam/server/obrareq.cgi?encquery%3DswNQoofCaz0OCjjXNvzYbN75DaHmMYymLMnXHeI5U%2FJ1oAiG3JDfa6lH7Xq3aYZ2GqT6dFLCV2TvubvfrORDvzJU%2F2MoWUfRIydcDLVABJaRBTzuDLRo7eo1KEdRuX9DjxGis4wbrXy4ESPwCnqOTmYtGGm0fzRQ94pgIqPpgmd9tJtEx3oK8f8kAMMcMPYGmk4aR33gCN7XZ8pedX%2FARSDj8%2B6PJF%2F4VYC0CusFtQ0erpNU4ILHKtF%2BS1W9Nz2x1bYEgu3KmQ1iho0yt6G10E%2B6JjdtaMEZ2LFvdmfQ1BWbNFwqREmMRp2%2BtPpK1xHr0O2QjHULS27pRWTrPxOOd6I3FnA3d87A4vkdiqqqeQFjH70meVQ8%2FjhBG2Dbr1ctbQXo%2B0xrJyBv7SymN43Tp%2BBUtP31YUbIE8Vfb5tEGMR1OFaY8LcfnaXBmmmorx8ccKI06L1hnKh%2FMIz5Bcr7J9NPkv4zbEBq8dkyw3IcDayI1Mrav7yIHMhyFO2weU%2Bnbbk1AjcIIuLFodYry%2FwBGQ%3D%3D%20agentid%3DOraFusionApp_11AG%20ver%3D1%20crmethod%3D2&ECID-Context=1.005NZnwdrtt4AxY_tpc9yX0003Ir0001gg%3BkXhgv0ZCLILIIV8QjTPPGHRP_V9O%5EMPGpKSQ_UOTdJPOoPRRiG");
			assertEquals(driver.getTitle(), "Sign In");
			driver.findElement(By.id("userid")).clear();
			driver.findElement(By.id("userid")).sendKeys("Demo.User");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("Welcome1");
			driver.findElement(By.id("btnActive")).click();
			// assertEquals(driver.getTitle(), "");
			// assertEquals(driver.getTitle(), "Welcome");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void logOutFromPHCloud() throws Exception {
		try {

			//driver.findElement(By.id("pt1:_UIScmil1u::icon")).click(); // not consistent in all pages
						
			driver.findElement(By.xpath("//img[contains(@id,'pt1:_UIScmil1u::icon')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(@id,'pt1:_UISlg1')]")).click();
			//driver.findElement(By.id("pt1:_UISlg1")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("Confirm")).click();
			driver.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//driver.close();

		}
	}

	public void navigateToPHHome() throws Exception {
		try {
			// driver.get(baseUrl +
			// "/homePage/faces/AtkHomePageWelcome?_adf.ctrl-state=17zx3xz6gh_147&_afrLoop=69852997498825971&_afrWindowMode=0&_afrWindowId=ocsstgrlv&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=634&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");
			// assertEquals(driver.getTitle(), "Welcome");
			//driver.findElement(By.id("pt1:_UISmmLink::icon")).click(); // to go via navigation icon
			//driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();// to go via navigation icon
			driver.findElement(By.id("pt1:_UIShome::icon")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cil_grp_groupNode_product_management::icon")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cil_wrk_itemNode_product_management_items::icon")).click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void createItem() throws Exception {
		try {
			
			//Select orgSelect;
						
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl1")).click(); //to click Create Item link
			Thread.sleep(1000);
		    driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:organizationDispId::content")).sendKeys("KPIT");
		    Thread.sleep(1000);
		   // driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::content")).clear();
		    driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:itemClassId::content")).sendKeys("Root Item Class");
		    Thread.sleep(3000);
		    driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:nitxt::content")).click(); //click the No. of Items text box, just to refresh the page
		    //driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:AppTe:0:selectManyShuttle1_tr")).sendKeys("Finished Goods");//to select item template
		    Thread.sleep(1000);
		    driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:commandButton3")).click();
		    Thread.sleep(1000);
		   
		    driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText1::content")).sendKeys(itemNumber);//Item number
		    driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:r10:0:inputText2::content")).sendKeys(itemNumber);//Item Description
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt3:0:pt1:ap1:csave']/table/tbody/tr/td/a/span")).click();//click save button
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public void searchItem() throws Exception {
		try {
			
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")).click(); //click search icon
			Thread.sleep(1000);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(itemNumber);//enter search text
			Thread.sleep(1000);
			driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button
			
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
			//System.setProperty("webdriver.chrome.driver","C:\\Raj\\Projects\\Java_Projects\\Selenium\\lib\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.get("https://ecdy-test.fin.us2.oraclecloud.com/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

