import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		String url="http://demo.guru99.com/selenium/newtours/register.php";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		/*Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("AUSTRIA");*/
		
		
		//Selecting items in Multiple Select elements
		Select s1=new Select(driver.findElement(By.name("country")));
		s1.selectByVisibleText("AUSTRIA");
		Thread.sleep(4000);
		s1.selectByIndex(2);

	}

}
