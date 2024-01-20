package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1_SwitchToFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult"); //String FrameID
		//driver.switchTo().frame("iframeResult"); //String FrameName
		//driver.switchTo().frame(0); //Int FrameIndex
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult")));  //using WebElement
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[contains(text(), 'Click me')]")).click();

	}

}
