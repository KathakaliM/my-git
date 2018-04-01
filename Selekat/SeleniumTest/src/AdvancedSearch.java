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

public class AdvancedSearch {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file = new File("D:/Selekat/SeleniumTest/Config/Configuration.properties");

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
			driver.findElement(By.id(prop.getProperty("navigator"))).click();  
			TimeUnit.SECONDS.sleep(20); 
			driver.findElement(By.id(prop.getProperty("pim"))).click();
			TimeUnit.SECONDS.sleep(20);
			
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.id(prop.getProperty("searchIcn"))).click();
			TimeUnit.SECONDS.sleep(20);
			
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.id(prop.getProperty("advanced"))).click();
			TimeUnit.SECONDS.sleep(20);
			
			driver.findElement(By.id(prop.getProperty("itemclass"))).click();
			TimeUnit.SECONDS.sleep(30);
			
			driver.findElement(By.id(prop.getProperty("search"))).click();
			TimeUnit.SECONDS.sleep(30);
			
			driver.findElement(By.id(prop.getProperty("Itemcls"))).sendKeys(prop.getProperty("text"));
			TimeUnit.SECONDS.sleep(10);
			
			
			TimeUnit.SECONDS.sleep(30);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:itemClassNameId::_afrLovInternalQueryId::search']")).click();
			
			TimeUnit.SECONDS.sleep(40);
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:itemClassNameId_afrLovInternalTableId::db']/table/tbody/tr[1]/td[1]")).click();
			TimeUnit.SECONDS.sleep(20);
			
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:itemClassNameId::lovDialogId::ok']")).click();
			TimeUnit.SECONDS.sleep(30);
			
			driver.findElement(By.id(prop.getProperty("itemFeild"))).sendKeys(prop.getProperty("itemname"));
			TimeUnit.SECONDS.sleep(30);
			
			driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:1:efqrp::search']")).click();
			TimeUnit.SECONDS.sleep(30);
			
			WebElement status = driver.findElement(By.xpath(".//*[@id='_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ItemC1:0:Advan1:1:rstab:_ATp:table1:0:effcpApprovalStatus::content']"));
			String getStatus = status.getText();
			System.out.println(getStatus);
			TimeUnit.SECONDS.sleep(30);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		}
	}


