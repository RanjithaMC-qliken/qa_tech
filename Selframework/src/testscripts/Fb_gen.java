package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;




public class Fb_gen{
	public WebDriver driver;
@Test
public void openapp() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver","./test/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(6000);
	
}
public void closeapp()
{
	driver.close();
}
}
