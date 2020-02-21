package testpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAdditional {
	
	@BeforeSuite
	public static void beforeSuite()
	{
		System.out.println("***********Before Suite**********");
	}

	@AfterSuite
	public static void aftSuite()
	{
		System.out.println("***********After Suite**********");
	}
	
	
	
	
	@BeforeClass
	public void demoClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void demoAftClass()
	{
		System.out.println("Aft Class");
	}
	
	@BeforeMethod
	public void demoBfr()
	{
		System.out.println("Launch application");
	}
	
	@Test
	public void demoTest2()
	{
	//	Assert.assertEquals("a", "b");
	//	SoftAssert sa = new SoftAssert();
	//	sa.assertEquals("a", "b");
	//	sa.assertTrue(false);
		System.out.println("Validate Test case 1");
	//	sa.assertAll();
	}
	
	@Test(dependsOnMethods = {"demoTest2"}, alwaysRun = true)
	public void demoTest1()
	{
		
		System.out.println("Validate Test case 2");
	}
	
	@AfterMethod
	public void demoAft()
	{
		System.out.println("Close Application");
	}

}
