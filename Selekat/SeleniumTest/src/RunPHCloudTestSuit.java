//package com.kpit.selenium.phcloud.webdrive.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RunPHCloudTestSuit {
	
	 WebDriver driver;

		//public void 
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PHCloudLogin login = new PHCloudLogin();
		login.setUp();
		login.loginToPHCloud();
		login.navigateToPHHome();
		//login.createItem();
		
		//System.out.println("manage icon located");
		login.searchItem();
		
		//login.logOutFromPHCloud();
		
	}

}
