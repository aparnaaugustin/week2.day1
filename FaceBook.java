package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Agnes");
		driver.findElement(By.name("lastname")).sendKeys("Agnes");
		driver.findElement(By.xpath("(//input[@data-type='text'])[3]")).sendKeys("agnes@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("agnes123");
		WebElement drop1 = driver.findElement(By.id("day"));
		Select dpw1=new Select(drop1);
		dpw1.selectByIndex(5);
		WebElement drop2 = driver.findElement(By.id("month"));
		Select dpw2=new Select(drop2);
		dpw2.selectByValue("2");
		WebElement drop3 = driver.findElement(By.id("year"));
		Select dpw3=new Select(drop3);
		dpw3.selectByValue("1996");
		driver.findElement(By.xpath("//input[@name='sex']")).click();
	}

}
