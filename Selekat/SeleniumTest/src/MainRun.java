//package test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainRun {
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		Consolidate login = new Consolidate();

		
		login.loginToPHCloud();
		/*login.ProdInfoMgmt();
		login.ItemMgmt();*/
		/*login.searchItem();
		login.updateItem();*/
	//	login.ItemCreate();
	/*login.OrgAssgnmnt();
		login.SingleRow();*/
		
	//	login.Catalogs();
	/*
		login.CatalogUpdate();
		login.AdvncSearch();
		*/
		
		//login.CreateItemStructure();//error
		//login.CrossRef();
		//login.RelatedData();
		
		//login.MultiRow();//error sent in mail
		//Error in webpage
		login.catCreate();//Categories
		//login.BusinessRuleCheck();
		login.Audit();
		//login.PDHCreateItemChangeOrder();
		//login.Logout();
		
		}
	
	}
