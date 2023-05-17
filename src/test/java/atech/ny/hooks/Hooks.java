package atech.ny.hooks;

import atech.ny.basepage.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks extends BaseClass {
//in order to compleate our automation farework there is a prerequities with open and close
	//one is open browser and 2nd one is closing browser by configering 1 time 
	//@before and @after which help us open and close the browser
	//hooks is faster than main method
	@Before
	public void setUp() {
		OpenApplication();
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}
