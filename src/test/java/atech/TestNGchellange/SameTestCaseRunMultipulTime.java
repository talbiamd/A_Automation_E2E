package atech.TestNGchellange;

import org.testng.annotations.Test;

//how do you write same testcases multipul time
//ans : by using testNG annotation @Test(invocationCount=*)
public class SameTestCaseRunMultipulTime {
	@Test(invocationCount = 100)
	public void getMethod() {
		System.out.println("GetMethod");
	}
}
