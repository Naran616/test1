package udemy.udemy_rahul;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Calender_sendkeys {
	WebDriver driver;
	@Test(priority = 1)
  public void A() throws InterruptedException {
		String depDate= "06/06/2020";
		String retdate="07/07/2020";
	  driver.findElement(By.xpath("//*[@id='tab-flight-tab-hp']")).click();
	  driver.findElement(By.xpath("//*[@id='flight-type-roundtrip-label-hp-flight']")).click();
	 WebElement depart=driver.findElement(By.id("flight-origin-hp-flight"));
	 			depart.clear();
	 			depart.sendKeys("BWI");
	 WebElement dest=driver.findElement(By.xpath("//*[@id='flight-destination-hp-flight']"));
	 			dest.clear();
	 			dest.sendKeys("New York, NY (JFK-John F. Kennedy Intl.)");
	 		  
	 WebElement departdate=driver.findElement(By.xpath("//*[@id='flight-departing-hp-flight']"));
	 			departdate.clear();
	 			departdate.sendKeys(depDate);
	 		Actions obj=new Actions(driver);
	 WebElement Retdate=driver.findElement(By.xpath("//*[@id='flight-returning-hp-flight']")); 
	 
	 for (int i=1; i<6; i++)
	 {
		 obj.doubleClick(Retdate).sendKeys(Keys.DELETE).build().perform();
	 }
		Retdate.sendKeys(retdate);         
	 driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']/div[8]/label/button")).click();
			
	}
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "/Users/narayansapkota/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
