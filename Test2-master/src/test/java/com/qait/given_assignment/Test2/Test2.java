package com.qait.given_assignment.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class Test2 {
 WebDriver driver;
 Basic_Auth basicobj;
 BrokenImages imagesobj;
 ExitIntent intentobj;
 Sorted_Data_Tables tableobj;
	Status_Code statusobj;
	WYSIWYGEditor editorobj;
 @BeforeClass
	public void launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Siddhart\\Documents\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
	     driver.get("http://10.0.31.161:9292/");
	     basicobj= new Basic_Auth(driver);
	imagesobj= new BrokenImages(driver);
	intentobj= new ExitIntent(driver);
	tableobj= new Sorted_Data_Tables(driver);
	statusobj= new Status_Code(driver);
	editorobj = new WYSIWYGEditor(driver);
	}
	//@AfterClass
	public void close_Browser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
		
		
	}
	
	//@Test(priority=1)
	public void testcase1()
	{
		statusobj.get_Status_Code_Link().click();
		statusobj.verifying_Status_Code_Page_Displayed();
		statusobj.get_404_Code_link().click();
		statusobj.verifying_404_Msg_Displayed();
		statusobj.verifying_404_Status_Code();
		
		
		
		
	}
	
	
	//@Test(priority=1)
	public void test_case1() throws InterruptedException 
	{
		basicobj.get_Basic_Authlink().click();
		basicobj.sending_Data_In_popup();
		
	}
	//@Test(priority=2)
	public void test_case2() 
	{
		imagesobj.get_Broken_Imageslink().click();
		WebElement image1= imagesobj.getting_Image1();
		WebElement image2= imagesobj.getting_Image2();
		WebElement image3= imagesobj.getting_Image3();
		imagesobj.verifyimageActive(image1);
		imagesobj.verifyimageActive(image2);
		imagesobj.verifyimageActive(image3);

		imagesobj.no_Of_Invalid_Images();
		driver.navigate().back();
		
		
	}
	//@Test(priority=1)
	public void test_case3() throws InterruptedException 
	{
		intentobj.get_Exit_Intent_link().click();
		intentobj.verifying_Exit_Intent_Page_Displayed();
		intentobj.move_mouse();
		//driver.navigate().back();
		
		
	}
	//
	@Test(priority=4)
	public void test_case4() throws InterruptedException 
	{
		tableobj.get_Sorted_Data_Tables_link().click();
		tableobj.verifying_Sorted_Data_Tables_Page_Displayed();
		tableobj.sorting_Table1();
		
		
	}
	//@Test
	public void test_case5() 
	{
		editorobj.get_Editor_Link().click();
		editorobj.verifying_Editor_Page_Displayed();
		editorobj.clear_And_Edit();
		
		
		
	}
	
	
	
	
	
}