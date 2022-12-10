package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSaturdayHomeworkLeaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("Demosalesmanager");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("crmsfa");
		WebElement element2 = driver.findElement(By.className("decorativeSubmit"));
		element2.click();
		System.out.println("Leaftaps Successful");
		driver.quit();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://login.salesforce.com/");
		WebElement element3 = driver1.findElement(By.id("username"));
		element3.sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement element4 = driver1.findElement(By.id("password"));
		element4.sendKeys("Testleaf$321");
		WebElement element5 = driver1.findElement(By.id("Login"));
		element5.click();
		System.out.println("Salesforce Successful");
		driver.quit();





	}

}
