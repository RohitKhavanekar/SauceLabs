package AutoIT;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String downloadPath=System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SeleniumSupportingTopics\\chromedriver.exe");
		//BELOW 3 LINES ARE COPY PASTED to set Customize dowanload path 
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options=new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://altoconvertpngtopdf.com/");
		driver.findElement(By.xpath("//button[@id=\"dropzoneInput-label\"]")).click(); //Click on UPLOAD button
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Dell\\eclipse-workspace\\SeleniumSupportingTopics\\src\\AutoIT\\uploadnew.exe");//Execute AUTO IT script
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='button']")).click();//Click on CONVERT button
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*=\"medium\"]")));
		driver.findElement(By.cssSelector("button[class*=\"medium\"]")).click();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();//Click on DOWANLOAD BUTTON
		
		Thread.sleep(5000);
		File f=new File(downloadPath+"/converted.pdf"); //Check if exist in customized location

		if(f.exists())

		{
			
		Assert.assertTrue(f.exists());
		System.out.println("File Sucessfully Dowanloaded");
		if(f.delete())

		System.out.println("file deleted");

		}

		}



		




		
		
		
		
		
		

	}


