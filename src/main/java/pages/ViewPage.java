package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewPage extends BasePOMpage {
	@AndroidFindBy(xpath="//*[@text='Views']")
	private AndroidElement viewBtn;
	
	@AndroidFindBy(xpath="//*[@text='Date Widgets']")
	private AndroidElement dateWidgets;
	
	@AndroidFindBy(xpath="//*[@text='1. Dialog']")
	private AndroidElement dialogBtn;
	
	@AndroidFindBy(xpath="//*[@text='Preference']")
	private AndroidElement prefernecBtn;

	
	@AndroidFindBy(xpath="//*[@text='4. Default values']")
	private AndroidElement defaultBtn;
	
	public ViewPage(AndroidDriver<WebElement> driver)
	{
		super(driver);
	}
	
	public ChangedatePage dateWidgetsselection()
	{
		viewBtn.click();
		dateWidgets.click();
		dialogBtn.click();
		return new ChangedatePage(driver);
	}
	
	public DefaultvaluePage prefrenceSetting()
	{
		prefernecBtn.click();
		defaultBtn.click();
		return new DefaultvaluePage(driver);
	}
	

}
