package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DefaultvaluePage extends BasePOMpage{
	@AndroidFindBy(xpath="//*[@text='Edit text preference']")
	private AndroidElement edittext;
	
	
	@AndroidFindBy(id="android:id/edit")
	private AndroidElement edittextbox;
	
	@AndroidFindBy(xpath="//*[@text='OK']")
	private AndroidElement okBtn;
	
	public DefaultvaluePage(AndroidDriver<WebElement> driver)
	{
		super(driver);
	}
	
	public void editTextvalue(String value)
	{
		edittext.click();
		edittextbox.clear();
		edittextbox.sendKeys(value);
		okBtn.click();
	}
	
	
	

}
