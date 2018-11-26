package com.jbk.sopan.AdminLTE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo {
	
	@Test
	
	public void set() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwae\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@type='email']"));
		
		driver.close();
	}

}
