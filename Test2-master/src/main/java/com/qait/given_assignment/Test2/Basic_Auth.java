package com.qait.given_assignment.Test2;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Basic_Auth {
	
	WebDriver driver;
	
	Robot rb;
	Basic_Auth(WebDriver driver){
		this.driver=driver;
		
	}
	
	public WebElement get_Basic_Authlink() 
	{
		return driver.findElement(By.linkText("Basic Auth"));
		
	}
	public void sending_Data_In_popup() throws InterruptedException 
	{
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;
		Set<String> handles = driver.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext())
		{
			subWindowHandler = iterator.next();
		}
		  driver.switchTo().window(subWindowHandler);
	Alert alert = driver.switchTo().alert();	
		alert.sendKeys("username" + Keys.TAB + "password");
		//rb.keyPress();
		
		
		
		
		
		
	}
	
	
	
	

}
