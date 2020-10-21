package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Generic_Actionclass {
	
	public void rightclick(WebDriver driver , WebElement ele)
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
		
	}
	public void mouseHoverAction(WebDriver driver, WebElement administrator) 
		{
			Actions act=new Actions(driver);
			act.moveToElement(administrator).perform();
		}
	}
	
