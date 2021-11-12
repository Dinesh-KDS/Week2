package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://leaftaps.com/opentaps/");
	     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Leads")).click();
	     driver.findElement(By.linkText("Find Leads")).click();
	     driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input[@name='firstName']")).sendKeys("dinesh");
	     driver.findElement(By.xpath("/button[text()='Find Leads')")).click();
	     Thread.sleep(5000);
	     
	     String lead = driver.findElement(By.xpath("/div(@class='x-grid3-cell-inner xgrid3-col-partyid']/a")).getText();
	     System.out.println(lead);
	     
	     driver.findElement(By.xpath("/div(@class='x-grid3-cell-inner xgrid3-col-partyid']/a")).click();
	     
	     
	
	     
	     
	     
	    
     
	     
	}

}
