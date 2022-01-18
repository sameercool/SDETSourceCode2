package EP1;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentRptDemo {
	//extent work
private static final WebDriver driver=null;
	public static void main(String[] args) {
//to create extent report we use the ExtentHtmlReporter class
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "This is a test to validate google search functionality");
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         //using test1 to  log the status info and description as starting test case
         test1.log(Status.INFO, "starting test case");
         
         driver.get("https://www.google.com");
       //using test1 .pass to report navigation to google
         //as we have used correct gooogle credentials it will pass so we will take pass
         test1.pass("we have navigated to google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		//report to enter text into the search box
		test1.pass("we have entered the data in google search box");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("we have clicked using keyboard enter key");
		
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		
		test1.pass("completed");
		//calling flush writes everything in the log file
		extent.flush();
			
	}

}
