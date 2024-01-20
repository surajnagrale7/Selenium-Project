import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", 
				"C:\\Users\\lenovo\\OneDrive\\Desktop\\TestProject_Selenium\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		
		//Open Application
		driver.get("https://www.facebook.com/");
		
		//Close current tab
		//driver.close();
		
		//close All tabs
		//driver.quit();
		
		//Get Title
		//String Title = driver.getTitle();
		//System.out.println(Title);
		
		//Get URL
		//String URL = driver.getCurrentUrl();
		//System.out.println(URL);
		
		//Get Size
		//Dimension d = driver.manage().window().getSize();
		//System.out.println(d);
		
		//Wait surtain time close app
		//Thread.sleep(2000);

	}

}
