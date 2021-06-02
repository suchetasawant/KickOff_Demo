package com.KickOff.TestListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.KickOff.TestUtil.Screenshot;

public class TestListener extends Screenshot implements ITestListener{

		@Override
		public void onTestStart(ITestResult result) {

		}

		@Override
		public void onTestSuccess(ITestResult result) {

			System.out.println("passed  testcases"+ result.getName());
			try {
				takeScreenShot(result.getMethod().getMethodName());

			}catch(Exception e) {

				e.printStackTrace();
			}

		}

		private void takeScreenShot(String methodName) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("failed Test case"+result.getName());

			try {

				failedTestCase(result.getMethod().getMethodName());

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		private void failedTestCase(String methodName) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {


		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		}

		@Override
		public void onStart(ITestContext context) {

		}

		@Override
		public void onFinish(ITestContext context) {

		}


	}

