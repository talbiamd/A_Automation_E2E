package atech.ny.listenerpage;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListenr implements ITestListener {

	
	public void onTestStart(ITestResult result) {
          System.out.println("onTestStart "+ result.getName());
		
	}

	
	public void onTestSuccess(ITestResult result) {
		 System.out.println("onTestSuccess " + result.getName());
		
	}

	
	public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure " + result.getName());
		
	}

	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("onTestSkipped " + result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	
	public void onStart(ITestContext context) {
		
		
	}

	
	public void onFinish(ITestContext context) {
		
		
	}



}
