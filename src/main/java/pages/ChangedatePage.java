package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChangedatePage extends BasePOMpage{
	
	@AndroidFindBy(xpath=" //*[@text='CHANGE THE DATE']")
	private AndroidElement changeTheDate;
	
	@AndroidFindBy(xpath=" //*[@text='13']")
	private AndroidElement Date;
	
	@AndroidFindBy(xpath=" //*[@text='OK']")
	private AndroidElement okBtn;
	
	
	 public ChangedatePage(AndroidDriver<WebElement> driver) {
	        super(driver);
	    }

	
	public void changetheDate()
	{
		changeTheDate.click();
		Date.click();
		okBtn.click();
	}


}
