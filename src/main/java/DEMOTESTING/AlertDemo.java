/*package DEMOTESTING;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo {
public static void main(String[] args) throws InterruptedException  { 
System.setProperty("webdriver.chrome.driver","D:\\Automation\\JARfiles\\chromedriver_win32\\chromedriver.exe"); //mention dummy path or variable that stores chrome driver path 
WebDriver driver = new ChromeDriver(); driver.get("https://www.browserstack.com/users/sign_up");
driver.manage().window().maximize();
driver.findElement(By.id("accept-cookie-notification")).click();
//driver.manage().getCookies();

driver.findElement(By.id("user_full_name")).sendKeys("username"); 
driver.findElement(By.id("user_email_login")).sendKeys("username@grr.la");
driver.findElement(By.id("user_password")).sendKeys("Your_Password");
driver.findElement(By.id("user_submit")).click();

Thread.sleep(5000);

driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();

//WebDriverWait wait = new WebDriverWait(driver, 0 );
//
//wait.until(ExpectedConditions.alertIsPresent());


//Alert alert = driver.switchTo().alert(); // switch to alert
//
//String alertMessage= driver.switchTo().alert().getText(); // capture alert message
//
//System.out.println(alertMessage); // Print Alert Message
//Thread.sleep(5000);
//alert.accept();  
}
}*/