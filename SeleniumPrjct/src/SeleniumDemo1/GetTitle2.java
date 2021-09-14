package SeleniumDemo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle2
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();
        System.out.println();
    }
}
