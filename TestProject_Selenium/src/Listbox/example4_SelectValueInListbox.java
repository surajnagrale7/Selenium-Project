package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.AbstractReadOnlyAdapter;

public class example4_SelectValueInListbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Facebook login
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8788390869");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Suruj@1234");
		//driver.findElement(By.xpath("//button[@name='login']")).click();

		//Create New Account
		
		//Click create new account button
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suraj");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nagarale");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8788390866");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Suraj@1234");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s =new Select(month);
		//s.selectByIndex(1);
		//s.selectByValue("2");
		s.selectByVisibleText("Feb");
		
		//WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		//Select s1 =new Select(year);
		//s.selectByVisibleText("1998");
		
		//click male radio button
		driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		
		//click sign-up button
		//driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		
		//driver.quit();
	}

}
