//package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Catalogs_creation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://adc-fap0828-fa-ext.oracledemos.com/fscmUI/faces/FuseWelcome");
	
		driver.findElement(By.id("userid")).sendKeys("scm_impl");
		TimeUnit.SECONDS.sleep(30);
		driver.findElement(By.id("password")).clear();
		
		driver.findElement(By.id("password")).sendKeys("Nfu54679");
		TimeUnit.SECONDS.sleep(30);
		driver.findElement(By.id("btnActive")).click();
		TimeUnit.SECONDS.sleep(30);

		driver.findElement(By.id("groupNode_product_management")).click();
		
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.id("itemNode_product_management_items_6")).click();
		TimeUnit.SECONDS.sleep(30);
		
		WebElement taskBar = driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_product_management_items:0:_FOTsdiItemRegionalArea::icon"));
		taskBar.click();
		TimeUnit.SECONDS.sleep(30);
		System.out.println("taskbar rendered");
	

		WebElement manageCatalog = driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_product_management_items:0:_FOTRaT:0:RAtl6"));
		manageCatalog.click();
		TimeUnit.SECONDS.sleep(30);
		System.out.println("execution end");
		
		//WebElement create = driver.findElement(By.className("xte xht"));
		//WebElement create = driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:lvtoolbar1"));
		
		WebElement create = driver.findElement(By.xpath(".//*[@id='pt1:_FOr1:1:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:ctblv1::icon']"));
		create.click();
		TimeUnit.SECONDS.sleep(30);
		System.out.println("Create successful");
	
		driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:catalogSearchQueryResultId:Catal1:1:it2::content")).sendKeys("test123");
		
		TimeUnit.SECONDS.sleep(30);
		
		driver.findElement(By.id("pt1:_FOr1:1:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:catalogSearchQueryResultId:Catal1:1:it1::content")).sendKeys("catalog creation");
	
		TimeUnit.SECONDS.sleep(30);
		
		//WebElement save = driver.findElement(By.className("xtk"));
		WebElement save = driver.findElement(By.xpath(".//*[@id='pt1:_FOr1:1:_FOSritemNode_product_management_items:0:MAt2:0:pt1:AP1:ls1:catalogSearchQueryResultId:saveandopen']/table/tbody/tr/td[1]/a/span"));
		save.click();
		TimeUnit.SECONDS.sleep(30);
		
		
	}
}