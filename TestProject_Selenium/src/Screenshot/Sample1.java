package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		String str1 = RandomString.make(2);
		
		//driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Store local memory
		//System.out.println(src);
		
		//Move file local to destination memory(folder) 
		File dest=new File("C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\Screenshots\\image"+str1+".jpg");
		
		FileHandler.copy(src, dest);

	}

}
