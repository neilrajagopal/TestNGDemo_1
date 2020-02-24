package testpack;

import org.testng.annotations.DataProvider;

public class TestData {

//Testing data provider 
	  @DataProvider
	  public static Object[][] dp() {
	    return new Object[][] {
	      new Object[] {"Welcome: Mercury Tour", "mercury", "mercury", "oneway" },
	      new Object[] {"Welcome: Mercury Tour", "mercury", "mercury", "oneway" },

		new Object[] {"Welcome: Mercury Tour", "test", "Test", "oneway" },
	    };
	  }

}
