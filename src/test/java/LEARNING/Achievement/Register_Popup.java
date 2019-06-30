package LEARNING.Achievement;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register_Popup {
	@Test(priority=0)
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C://Users//tt8//Downloads//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[1]"))).click().build().perform();
		// act.click(driver.findElement(By.xpath("//*[text()='Alerts']"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Frames']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Alert with Textbox ']")))
				.click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).sendKeys(Keys.ENTER);
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
	       }
	}
		
	


