import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BusinessRuleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:/SeleniumTest/Selie/configs/Configuration.properties");

		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			
			WebDriver driver = new FirefoxDriver();
			driver.navigate().to(prop.getProperty("url"));
			driver.manage().window().maximize();
			TimeUnit.SECONDS.sleep(10);
			
			driver.findElement(By.id("userid")).sendKeys(prop.getProperty("username"));
		
			driver.findElement(By.id("password")).clear();
			
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			
			driver.findElement(By.id("btnActive")).click();//Sign in
			TimeUnit.SECONDS.sleep(15);
			
			TimeUnit.SECONDS.sleep(10);
			
			
			//click to navigator icon
			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_grp_groupNode_product_management")).click();//click on Product Management
			TimeUnit.SECONDS.sleep(20);
			driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_wrk_itemNode_product_management_items")).click();
			TimeUnit.SECONDS.sleep(20);
			
			//for finding the search   ICON and Hitting the search Icon
			TimeUnit.SECONDS.sleep(30);
			WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
			search.click();
						
						TimeUnit.SECONDS.sleep(10);
						
						// giving the item name 
						
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys(prop.getProperty("BnRuleItem"));//enter search text
					
						TimeUnit.SECONDS.sleep(10);
						
						// Searching  the item name and hit
						driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
						
						System.out.println("Able to search the item ");
					       System.out.println("Test case for search Item is Successfull");	

					       
						    ///Item specification update test case started////


									       TimeUnit.SECONDS.sleep(20);
											
											//FOr finding the Specification Tab Locator.
														WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
														SpecificationTabFind.click();
														TimeUnit.SECONDS.sleep(30);
														
														
													
														//For single row attribute
														WebElement single = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK2"));
														single.click();
														TimeUnit.SECONDS.sleep(30);
														TimeUnit.SECONDS.sleep(40);
														WebElement Tfcode = driver.findElement(By.name("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:tfCode"));
														Tfcode.clear();
														
														Tfcode.sendKeys(prop.getProperty("BnValue"));
														TimeUnit.SECONDS.sleep(40);
														
														// Finding the Save Locator id and hitting the save button.
														driver.findElement(By.linkText("Save")).click();
														TimeUnit.SECONDS.sleep(40);
														
														//To hit Ok button
														driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:d4::ok")).click();
														TimeUnit.SECONDS.sleep(40);
														
														WebElement Value = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:tfCode::content"));
														String verify = Value.getAttribute("value");
														System.out.println("current Tfvalue = "+verify);
														
														TimeUnit.SECONDS.sleep(10);
														System.out.println("Test case passed");
			                                       
														
			

			 //Home Icon
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	



	}


