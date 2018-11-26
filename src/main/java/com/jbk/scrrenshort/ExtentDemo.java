package com.jbk.scrrenshort;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.gson.LongSerializationPolicy;

public class ExtentDemo {
	
	
	static ExtentHtmlReporter reporter;
	
	static ExtentReports extent;
	
	static ExtentTest test;
	
	static WebDriver driver;
	
	static String scrrenshortname;
	
	@BeforeTest
	public static void Beforemethod() {
		
		reporter=new ExtentHtmlReporter(".//reports//learnautomation.html");
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		test=extent.createTest("LoginTest");
		
	}
	
	@Test
	public static void LoginTest() throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwae\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println("title is"+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("sopan"));
		
	}
	
	@AfterMethod
	public static  void teardown(ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp= Scrrenshort.Scrrenshortdemo(driver);
			
		
		}
		
		extent.flush();
		
	}

}
