package pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_POM1 {
@FindBy(id="email")
private WebElement mailid;
@FindBy(id="pass")
private WebElement password;
@FindBy(xpath="//button[.='Log In']")
private WebElement logbt;
public Fb_POM1(WebDriver driver)
{
	
	PageFactory.initElements(driver,this);
	
}
public void mailtb(String mail) 
{
	mailid.sendKeys(mail);
}
public void pwdtb(String pwd)
{
	password.sendKeys(pwd);
}
public void login()
{
	logbt.click();
}
}

