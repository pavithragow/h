package t1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Endtoend {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
//		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		System.out.println("!-----started-------!"); 
		
		driver.get("file:///C:/selenium/links.html");
		driver.manage().window().maximize();
		
		System.out.println("!-----maximized-------!"); 
		Actions act1 = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//a[.='Google']"));
		act1.contextClick(ele1).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_T);	
		r1.keyRelease(KeyEvent.VK_T);
		

		
		Actions act2 = new Actions(driver);
		WebElement ele2 = driver.findElement(By.xpath("//a[.='Gmail']"));
		act2.contextClick(ele2).perform();
		Robot r2=new Robot();
		r2.keyPress(KeyEvent.VK_T);
		r2.keyRelease(KeyEvent.VK_T);
		

		
		
		Actions act3 = new Actions(driver);
		WebElement ele3 = driver.findElement(By.xpath("//a[.='YouTube']"));
		act3.contextClick(ele3).perform();
		Robot r3=new Robot();
		r3.keyPress(KeyEvent.VK_T);
		r3.keyRelease(KeyEvent.VK_T);
		

		
		Actions act4 = new Actions(driver);
		WebElement ele4 = driver.findElement(By.xpath("//a[.='Myntra']"));
		act4.contextClick(ele4).perform();
		Robot r4=new Robot();
		r4.keyPress(KeyEvent.VK_T);	
		r4.keyRelease(KeyEvent.VK_T);
		
		
		Actions act5 = new Actions(driver);
		WebElement ele5 = driver.findElement(By.xpath("//a[.='Amazon']"));
		act5.contextClick(ele5).perform();
		Robot r5=new Robot();
		r5.keyPress(KeyEvent.VK_T);
		r5.keyRelease(KeyEvent.VK_T);	
		
		Set<String> allids = driver.getWindowHandles();
		ArrayList<String> l = new ArrayList<>(allids);
		String tab1 = l.get(0);	
		System.out.println(tab1);
		Thread.sleep(3000);
		String tab2 = l.get(1);	
		System.out.println(tab2);
	}

}
