package DropBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\DXC Selenium Automation Class\\Hsndiling DropDownBox\\BrowserJars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php");
		
		WebElement day_dropdown=driver.findElement(By.id("day"));
		Select day_dd=new Select(day_dropdown);
		day_dd.selectByIndex(11);
		
		List<WebElement> day_list=day_dd.getOptions();
		int day_year=day_list.size();
		System.out.println("Total Year count in txt Box"+day_year);
		
		for(WebElement ele:day_list)
		{
			String year_name=ele.getText();
			System.out.println(year_name);
		}
		
		WebElement year_dropdown=driver.findElement(By.id("year"));
		Select year_dd=new Select(year_dropdown);
		year_dd.selectByVisibleText("2022");
		
		List<WebElement> year_list=year_dd.getOptions();
		int total_year=year_list.size();
		System.out.println("Total Year count in txt Box"+total_year);
		
		for(WebElement ele:year_list)
		{
			String year_name=ele.getText();
			System.out.println(year_name);
		}
		
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		month_dd.selectByValue("1");

	}

}
