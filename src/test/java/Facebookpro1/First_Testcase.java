package Facebookpro1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class First_Testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
        String act_title=driver.getTitle();
        
    
        
        if(act_title.equals("Your Store"))
        {	
           System.out.println("Test passed");
        }
         else
        {
           System.out.println("Test Failed");
        }
        driver.findElement(By.name("search")).sendKeys("mac");
        driver.findElement(By.className("btn")).click();
        
        boolean newlogo=driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(newlogo);
        
        
       
       // driver.close();
	
	}

}
