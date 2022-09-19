package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constants  {
public WebDriver driver;
@BeforeMethod
public void openappl()
{
	System.setProperty("gecko_key","gecko_value");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("url");
	
}
@AfterMethod

	public void closeappln()
	{
		driver.close();
	}

{
	
}

}
