package com.jbk.scrrenshort;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GenerateLog {
	
	
	
		public void demo() {
			
		
	Logger log	=Logger.getLogger(GenerateLog.class);
	
	System.setProperty("webdriver.chrome.driver", "E:\\softwae\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	log.info("launching browser");
	
	driver.get("http://www.google.com");
	
	log.info("browser launch");
	
	String title=driver.getTitle();
	
	log.info("title is"+title);
	
	if(title.equals("Googel"))
	{
		log.info("title is correct");
	}
	
	else {
		log.info("title is not correct");
	}
		
	
	driver.quit();
	
	log.info("browser is closed");
	
	
		}
	

}
