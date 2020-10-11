package testScripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import pages.ChangedatePage;
import pages.ViewPage;

public class ChangeTheDate extends BaseTest {
	@Test
	public void test1()
	{
		ViewPage p=new ViewPage(driver);
		ChangedatePage c = p.dateWidgetsselection();
		 c.changetheDate();

	}

}
