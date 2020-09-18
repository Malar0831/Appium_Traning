package com.testcases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.baseclasses.BaseClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;



public class TestCase extends BaseClass {
	@Test
	public void basicTest() throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= capability();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index=1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index=2]")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='android:id/edit']")).sendKeys("Malar");
		driver.findElement(By.xpath("//android.widget.Button[@text='OK']")).click();
	}
	}


