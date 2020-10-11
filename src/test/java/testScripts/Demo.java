package testScripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericlib.AutoConstant;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo implements AutoConstant {
	
	@Test
	public void dummy() throws MalformedURLException
	{

		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,PlatformName);
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,appActivity);
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,appackage);
		
		URL u=new URL(url);
		AndroidDriver<WebElement>  driver= new AndroidDriver<WebElement>(u,d);
		
	}

}
