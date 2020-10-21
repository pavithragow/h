package t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableBrowserPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com");
		
	}

}
