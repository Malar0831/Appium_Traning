package com.baseclasses;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	public AndroidDriver<AndroidElement> capability() throws MalformedURLException {
		//File apppath= new File("D:\\Automation\\Appium\\original.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo-Mobile");
		cap.setCapability(MobileCapabilityType.APP,"D:\\\\Automation\\\\Appium\\\\original.apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
