import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import mx4j.log.Log;

public class PDHAudit {

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
			
		//Audit Report Test case started
			
			//click to navigator icon
			driver.findElement(By.id(prop.getProperty("navigator"))).click();  
			TimeUnit.SECONDS.sleep(20);
			
			//click on Audit Report
			driver.findElement(By.id(prop.getProperty("AuditReport"))).click();
			TimeUnit.SECONDS.sleep(20);
			
			//Select Date drop down option to After
			Select datedrpdwn = new Select(driver.findElement(By.name("pt1:USma:0:MAnt1:0:qryId1:operator0")));
			datedrpdwn.selectByVisibleText("After");
			TimeUnit.SECONDS.sleep(20);
			
			
			//Code to Fetch date 30 days prior
			SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/YY");
			Date dt1 = new Date();
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE, -30);
			Date d=cal.getTime();
			String date=format1.format(d).toString();
			System.out.println(date);
			
			
			//Select  30 days prior date from date picker
			driver.findElement(By.id("pt1:USma:0:MAnt1:0:qryId1:value00::content")).sendKeys(date);
			TimeUnit.SECONDS.sleep(20);
			
           //Select Product Type dropdown
			Select product = new Select(driver.findElement(By.name("pt1:USma:0:MAnt1:0:qryId1:value20")));
			product.selectByVisibleText("Product Management");
			TimeUnit.SECONDS.sleep(20);
			
	        //Select Business Object module	
		    Select BOM = new Select(driver.findElement(By.name("pt1:USma:0:MAnt1:0:qryId1:value40")));
			BOM.selectByVisibleText("Item");
			TimeUnit.SECONDS.sleep(20);
			
			//Hit Search button
			driver.findElement(By.xpath(".//*[@id='pt1:USma:0:MAnt1:0:qryId1::search']")).click();
			TimeUnit.SECONDS.sleep(20);
			
			String verify = driver.findElement(By.xpath(".//*[@id='pt1:USma:0:MAnt1:0:AT1:_ATp:ATt1::db']/table/tbody/tr[1]/td[4]")).getText(); 
			TimeUnit.SECONDS.sleep(20);
			
			System.out.println(verify);
			System.out.println("Able to locate Business object Type");
			System.out.println("Test Case for Audit Report Passed");
			
			
			//Home Icon
			TimeUnit.SECONDS.sleep(10);
			driver.findElement(By.xpath(".//*[@id='pt1:_UIShome::icon']")).click();
			
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
	}

}
}