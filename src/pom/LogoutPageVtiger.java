package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Generic_Actionclass;

public class LogoutPageVtiger {
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement Administrator;
	
	@FindBy(xpath="//a[.='Sign Out']")
	private WebElement signout;
	
	public  LogoutPageVtiger(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void logout(WebDriver driver)
	{
		Generic_Actionclass ga=new Generic_Actionclass();
		
		ga.mouseHoverAction(driver, Administrator);
		
		signout.click();
	}
}
