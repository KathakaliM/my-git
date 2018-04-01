import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ReportAnalysis {

	public static void main(String[] args) throws Exception {
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
		
		try
       {
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
		// Report and analysis link
		 driver.findElement(By.id(prop.getProperty("report"))).click(); 
		
		TimeUnit.SECONDS.sleep(20);
		
		
		TimeUnit.SECONDS.sleep(30);
		
		//Link for shared icon
		driver.findElement(By.id(prop.getProperty("sharedFld"))).click(); 
		TimeUnit.SECONDS.sleep(10);
		
		//Supply chain Management click
		driver.findElement(By.id(prop.getProperty("supplychn"))).click(); 
		TimeUnit.SECONDS.sleep(10);
		
		//product management
		driver.findElement(By.id(prop.getProperty("productmng"))).click(); 
		TimeUnit.SECONDS.sleep(10);
		
		//Item link
		driver.findElement(By.id(prop.getProperty("item"))).click(); 
		TimeUnit.SECONDS.sleep(10);
		
		driver.findElement(By.id(prop.getProperty("chngorder"))).click(); 
		TimeUnit.SECONDS.sleep(10);
		
		
		/*//Item Import
		driver.findElement(By.id(prop.getProperty("itemImp"))).click(); 
		TimeUnit.SECONDS.sleep(10);*/
		
		//TimeUnit.SECONDS.sleep(30);
		
		
		
		
	//Report link 
		WebElement ele = driver.findElement(By.linkText(prop.getProperty("reportSlc")));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();", ele);
		TimeUnit.SECONDS.sleep(40);
		
		executor.executeScript("arguments[0].click();", ele);
		
		//driver.findElement(By.id("pt1:USra:0:RAp1:0:pfl2")).isDisplayed();
		//executor.executeScript("arguments[0].maximize_window();", ele);
		
		//TimeUnit.SECONDS.sleep(40);
		
		
		
		
		System.out.println("click to Report link successful");
		
		
		
		TimeUnit.SECONDS.sleep(40);
		//driver.switchTo().defaultContent(); // you are now outside both frames
		//WebElement iFrame= driver.findElement(By.id("afr::PushIframe"));
		// driver.switchTo().frame(iFrame);
		
		/*System.out.println("frame visible");*/
		
		WebElement tag =  driver.findElement(By.id(prop.getProperty("more")));
		 if(tag.isDisplayed()){
			 executor.executeScript("arguments[0].click();", tag);
		 }
		//((JavascriptExecutor) driver).executeScript("document.getElementById('pt1:USra:0:RAp1:0:pgl7').click();");
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tag);
		//executor.executeScript("arguments[0].click();", tag);
		//TimeUnit.SECONDS.sleep(40);
		//System.out.println("more link passed");
		//Thread.sleep(500); 

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", tag);
		//TimeUnit.SECONDS.sleep(40);
		
		
		
		
		//driver.findElement(By.xpath(".//*[@id='idCatalogItemsAccordion']/div[1]/div[2]/table/tbody/tr[3]/td/div/table/tbody/tr[3]/td/table/tbody/tr/td[3]/a")).click();
		
       }catch(Exception e){
			e.printStackTrace();
		}
	

	}
}
