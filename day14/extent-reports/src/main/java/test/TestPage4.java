package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestPage4 {

	private static ExtentReports ext;

	public static ExtentReports getInstance() {
		if (ext == null)
			createInstance();
		return ext;
	}

	public static ExtentReports createInstance() {

		ExtentSparkReporter obj = new ExtentSparkReporter("reports/CCST.html");

		obj.config().setTheme(Theme.STANDARD);
		obj.config().setDocumentTitle("CCST reports");
		System.out.println(obj.config().getDocumentTitle());
		obj.config().setReportName("selenium report");
		System.out.println(obj.config().getReportName());
		obj.config().setReportName("Pragati");
		obj.config().getReporter();

		ext = new ExtentReports();

		ext.attachReporter(obj);

		ext.setSystemInfo("Tester", "PMPTV");
		ext.setSystemInfo("Environmrnt", "Good");
		ext.setSystemInfo("OS", System.getProperty("os.name"));

		return ext;

	}

	public static int div(int a, int b) {
		int result = a / b;
		return result;

	}

	public static void main(String[] args) {

		int arr1[] = { 10, 25, 20 };
		int arr2[] = { 5, 0, 1 };

		ExtentReports report = getInstance();

		ExtentTest test = report.createTest("Test4");
		
		test.info("Test 4 start");

		for (int i = 0; i < arr1.length; i++) {

			try {
				div(arr1[i], arr2[i]);
				test.pass(arr1[i] + "/" + arr2[i]);
			} catch (Exception e) {
				test.fail(arr1[i] + "/" + arr2[i]);
			}
		}

//	test.pass("Test 4 Pass");
		test.fail("Test 4 fail");
		ext.flush();

		test = report.createTest("Test5");
		test.info("Test 5 start");
		test.pass("Test 5 Pass");
//	test.fail("Test 5 fail");
		ext.flush();

	}

}
