package com.opencart.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerSetup implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Testcase Execution Started    -   "+ result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcase Execution Completed    -  "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Testcase Execution Failed   -  "+ result.getName());
		System.out.println("Take Screenshot");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Testcase Execution Skipped    -   "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
