package genericlib;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Utilies {
	public static void tab(PerformsTouchActions driver,WebElement element)
	{
		TouchAction t=new TouchAction(driver);
		t.tap(TapOptions.tapOptions()
	     .withElement(ElementOption.element(element)))
		.perform();
	}

	
	public static void verticalswize(WebDriver driver,PerformsTouchActions driver1)
	{
		Dimension s = driver.manage().window().getSize();
		int height=s.getHeight();
	int widht=s.getWidth();
	
	int x=widht/2;
	int starty=(int)(height*0.8);
	int endy=(int)(height*0.2);
	TouchAction t=new TouchAction(driver1);
	t.press(PointOption.point(x,starty))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	.moveTo(PointOption.point(x,endy))
	.release().perform();
	
	}
	
	public static void longpress(PerformsTouchActions driver,WebElement element)
	{
		TouchAction t=new TouchAction(driver);
		t.longPress(LongPressOptions.longPressOptions()
		.withElement(ElementOption.element(element)))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
		.release().perform();
	}
	
	
}

