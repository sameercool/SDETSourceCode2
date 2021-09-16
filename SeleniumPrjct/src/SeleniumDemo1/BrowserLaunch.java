package SeleniumDemo1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch
{
    public static void main( String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.get("http://www.amazon.com");
         System.out.println(driver.getTitle());
         driver.quit(); 
        System.setProperty("webdriver.gecko.driver", "D:\\selenium components\\geckodriver.exe");
         FirefoxDriver driver1=new FirefoxDriver();
         
         driver1.get("http://www.amazon.com");
         driver1.quit(); 
         System.setProperty("webdriver.ie.driver", "D:\\selenium components\\IEDriverServer.exe"); 
         InternetExplorerDriver driver2=new InternetExplorerDriver();
        
            }
}