package seleniumClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DesiredCapabilities ch = DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//Belongs to your local browser
		ChromeOptions c = new ChromeOptions();//chrome options used to set for local browser setting
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "/Users/prathapjyothy/Downloads/chromedriver 95");
		WebDriver driver = new ChromeDriver();
	}

}
