package Listbox;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example3_printAllOptionsInListbox_AlphabeticalOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(3000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s =new Select(month);
  
		TreeSet<String> tr= new TreeSet<String>();
		
		List<WebElement> allOptions = s.getOptions();
		
		 for(WebElement Option:allOptions)
		 {
			 String text = Option.getText();
			 tr.add(text);
		 }
		 System.out.println("--------print all info in treeset----------");
		 
		 for(String s1:tr)
		 {
			 System.out.println(s1);
		 }
	}

}
