package com.jbk.scrrenshort;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Scrrenshort {
	
	static WebDriver driver;
	
	public static String Scrrenshortdemo(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user,dir")+"\\scrrenshort\\"+System.currentTimeMillis();
	
		try {
			File des=new File(path);
			FileUtils.copyFile(src, des);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return path;
	}

}
