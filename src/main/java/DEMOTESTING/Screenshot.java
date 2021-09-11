/*package DEMOTESTING;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\JARfiles\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Date d = new Date();
        System.out.println(d.toString());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"); 
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\AutomationSS\\"+sdf.format(d)+".png"));
		
		
		driver.close();
		
	}

}*/
