package testscripts;

import org.testng.annotations.Test;

import pomscripts.Fb_POM1;

public class Fb_test1 extends Fb_gen {
@Test
	public void log() throws InterruptedException
	{
Fb_POM1 p1=new Fb_POM1(driver);
p1.mailtb("ranjithachandru15@gmail.com");
Thread.sleep(2000);
p1.pwdtb("12345");
p1.login();
}
}
