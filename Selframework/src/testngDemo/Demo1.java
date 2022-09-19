package testngDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void test1() {
	Reporter.log("1",true);
			Assert.fail();
	
}
@Test(dependsOnMethods="Demo1")
public void test2() {
	Reporter.log("2",true);
}

}
