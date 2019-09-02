package org.data.Excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.resource.Base;


public class ExcelRead extends Base{
	public static void main(String[] args) throws Throwable {
	drive();
	
	lanch("https://www.flipkart.com");
	//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
elementToClick(elementUsingXpath("//*[@class='_2AkmmA _29YdH8']"));
//mouseOver("(//span[@class='_1QZ6fC _3Lgyp8'])[2]");
elementToClick(elementUsingXpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]"));
	new Actions(driver).moveToElement(driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[2]")));
	}
}
