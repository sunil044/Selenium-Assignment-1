import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Flipkart {

	public static void Login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Prasad\\New folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&otracker=nmenu_Grocery");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='_3Ep39l _1zF5ew']")).click();
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9900530469");
		driver.findElement(By.xpath("//div[@class='Km0IJL col col-3-5']//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("FlipTest123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//input[@name='pincode']")).sendKeys("560068" + Keys.ENTER);
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		Login();
		

	}

}
