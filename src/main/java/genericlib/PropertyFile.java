package genericlib;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class PropertyFile implements AutoConstant {
	public static String getdata(String key)
	{
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyilepath));
		}
		catch(Exception e)
		{
			Reporter.log("data is not taken from propertyfile",true);
		}
		return p.getProperty(key);
	}

}
