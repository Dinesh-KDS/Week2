package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTst {
   public static void main(String[] args) {
	   WebDriverManager.chromedriver().setup();
	   ChromeDriver driver = new ChromeDriver();
		driver.get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dinesh");
        
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar S");
        
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("kdsd1123");
        
        
        WebElement dropdown = driver.findElement(By.id("day"));
		Select day = new Select(dropdown);
		day.selectByIndex(10);
		WebElement dropdownmonth = driver.findElement(By.id("month"));
		Select month = new Select(dropdownmonth);
		month.selectByVisibleText("Aug");
		WebElement dropdownyear = driver.findElement(By.id("year"));
		Select year = new Select(dropdownyear);
		day.selectByIndex(25);
		driver.findElement(By.xpath("//lable[text()='Male']")).click();
        
        
        
   }
   
}
