import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreaterThan600 {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("dry fruits" + Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@title=\"Ziofit Afghani Dried Figs\"]")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Set<String> windowIds = driver.getWindowHandles();
		Iterator<String> itr = windowIds.iterator();
		
		String mainwindow = itr.next();
		String childwindow = itr.next();
		
		driver.switchTo().window(childwindow);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK _2K_ZRu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK undefined _2K_ZRu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxMiIgaGVpZ2h0PSIxMiIgdmlld0JveD0iMCAwIDEyIDEyIj4KICAgIDxwYXRoIGZpbGw9IiMyODc0RjAiIGZpbGwtcnVsZT0iZXZlbm9kZCIgZD0iTTcuMTE4IDQuODExSDEydjEuOTgxSDcuMTE4VjEySDQuODgyVjYuNzkySDB2LTEuOThoNC44ODJWMGgyLjIzNnoiLz4KPC9zdmc+Cg==']")).click();
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.xpath("//button[@class='_2AkmmA iwYpF9 _3OLJ5L _7UHT_c']"));

		
		boolean actualValue = e.isEnabled();

		if (actualValue) 
		       System.out.println("Button is enabled" + driver.findElement(By.xpath("//div[@class='K9Gpat']")).getText());
		else
			   
		       System.out.println("Button is disabled Please " + driver.findElement(By.xpath("//div[@class='K9Gpat']")).getText());
		
		       
		driver.quit();	   
		
		       

		
		

	}

}
