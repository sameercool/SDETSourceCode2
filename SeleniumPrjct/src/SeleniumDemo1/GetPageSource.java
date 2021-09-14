package SeleniumDemo1;

	import org.openqa.selenium.chrome.ChromeDriver;

	public class GetPageSource
	{
	    public static void main(final String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	        final ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.gmail.com");
	        final String ps = driver.getPageSource();
	        System.out.println(ps);
	        driver.quit();
	    }
	}