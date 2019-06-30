package LEARNING.Achievement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Register_Frames {
	
	@Test
	public void testFrames() {
		System.setProperty("webdriver.chrome.driver", "C://Users//tt8//Downloads//chromedriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//*[@class='dropdown-toggle'])[1]"))).click().build().perform();
		// act.click(driver.findElement(By.xpath("//*[text()='Alerts']"))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Frames']"))).click();
	WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	driver.switchTo().frame(frame);
	
	WebElement textbox= driver.findElement(By.xpath("html/body/section/div/div/div/input"));
	textbox.sendKeys("selenium");
	driver.switchTo().defaultContent();
	WebElement secondTab = driver.findElement(By.xpath("//*[text()='Iframe with in an Iframe']"));
	secondTab.click();
		
	}

}
