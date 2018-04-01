//package com.kpit.selenium.phcloud.webdrive.testcases;

//import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

/**
 * @author RajasekarG
 *
 */
public class PHCloudLogOut {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver","C:\\Raj\\Projects\\Java_Projects\\Selenium\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
    baseUrl = "https://ecdy-test.login.us2.oraclecloud.com/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
  }

  @Test
  public void logOutFromPHCloud() throws Exception {
    driver.get(baseUrl + "/homePage/faces/AtkHomePageWelcome?_afrLoop=69837852964515487&_afrWindowMode=0&_afrWindowId=oa0x1dwqq&_adf.ctrl-state=25brp08lw_74&_afrFS=16&_afrMT=screen&_afrMFW=1366&_afrMFH=634&_afrMFDW=1366&_afrMFDH=768&_afrMFC=8&_afrMFCI=0&_afrMFM=0&_afrMFR=96&_afrMFG=0&_afrMFS=0&_afrMFO=0");
   // assertEquals(driver.getTitle(), "Welcome");
    driver.findElement(By.id("pt1:_UIScmil1u::icon")).click();
    Thread.sleep(500);
    driver.findElement(By.id("pt1:_UISlg1")).click();
    Thread.sleep(500);
    driver.findElement(By.id("Confirm")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

}
