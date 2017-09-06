import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		String url="http://demo.guru99.com/selenium/delete_customer.php";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String msg=driver.switchTo().alert().getText();
		
		System.out.println(msg);
		
		Thread.sleep(5000);
		
		alert.accept();
		
		String msg1=driver.switchTo().alert().getText();
		
		System.out.println(msg1);

	}

}
