package org.sample.mavensample;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world
 *
 */
public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	//ChromeOptions options = new ChromeOptions();
    	//options.addArguments("--headless=new"); 
    	//options.addArguments("--window-size=1920,1080");
    	WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
        
        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
 
        
        
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/a[@class='nI-gNb-lg-rg__login']")));
        loginButton.click();
        
        //driver.findElement(By.xpath("//div//a[@id='login_Layer']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div/input[@type='text'])[1]")).sendKeys("meghani58155@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Kamal@123");
        driver.findElement(By.xpath("//button[@class='btn-primary loginButton']")).click();
        Thread.sleep(5000);
        String MainWindow=driver.getWindowHandle();	
        driver.findElement(By.xpath("//div[@class='view-profile-wrapper']/a[@href='/mnjuser/profile']")).click();
        //Thread.sleep(2000);
        
        WebDriverWait waitt = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitt.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div/span[@class='edit icon'])[1]"))).click();
        //driver.findElement(By.xpath("(//div/span[@class='edit icon'])[1]")).click();
        Thread.sleep(2000);
        	
        
        System.out.println(MainWindow);
       
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div/textarea[@class='resumeHeadlineTxt materialize-textarea']")).clear();

        
        driver.findElement(By.xpath("//div/textarea[@class='resumeHeadlineTxt materialize-textarea']")).sendKeys("Highly skilled Quality Assurance Engineer with 2+ years of experience in manual and automation testing. Proficient in Selenium, Cucumber, TestNG, SQL, and CI/CD with expertise in hybrid frameworks. Experienced in using Bitbucket for version control.");
        System.out.println("Updated ");
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//div/button[@class='btn-dark-ot'])[3]")).click();
        Thread.sleep(5000);
        driver.quit();
        //Highly skilled Quality Assurance Engineer with 2+ years of experience in manual and automation testing. Proficient in Selenium, Cucumber, TestNG, SQL, and CI/CD with expertise in hybrid frameworks. Experienced in using Bitbucket for version control.
    }
}
    
