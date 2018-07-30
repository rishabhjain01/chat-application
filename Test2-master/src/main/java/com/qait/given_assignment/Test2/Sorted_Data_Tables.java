package com.qait.given_assignment.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Sorted_Data_Tables {
	
	WebDriver driver;
	
	WebElement table1;
	
	 Sorted_Data_Tables(WebDriver driver){
		this.driver=driver;
		
	}
	
	public  WebElement get_Sorted_Data_Tables_link() 
	{
		return driver.findElement(By.linkText("Sortable Data Tables"));
		
	}
public void verifying_Sorted_Data_Tables_Page_Displayed() {
		
		Assert.assertEquals("http://10.0.31.161:9292/tables",driver.getCurrentUrl());
			
	} 


public WebElement get_ELement() 
{
	table1= driver.findElement(By.id("table1"));
	return table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[4]"));
}

public void sorting_Table1() throws InterruptedException
{

	 
	WebElement due1=get_ELement();
	System.out.println(due1.getText());
	//WebElement due2=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[4]"));
	//WebElement due3=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[4]"));
	//WebElement due4=table1.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[5]/td[4]"));
	boolean condition=true;
	while(!(due1.getText().equalsIgnoreCase("$51.00")))
	{
		Thread.sleep(2000);
		table1.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[4]/span")).click();
		System.out.println(due1.getText());	
			
		}
		return;
	}
	
	

}