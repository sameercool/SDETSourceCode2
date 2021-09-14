
package SeleniumDemo1;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;

public class VerifyTitle1
{
    public static void main(final String[] args) {
        final Scanner scn = new Scanner(System.in);
        System.out.println("enter the title to be verified");
        final String s = scn.nextLine();
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com");
        final String s2 = driver.getTitle();
        if (s.equalsIgnoreCase(s2)) {
            System.out.println("title matched");
        }
        else {
            System.out.println("title didn't match");
        }
        driver.close();
    }
}