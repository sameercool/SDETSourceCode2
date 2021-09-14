package sample1;


	import org.openqa.selenium.chrome.ChromeDriver;

	public class Smple
	{
	    public static void main(final String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	        final ChromeDriver driver = new ChromeDriver();
	        driver.get("https://www.gmail.com");
	        final String curl = driver.getCurrentUrl();
	        System.out.println(curl);
	        driver.quit();
	    }
	}