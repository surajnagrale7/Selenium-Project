package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_getsizeOfListbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s =new Select(year);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		
		//We can use this method also to get size of Listbox
		//int size = s.getOptions().size();
		//System.out.println(size);
		
        Thread.sleep(2000);
        
        driver.quit();
        
        //o/p = 119
	}

}
