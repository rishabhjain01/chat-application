import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {
	public static void main(String args[]) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://webmail.qainfotech.com/");
		driver.findElement(By.id("username")).sendKeys("rishabh.jain@qainfotech.com");
		driver.findElement(By.id("password")).sendKeys("Rishabh@123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(7000);
		driver.findElement(By.cssSelector("td[id='zb__NEW_MENU_title']")).click();
		Thread.sleep(5000);
		WebElement to = driver.findElement(By.xpath("//*[@id=\"DWT44\"]"));
				to.click();		
		to.sendKeys("rishabh.jain@qainfotech.com");
				WebElement sub= driver.findElement(By.xpath("//*[@id=\"zv__COMPOSE-1_subject_control\"]"));
		sub.click();
		sub.sendKeys("AutomationPractice");
        //driver.findElement(By.className("td[id='zb__COMPOSE-1__SEND_title']")).click();
		driver.close();
		
		
	}

}
