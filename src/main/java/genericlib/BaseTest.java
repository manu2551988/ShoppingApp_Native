package genericlib;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseTest implements AutoConstant{
	//AppiumDriverLocalService service=null;
	public static AndroidDriver<WebElement> driver;
//	@BeforeSuite
//	public void startserver()
//	{
//		service=AppiumDriverLocalService.buildDefaultService();
//		service.start();
//	}

	@BeforeMethod
	public void openapp()
	{
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.DEVICE_NAME,deviceName);
		d.setCapability(MobileCapabilityType.PLATFORM_VERSION,platformVersion);
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,PlatformName);
		d.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,appActivity);
		d.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,appackage);
		try {
		URL u=new URL(url);
		 driver= new AndroidDriver<WebElement>(u,d);
		 driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			Reporter.log("app is launched",true);
		}
		
		
		
	}
	
	
	
//	@AfterMethod
//	public void closeapp1()
//	{
////		int status = r.getStatus();
////		String name = r.getName();
////		if(status==2)
////		{
////			Photo.getphoto(driver, name);
////		}
//		//driver.closeApp();
//	}
//	
	
	
	
	
//	@AfterSuite
//	public void stopserver()
//	{
//		service.stop();
//	}
	
	
}
