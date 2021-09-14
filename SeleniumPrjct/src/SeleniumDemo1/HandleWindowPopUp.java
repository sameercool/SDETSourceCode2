package SeleniumDemo1;



import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp
{
    public static void main(final String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[@target='_blank']")).click();
        final Set<String> handler = (Set<String>)driver.getWindowHandles();
        final Iterator<String> it = handler.iterator();
        final String parentWindowId = it.next();
        System.out.println("parent window is- " + parentWindowId);
        final String childWindowId = it.next();
        System.out.println("child window is- " + childWindowId);
        driver.switchTo().window(childWindowId);
        Thread.sleep(2000L);
        driver.close();
        driver.switchTo().window(parentWindowId);
        Thread.sleep(2000L);
        System.out.println("the title for parent window is-" + driver.getTitle());
    }
}