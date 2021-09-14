package SeleniumDemo1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup
{
    public static void main(final String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
        final ChromeDriver driver = new ChromeDriver();
        driver.get("https://html.com/input-type-file/");
        driver.findElement(By.name("fileupload")).sendKeys(new CharSequence[] { "D:\\java notes\\set-2 object updated.docx" });
    }
}