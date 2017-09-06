import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url= "https://www.google.com/?gfe_rd=cr&dcr=0&ei=RRmwWeXtPIjz8AffhIXoDQ&gws_rd=ssl";
		driver.get(url);
		
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		
		driver.navigate().back();
		
		driver.navigate().to("https://www.guru99.com/first-webdriver-script.html");
		
		driver.navigate().back();
		
		System.out.println(url);
	}

}
