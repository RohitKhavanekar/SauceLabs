package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rohit_Folder\\MAXIMUS\\Selenium Driver NEVER DELETE\\ChromeDriver 83\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://altoconvertpngtopdf.com/");
		driver.findElement(By.xpath("//button[@id=\"dropzoneInput-label\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Dell\\eclipse-workspace\\SeleniumSupportingTopics\\src\\AutoIT\\uploadnew.exe");
		
		
		

	}

}
