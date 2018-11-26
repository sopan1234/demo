package com.cookies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class unstrusteddemo {
	
	public static void main(String[] args) {
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           FirefoxProfile profile=new FirefoxProfile();
		
		profile.setAcceptUntrustedCertificates(true);
		 
		WebDriver driver=new FirefoxDriver();
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		driver=new ChromeDriver(cap);
		
		
	}
	
	

}
