package t1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		ChromeDriver driver1= new ChromeDriver();
		driver1.get("http://www.fb.com");
	}

}
