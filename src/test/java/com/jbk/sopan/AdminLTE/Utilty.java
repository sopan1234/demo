package com.jbk.sopan.AdminLTE;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class Utilty {
	
	 static WebDriver driver;
	public static String Scrrenshort(WebDriver driver) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String des=System.getProperty("user.dir"+"/scrrenshort"+System.currentTimeMillis());
		
		File destination=new File(des);
		
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("capture failes"+e.getMessage());
		}
		
		return des;
	}

}
