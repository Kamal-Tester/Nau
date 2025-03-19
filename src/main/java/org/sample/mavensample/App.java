package org.sample.mavensample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        Thread.sleep(15000);
        driver.findElement(By.xpath("//div//a[@id='login_Layer']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div/input[@type='text'])[1]")).sendKeys("meghani58155@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Kamal@123");
        driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
        Thread.sleep(5000);
        String MainWindow=driver.getWindowHandle();	
        driver.findElement(By.xpath("//div[@class='view-profile-wrapper']/a[@href='/mnjuser/profile']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//div/span[@class='edit icon'])[1]")).click();
        Thread.sleep(2000);
        	
        
        System.out.println(MainWindow);
       
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/textarea[@class='resumeHeadlineTxt materialize-textarea']")).clear();
        driver.findElement(By.xpath("//div/textarea[@class='resumeHeadlineTxt materialize-textarea']")).sendKeys("Highly skilled Quality Assurance Engineer with 2+ years");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div/button[@class='btn-dark-ot'])[3]")).click();
        Thread.sleep(5000);
        driver.quit();
        //Highly skilled Quality Assurance Engineer with 2+ years of experience in manual and automation testing. Proficient in Selenium, Cucumber, TestNG, SQL, and CI/CD with expertise in hybrid frameworks. Experienced in using Bitbucket for version control.
    }
}
    
