import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class TestGmail {

	public static void main(String[] args) throws InterruptedException {
		
 WebDriver driver= new FirefoxDriver();
 Thread.sleep(2000);
 driver.get("https://mail.google.com");
 driver.manage().window().maximize();
 Assert.assertEquals(driver.findElement(By.xpath("//*[@id='initialView']//a[text()='Help']")).getText(), "Help");// Assertion for help text
 Assert.assertEquals(driver.findElement(By.xpath("//*[@id='initialView']//a[text()='Terms']")).getText(), "Terms");// Assertion for Terms text
 Thread.sleep(3000);
 Assert.assertEquals(driver.findElement(By.xpath("//*[@class='sfYUmb']")).getText(), "Sign in"); // Assertion for Sign in text
 driver.findElement(By.id("identifierId")).sendKeys("samsungs5qait");
 Assert.assertEquals(driver.findElement(By.cssSelector("div.AIu8h")).getText(), "More options");// Assertion for More options text
 Assert.assertEquals(driver.findElement(By.xpath("//*[@class='RFjuSb bxPAYd k6Zj8d']//h1[text()='Sign in']")).getText(), "Sign in");
 Assert.assertEquals(driver.findElement(By.cssSelector("#headingSubtext")).getText(), "to continue to Gmail");

 String str= driver.findElement(By.cssSelector("footer .MocG8c.B9IrJb.LMgvRb.KKjvXb content ")).getText().toString().trim();
 //System.out.println("STRING TEXT -- >>> "+ str);
 Thread.sleep(2000);
 driver.switchTo().defaultContent();
 Assert.assertEquals(driver.findElement(By.cssSelector("footer .MocG8c.B9IrJb.LMgvRb.KKjvXb content ")).isDisplayed(), true);
 Thread.sleep(2000);
 //System.out.println("Boolean check point --- >>>> "+str.contains("‪English"));
 Assert.assertEquals(str.contains("‪English"),true);
 
 
 Assert.assertEquals(driver.findElement(By.xpath("//*[@class='RCum0c']//button[text()='Forgot email?']")).getText(), "Forgot email?"); // Assertion for Forget email text
 driver.findElement(By.className("CwaK9")).click();// Click on next button
 Thread.sleep(2000);
 Assert.assertEquals("Gmail", driver.getTitle());
 Assert.assertEquals(driver.findElement(By.cssSelector("#logo")).isDisplayed(),true, "[Assertion Fail]: Google logo is missing");
 Thread.sleep(2000);

 Assert.assertEquals(driver.findElement(By.cssSelector("div.AIu8h")).getText(), "Forgot password?");

 
 driver.findElement(By.name("password")).sendKeys("Qait@123");
 Thread.sleep(2000);
 //document.querySelectorAll('.MocG8c.B9IrJb.LMgvRb.KKjvXb content')[0].innerHTML
 driver.findElement(By.className("CwaK9")).click();// Click on next button again
 Thread.sleep(10000);
 //User is sign in into his account now
 Assert.assertEquals(driver.findElement(By.xpath("//*[@class='z0']//div[text()='COMPOSE']")).getText(), "COMPOSE");//assertion for compose button
 
 Assert.assertEquals(driver.findElement(By.xpath("//*[@class='aKz'][text()='Primary']")).getText(), "Primary"); // assertion for primary tab

 driver.findElement(By.xpath("//*[@class='aj9 pp']//div[text()='COMPOSE']")).click();  //click on compose button
 Thread.sleep(10000);
 driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("arun.chauhan008@gmail.com"); //to
 
 
 driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Automate");   //subject
 driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Hi Arun .. Please check my mail in your inbox"); //message to be composed
 Thread.sleep(2000);
 
 //Attachment
 driver.findElement(By.xpath("//div[contains(@aria-label,'Attach files')]")).click();
 //driver.findElement(By.xpath("//*[text()='Send']")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("//*[@id='gb']//div[5]/div[1]//span")).click();   //on clicking username
 driver.findElement(By.xpath("//*[@class='gb_Eb']//a[text()='Sign out']")).click(); // on clicking sign out button
 

	}

}
