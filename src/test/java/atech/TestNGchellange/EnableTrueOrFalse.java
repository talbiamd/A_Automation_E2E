package atech.TestNGchellange;

import org.testng.annotations.Test;
//by usiging tesNG annotation i can chouse which test case i wan to run and which test cases i don't want to run
//by using @test(enabled = true) it will run
//by using @test(enabled =false) will not run
public class EnableTrueOrFalse {

	@Test(enabled = true)
	public void getMethod1() {
		System.out.println("GetMethod1");
	}
	@Test(enabled = true)
	public void getMethod2() {
		System.out.println("GetMethod2");
	}
	@Test(enabled = false)
	public void getMethod3() {
		System.out.println("GetMethod3");
	}
	@Test(enabled = true)
	public void getMethod4() {
		System.out.println("GetMethod4");
	}
	@Test(enabled = false)
	public void getMethod5() {
		System.out.println("GetMethod5");
	}
}
