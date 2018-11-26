package com.cookies;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class cookiesDemo {
	@Test
	
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\softwae\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Set<Cookie> cook=driver.manage().getCookies();
		
		Cookie coo=new Cookie("uname", "kiran");
		
		
		driver.manage().getCookieNamed("coo");
		
	
		for(Cookie cooki:cook)
		{
			System.out.println("Cookies details");
			
			System.out.println("cookies name" +cooki.getName());
			
			System.out.println("cookies name" +cooki.getValue());
			
			System.out.println("cookies name" +cooki.getDomain());
			
			System.out.println("cookies name" +cooki.getPath());
			
			System.out.println("cookies name" +cooki.getClass());
			
			System.out.println("cookies name" +cooki.getExpiry());
		}

		driver.close();
	}
	

}
