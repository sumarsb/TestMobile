package AmazonWeb;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AmazonWeb {
	private ExcelUtility excelUtility;
	protected static Properties properties = new Properties();
	// private static final String JavaScriptException = null;
	static WebDriverWait wait;
	static WebDriver driver;

	public AmazonWeb(ExcelUtility excelUtility, WebDriver driver, Properties properties) throws InterruptedException {
		try {
			driver.findElement(By.id(properties.getProperty(Constant.SIGNIN_ARROW))).click();
			driver.findElement(By.id(properties.getProperty(Constant.MOBILE_NUMBER)))
					.sendKeys(ExcelUtility.getCellData(0, 1, 0));
			driver.findElement(By.id(properties.getProperty(Constant.CONTINUE))).click();
			driver.findElement(By.id(properties.getProperty(Constant.PASSWORD)))
					.sendKeys(ExcelUtility.getCellData(0, 1, 1));
			/*
			 * driver.findElement(By.className(properties.getProperty(Constant.OTP))).click(
			 * ); Thread.sleep(20000);
			 * driver.findElement(By.xpath(properties.getProperty(Constant.OTP_CONTINUE))).
			 * click(); Thread.sleep(20000);
			 */
			driver.findElement(By.id(properties.getProperty(Constant.LOGIN))).click();
	
			  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("65 inch tv");
			  driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).
			  sendKeys(Keys.ENTER); Thread.sleep(5000);
			  
			  driver.findElement(By.xpath("//*[contains(text(),'TCL 163.96 cm (65 inches)  AI 4K UHD Certified Android Smart LED TV 65P8 (Black) (2019 Model)')]")).click();
 
			driver.findElement(By.id("add-to-cart-button")).click();			
			driver.findElement(By.id("hlb-view-cart-announce")).click();
			driver.findElement(By.xpath("//input[@value='Delete' and @type='submit']")).click();
			driver.findElement(By.xpath("//input[@value='Proceed to checkout' and @type='submit']")).click();
			Thread.sleep(3000);
			Actions a= new Actions(driver);
	          WebElement ele=driver.findElement(By.xpath(".//*[@id='nav-link-accountList']"));
	          a.moveToElement(ele).build().perform();
	          Thread.sleep(3000);
	          
	        	  boolean actual_msg= driver.findElement(By.id("nav-item-signout")).isDisplayed();
	        	  boolean expected_msg= true;
	          
	        	  assertEquals(actual_msg, expected_msg);     
	        	  driver.findElement(By.id("nav-item-signout")).click();
	        	  
	          } catch (Exception e) {
	  			e.getStackTrace();
	  			e.getMessage();
	          }
	}}
			//if(driver.findElement(By.id("nav-item-signout")).isDisplayed()) {
			/*
			 * System.out.println("yes"); }else{ System.out.println("no");
			 * 
			 * }
			 */
			
			

		
	


