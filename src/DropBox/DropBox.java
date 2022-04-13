package DropBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\DXC Selenium Automation Class\\Hsndiling DropDownBox\\BrowserJars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		
		
		List<WebElement> month_list=month_dd.getOptions();
		int total_month=month_list.size();
		System.out.println("Total Months count in txt Box"+total_month);
		
		for(WebElement ele:month_list)
		{
			String month_name=ele.getText();
			System.out.println(month_name);
		}
		
		month_dd.selectByIndex(3);
		month_dd.selectByValue("9");
		month_dd.selectByVisibleText("Jul");
		
		WebElement day_dropdown=driver.findElement(By.id("day"));
		Select day_dd=new Select(day_dropdown);
		day_dd.selectByIndex(19);
		
		WebElement year_dropdown=driver.findElement(By.id("year"));
		Select year_dd=new Select(year_dropdown);
		year_dd.selectByVisibleText("2000");
		
	}

}
