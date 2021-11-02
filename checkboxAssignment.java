package intro;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.testng.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;




public class checkboxAssignment {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "/Users/prathapjyothy/Downloads/chromedriver 95");
WebDriver driver =new ChromeDriver();

WebDriverWait wait = new WebDriverWait(driver, 10);


driver.get("https://www.cleartrip.com/");
Thread.sleep(3000);
//Adults select box

WebElement adultsselectbox = driver.findElement(By.xpath("//div[@class='mb-4']/select"));
Select adultselectboxoptions = new Select(adultsselectbox);
adultselectboxoptions.selectByIndex(3);

// Children select box
WebElement childrenselectbox = driver.findElement(By.xpath("//h4[contains(text(),'Children')]/following-sibling::select"));
Select childrenselectboxoptions = new Select(childrenselectbox);
childrenselectboxoptions.selectByIndex(2);

// Infants select box
WebElement infnatsselectbox = driver.findElement(By.xpath("//h4[contains(text(),'Infants')]/following-sibling::select"));
Select infantsselectboxoptions = new Select(infnatsselectbox);
infantsselectboxoptions.selectByIndex(1);

//Link
driver.findElement(By.xpath("//a[contains(text(),'Class of travel, Airline preference')]")).click();

//Prefered Airline
WebElement airlinepref = driver.findElement(By.xpath("//input[@placeholder='Airline name']"));
airlinepref.click();
airlinepref.sendKeys("indigo");
Thread.sleep(2000);
airlinepref.findElement(By.xpath("//ul/li/p[contains(text(),'IndiGo (6E)')]")).click();
//Search Button
Thread.sleep(2000);
driver.findElement(By.xpath(("//button[text()='Search flights']"))).click();

String errormsg = driver.findElement(By.xpath("//span[text() = 'Select Departure and Arrival airports/cities.']")).getText();
System.out.println(errormsg);




}
}
