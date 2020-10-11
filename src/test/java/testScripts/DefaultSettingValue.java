package testScripts;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import genericlib.PropertyFile;
import pages.DefaultvaluePage;
import pages.ViewPage;

public class DefaultSettingValue extends BaseTest{
	@Test
	public void settingvalue()
	{
		ViewPage v=new ViewPage(driver);
		DefaultvaluePage p = v.prefrenceSetting();
		p.editTextvalue(PropertyFile.getdata("value"));
	}

}
