/*package DEMOTESTING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertqa {

	public static void main(String[] args) throws NoAlertPresentException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\JARfiles\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		
//       Simple Alert 
		 System.out.println("Simple Alert Demo");
		 driver.findElement(By.id("alertButton")).click();
		 Thread.sleep(5000); 
		 Alert alert = driver.switchTo().alert(); // switch to alert 
		 String alertMessage= driver.switchTo().alert().getText(); // capture alert message 
		 System.out.println(alertMessage); // Print Alert Message
		 Thread.sleep(5000); 
		 alert.accept(); 
		 Thread.sleep(5000);
		 
//       Confirmation Alert Accept
		 System.out.println("Confirmation Alert Accept Demo");
		 driver.findElement(By.id("confirmButton")).click(); 
		 Thread.sleep(5000); 
		 Alert alert1 = driver.switchTo().alert(); // switch to alert 
		 String alertMessage1=driver.switchTo().alert().getText(); // capture alert message
		 System.out.println(alertMessage1); // Print Alert Message 
		 Thread.sleep(5000);
		 alert1.accept(); 
		 Thread.sleep(5000); 
		 String ResultMessage1=driver.findElement(By.id("confirmResult")).getText();
		 System.out.println(ResultMessage1); 
		 Thread.sleep(5000);
		  
		 
// 		 Confirmation Alert dismiss
		 System.out.println("Confirmation Alert Dismiss Demo");
		 driver.findElement(By.id("confirmButton")).click(); 
		 Thread.sleep(5000); 
		 Alert alert2 = driver.switchTo().alert(); // switch to alert 
		 String alertMessage2=driver.switchTo().alert().getText(); // capture alert message
		 System.out.println(alertMessage2); // Print Alert Message 
		 Thread.sleep(5000);
		 alert2.dismiss(); 
		 Thread.sleep(5000); 
		 String ResultMessage2=driver.findElement(By.id("confirmResult")).getText();
		 System.out.println(ResultMessage2); 
		 Thread.sleep(5000);
		 

//		Prompt  Alert 
		System.out.println("Prompt Alert Demo");
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		Alert alert3 = driver.switchTo().alert(); // switch to alert
		String alertMessage3 = driver.switchTo().alert().getText(); // capture alert message
		System.out.println(alertMessage3); // Print Alert Message
		Thread.sleep(5000);
		alert3.sendKeys("Accepting the alert");
		alert3.accept();
		String ResultMessage3 = driver.findElement(By.id("promptResult")).getText();
		System.out.println(ResultMessage3);
		Thread.sleep(5000);
	}

} */
