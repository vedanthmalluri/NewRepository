package GoogleLink;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class GoogleLink {
	    public static void main(String[] args) throws InterruptedException  {
	        // Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumProject2\\chromedriver.exe");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to Google
	        driver.get("https://www.google.com");
	        Thread.sleep(3000);
	    }
}