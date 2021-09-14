package SeleniumDemo1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter1
{
    public static void main(final String[] args, final Object JavascriptExecutor) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
         JavascriptExecutor jsec = (JavascriptExecutor)driver;
         String script = "document.title;";
    }
}