import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://adc-fap0828-fa-ext.oracledemos.com/fscmUI/faces/FuseWelcome");
		driver.findElement(By.name("userid")).sendKeys("scm_impl");
		driver.findElement(By.name("password")).sendKeys("Nfu54679");
		driver.findElement(By.name("btnActive")).click();
		
		//Thread.sleep(1500);
		driver.findElement(By.id("pt1:_UISmmLink::icon")).click();
		Thread.sleep(1500);
		driver.findElement(By.id("pt1:nv_itemNode_product_management_items")).click();
		
		//Thread.sleep(1500);
		
		//driver.findElement(By.id("pt1:atkfr1:0:grid:0:cil_wrk_itemNode_product_management_items::icon")).click();
		
		//driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTsdiItemWorkareaSearch::icon")).click(); //click search icon
		//Thread.sleep(1500);
		/*Thread.sleep(1000);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1:inputTextQuickSearch1::content")).sendKeys("Team_1234");//enter search text
		Thread.sleep(1000);
		driver.findElement(By.id("_FOpt1:_FOr1:0:_FOSritemNode_product_management_items:0:_FOTRaTj_id_1:1:dynam1:0:qq1::search_icon")).click();
		Thread.sleep(1000);*/
		}
	

}
