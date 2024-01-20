import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8788390866");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Suraj@1234");
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Surujuu");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suraj");
	    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nagarale");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("8788390866");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Suraj@221998");
		
		//WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	    //Select s =new Select(day);
	    //s.selectByVisibleText("2");


	}

}
