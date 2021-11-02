package intro;

import java.util.List;

import org.openqa.selenium.*;
import org.testng.*;
import org.openqa.selenium.chrome.ChromeDriver;




public class test {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "/Users/prathapjyothy/Downloads/chromedriver 95");
WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
Thread.sleep(2000);
//Check and verify the checkbox is checked
WebElement option1 = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label/input[@name='checkBoxOption1']"));
option1.click();
Assert.assertTrue(option1.isSelected());

//Uncheck and verify the checkbox is Unchecked
option1.click();
Assert.assertFalse(option1.isSelected());

//Count number of checkboxes in the webpage
List <WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='checkbox-example'] //label/input"));
System.out.println(checkboxes.size());

}
}
