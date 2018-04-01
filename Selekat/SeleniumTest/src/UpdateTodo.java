//package oracle.apps.logon;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdateTodo {
	
	public static void main(String[] args) throws Exception   {
		try{	
			String itemnumber = "Test_18032018";
			WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://ecdy-test.prc.us2.oraclecloud.com/procurement/faces/FndOverview");
		TimeUnit.SECONDS.sleep(10);
	
		driver.findElement(By.id("userid")).sendKeys("Lakshaman.parihar");
	
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("Honey1comb");
		
		driver.findElement(By.id("btnActive")).click();//Sign in
		TimeUnit.SECONDS.sleep(15);
/////Item update test case compledted
	
		///Item search test case started////
		
				driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_grp_groupNode_product_management")).click();//click on Product Management
				TimeUnit.SECONDS.sleep(10);
				driver.findElement(By.id("pt1:atkfr1:0:grid:0:cl_wrk_itemNode_product_management_items")).click();
				TimeUnit.SECONDS.sleep(10);
				
				// for finding the refresh  ICON and Hitting the Icon
				//TimeUnit.SECONDS.sleep(30);
				//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt1:0:pt1:ip1:dc_cil2::icon")).click();
				
				//for finding the search   ICON and Hitting the search Icon
				TimeUnit.SECONDS.sleep(30);
				WebElement search = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")) ;//click search icon
				search.click();
							
							TimeUnit.SECONDS.sleep(10);
							
							// giving the item name 
							
							driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys("19MARSS1");//enter search text
						
							TimeUnit.SECONDS.sleep(10);
							
							// Searching  the item name and hit
							driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();//click search button 
							
							System.out.println("Able to search the item ");
						       System.out.println("Test case for search Item is Successfull");	

			

				

						       
			    ///Item update test case started////


						      /* TimeUnit.SECONDS.sleep(10);
								
								//FOr finding the Specification Tab Locator.
											WebElement SpecificationTabFind = driver.findElement(By.linkText("Specifications"));//specification
											SpecificationTabFind.click();
											TimeUnit.SECONDS.sleep(30);
											
											
											//For Single row attribute update
											
											WebElement single = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK1"));
											single.click();
											TimeUnit.SECONDS.sleep(30);
											WebElement Tfcode = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:1:CTXRN1:0:tfCode::content"));
											Tfcode.clear();
											
											Tfcode.sendKeys("Test");
											TimeUnit.SECONDS.sleep(30);
											driver.findElement(By.linkText("Save")).click();
											System.out.println("Updated single row attribute");
											
											//For muti row attribute
											WebElement multiple = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:r1:0:dynam1:0:PGLNK2"));
											multiple.click();
											TimeUnit.SECONDS.sleep(30);
											
											// Finding the Save Locator id and hitting the save button.
											driver.findElement(By.linkText("Save")).click();
											// Find the standard lot size locator and give the value for it.
											WebElement standardLotSizeValue = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sspecf:1:dynReg:0:ItemCos:0:inputText1::content"));//enter locator text value.
											standardLotSizeValue.clear(); // Clear the standard lot size  value
											standardLotSizeValue.sendKeys("111"); //Enter the Value for standard lot size
											
											TimeUnit.SECONDS.sleep(10);
											
											// Finding the Save Locator id and hitting the save button.
											driver.findElement(By.linkText("Save")).click();
											System.out.println("Update Item is Successfull");
											System.out.println("Test case for Update Item is Successfull");
											
									*/		//Home Icon
											/*TimeUnit.SECONDS.sleep(10);
											driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();*/
											
				///Item update test case Completed////	
				
				//// Categories Creation
						       TimeUnit.SECONDS.sleep(10);
											WebElement cat = driver.findElement(By.linkText("Categories"));
											cat.click();							
											
											
											TimeUnit.SECONDS.sleep(10);
											WebElement addRw = driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:create::icon"));//add row
											addRw.click();	
											
											TimeUnit.SECONDS.sleep(30);
											WebElement catlov = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Catalog::lovIconId']"));
											catlov.click();
											
											TimeUnit.SECONDS.sleep(30);
											WebElement option = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Catalog::dropdownPopup::dropDownContent::db']/table/tbody/tr[4]/td"));//to select value
											option.click();
											TimeUnit.SECONDS.sleep(30);
											
											WebElement catlov2 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Category::lovIconId']"));
											catlov2.click();
											TimeUnit.SECONDS.sleep(30);
											WebElement option1 = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:ap1:sCatAs:1:AT1:_ATp:table1:2:Category::dropdownPopup::dropDownContent::db']/table/tbody/tr[2]/td[1]"));
											option1.click();
											TimeUnit.SECONDS.sleep(30);
											
											driver.findElement(By.linkText("Save")).click();
											System.out.println("Update Categories is Successfull");
											System.out.println("Test case for Update categories is Successfull");
											
											/*//Home Icon
											TimeUnit.SECONDS.sleep(10);
											driver.findElement(By.xpath(".//*[@id='_FOpt1:_UIShome::icon']")).click();*/
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}

	
	
	