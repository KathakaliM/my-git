import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFinal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://ecdy-test.prc.us2.oraclecloud.com/procurement/faces/FndOverview");
		TimeUnit.SECONDS.sleep(10);
	
		driver.findElement(By.id("userid")).sendKeys("Lakshaman.parihar");
	
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("Honey1comb");
		
		driver.findElement(By.id("btnActive")).click();//Sign in
		TimeUnit.SECONDS.sleep(10);
		
		
		

  // For finding the navigator Icon and hitting the navigator
		
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
		TimeUnit.SECONDS.sleep(10);
	
		
		// for finding the product information management ICON and Hitting the Icon
		
		driver.findElement(By.id("pt1:nvi_itemNode_product_management_items::icon")).click();
		

		///Item search test case started////
		
		// for finding the refresh  ICON and Hitting the Icon
		TimeUnit.SECONDS.sleep(30);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt1:0:pt1:ip1:dc_cil2::icon")).click();
		TimeUnit.SECONDS.sleep(30);

		//for finding the search   ICON and Hitting the search Icon
		
		WebElement Locate = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
					Locate.click();
					Locate.click();
					TimeUnit.SECONDS.sleep(30);

					
					// giving the item name 
					
					driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys("TEST_1234");//enter search text
				
					TimeUnit.SECONDS.sleep(20);
					
					// Searching  the item name and hit
					driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
					TimeUnit.SECONDS.sleep(20);
					System.out.println("Able to search the item ");
				       System.out.println("Test case for search Item is Successfull");	

	

		///Item search test case completed////

				        
				        
		
		///Item update test case started////


						TimeUnit.SECONDS.sleep(10);
		
		//FOr finding the Specification Tab Locator.
					WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
					SpecificationTabFind.click();
					SpecificationTabFind.click();
					TimeUnit.SECONDS.sleep(10);
					
					// Find the standard lot size locator and give the value for it.
					WebElement standardLotSizeValue = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:0:ItemCos:0:inputText1::content"));//enter locator text value.
					
					// Clear the standard lot size  value
					standardLotSizeValue.clear();
					
					//Enter the Value for standard lot size
					standardLotSizeValue.sendKeys("111");
					
					Thread.sleep(2000);
					
					// Finding the Save Locator id and hitting the save button.
					driver.findElement(By.linkText("Save")).click();
					System.out.println("Update Item is Successfull");
					System.out.println("Test case for Update Item is Successfull");
					
					

	}

}
