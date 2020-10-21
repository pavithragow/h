package t1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		
		java.util.List<WebElement> options=driver.findElements(By.className("sbct"));
		System.out.println(options.size());
		for(WebElement webelement:options) {
			
			System.out.println(webelement.getText());
		}
	}

}
