import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpForm {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		String url="http://demo.guru99.com/selenium/newtours/register.php";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.name("firstName")).sendKeys("Gaurav");
		driver.findElement(By.name("lastName")).sendKeys("sharma");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("userName")).sendKeys("g.sha@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("bhiai");
		driver.findElement(By.name("city")).sendKeys("raipur");
		driver.findElement(By.name("state")).sendKeys("chhatisgarh");
		driver.findElement(By.name("postalCode")).sendKeys("211001");
		
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("g.sha@gmail.com");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		

	}

}
