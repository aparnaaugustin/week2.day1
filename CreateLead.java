package week2.day1;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.IF_ACMPEQ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("cts");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ross");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("leya");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpdown =  new Select(drop1);
		drpdown.selectByIndex(1);
		WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpdown2 =  new Select(drop2);
		drpdown2.selectByValue("CATRQ_AUTOMOBILE");
		WebElement drop3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpdown3 =  new Select(drop3);
		drpdown3.selectByVisibleText("Aerospace");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("jack");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/4/21");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("sir");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Madam");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("AB");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("AB");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Hello");
		WebElement phcode=driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		phcode.clear();
		phcode.sendKeys("23");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7896780000");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("LA");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("00");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("RIA");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.abc.com");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anne");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("frank");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("LA");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("SW");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Newyork");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("890");
		WebElement pvnce = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown=new Select(pvnce);
		dropdown.selectByIndex(3);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown2=new Select(country);
		dropdown2.selectByValue("ASM");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("8900");
		driver.findElement(By.className("smallSubmit")).click();
	String s=	driver.getTitle();
	System.out.println(s);
	if(s.equals("View Lead | opentaps CRM"))
	{
		System.out.println("Titles are equal");
	}
	else
	{
		System.out.println("Titles are not equal");
	}
		//driver.findElement(By.name("submitButton")).click();
		

	}
	

}
