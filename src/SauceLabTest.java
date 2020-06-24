import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabTest {
	
	public static final String USERNAME = "RCK_123";
	  public static final String ACCESS_KEY = "345b6ffe-a459-47cd-bfdc-79d20b8fc4c4";
	  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException 
	{
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions caps = new ChromeOptions();
		caps.setExperimentalOption("w3c", true);
		caps.setCapability("platformName", "Windows 10");
		caps.setCapability("browserVersion", "70.0");
		caps.setCapability("sauce:options", sauceOptions);
		
		
		WebDriver driver = new RemoteWebDriver(new URL(URL),caps);
		driver.get("https://www.google.co.in/?gfe_rd=cr&ei=wnuwV-O5MKXT8gebroGIAQ");
		System.out.println(driver.getTitle());
		

	}

}
