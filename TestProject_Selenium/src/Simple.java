import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9579128488");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		//Listbox
		//WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//Select s =new Select(month);
		//s.deselectByVisibleText("Dec");
		
		//Thread.sleep(2000);
		//driver.quit();
		
		
	}

}
