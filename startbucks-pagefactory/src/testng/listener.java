package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("----------Test Started : "+iTestResult.getName()+"------------");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("----------Test Success : "+iTestResult.getName()+"------------");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("----------Test Fail : "+iTestResult.getName()+"------------");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("----------Test Skipped : "+iTestResult.getName()+"------------");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("------------ Test Start :"+iTestContext.getName()+"------------");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("------------ Test Finish :"+iTestContext.getName()+"------------");
    }
}
