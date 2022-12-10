package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("Chrome launch successful");
		driver.quit();
		
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com");
		System.out.println("edge launch successful");
		driver1.quit();
		
	}

}
