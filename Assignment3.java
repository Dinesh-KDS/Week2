package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {
	

    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("http://leaftaps.com/opentaps/");
	     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     driver.findElement(By.className("decorativeSubmit")).click();
	     driver.findElement(By.linkText("CRM/SFA")).click();
	     driver.findElement(By.linkText("Contacts")).click();
	     driver.findElement(By.linkText("Create Contact")).click();
	     driver.findElement(By.id("firstNameField")).sendKeys("Dinesh");
	     driver.findElement(By.id("lastNameField")).sendKeys("kumar S");
	     driver.findElement(By.name("submitButton")).click();
	     
	     String title= driver.getTitle();
		 System.out.println("The titleis" +title);

		 String text1=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		 System.out.println("Company name" +text1);
		 String text2=driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println("Fname" +text2);
		 String text3=driver.findElement(By.id("viewLead_lastName_sp")).getText();
		 System.out.println("Lname is" +text3);
	}
}
