package atech.TestNGchellange;

import org.testng.annotations.Test;
//if there is no priority how test case will execute ans: it will run by alphabetically 
//how you set up your priority ans :0.1.2.3.4//a.b.c.d.e
//how to setup the priority
//ans by using the annatation@Test(priority=0)
public class PriorityTest {

	@Test(priority = 4)
	public void getMethod1() {
		System.out.println("GetMethod1");
	}
	@Test(priority = 2)
	public void getMethod2() {
		System.out.println("GetMethod2");
	}
	@Test(priority = 3)
	public void getMethod3() {
		System.out.println("GetMethod3");
	}
	@Test(priority = 1)
	public void getMethod4() {
		System.out.println("GetMethod4");
	}
	@Test(priority = 0)
	public void getMethod5() {
		System.out.println("GetMethod5");
	}
}
