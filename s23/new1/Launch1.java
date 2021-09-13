package new1;

public class Launch1 {
	{
	    public static void main(final String[] args) {
	        System.setProperty("webdriver.chrome.driver", "D:\\selenium components\\chromedriver.exe");
	        final ChromeDriver driver = new ChromeDriver();
	        driver.get("http://www.amazon.com");
	        System.out.println(driver.getTitle());
	        driver.quit();
	    }
	}
}
