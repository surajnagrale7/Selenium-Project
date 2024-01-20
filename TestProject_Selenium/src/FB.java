import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8788390869");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd@12345");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create new')]")).click();
		
		Thread.sleep(2000);
		
		((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//select day
		//WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		//Select s =new Select(day);
		//s.selectByVisibleText("2");
		
		//select month
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 =new Select(month);
		//s.selectByVisibleText("Feb");
		
		List<WebElement> allOptions = s1.getOptions();
		System.out.println(allOptions.size());
		
		//select year
		//WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		//Select s2 =new Select(year);
		//s.selectByVisibleText("1998");
	}

}
