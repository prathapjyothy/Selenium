package seleniumClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/prathapjyothy/Downloads/chromedriver 95");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autocomplete")).sendKeys("unit");
		Thread.sleep(3000L);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);//we have given this 4times becuase united states is present int the 4th position to select it 
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
	}

}
