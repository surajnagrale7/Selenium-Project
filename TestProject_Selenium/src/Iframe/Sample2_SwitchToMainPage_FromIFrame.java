package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2_SwitchToMainPage_FromIFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult"); //String FrameID
		
		//click on date & time button
		driver.findElement(By.xpath("//button[contains(text(), 'Click me')]")).click();
		
		Thread.sleep(2000);
		
		//switch to mainpage
		driver.switchTo().parentFrame();
		
		//switch to mainpage
		//driver.switchTo().defaultContent();
		
		//click on home icon
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

	}

}
