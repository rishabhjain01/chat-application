import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tactoc1 {
	
	public static void main(String args[]) 
	{
		// static WebDriver driver=null;
		WebDriver driver = new ChromeDriver();
		driver.get("http://10.0.1.86//tatoc");
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Basic Course")).click();
		driver.findElement(By.className("greenbox")).click();
		
		
		  //WebElement retElem1(WebDriver driver1) {
			
			WebDriverWait wait = new WebDriverWait(driver,100);
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("answer")));
			//List<WebElement>  table= driver.findElements(By.id("answer"));
			//Iterator<WebElement> itr = table.iterator();
			//String box1=itr.toString();
			//String box2=itr.next().toString();
		//	System.out.println(box1);
			//System.out.println(box2);
			driver.switchTo().frame(0);
			String qw= driver.findElement(By.xpath("//[@name='BOx1']")).getText();
			
		 System.out.println(qw);
			
			//for(WebElement element: table) {
				
				//element.getText().contains("Box 1");
				
			//}
			
			
		//}
		//WebDriverWait wait = new WebDriverWait(driver,10000);
		driver.close();
		
	}

}