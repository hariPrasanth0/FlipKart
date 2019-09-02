package org.resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	public static WebDriver driver;
	
	public static WebDriver drive() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Sanatorium\\Desktop\\Workspace5\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		return driver;
		}
	public static void lanch(String url) {
		driver.get(url);
	}
	public static WebElement elementUsingId(String id) {
		return driver.findElement(By.id(id));
		}
	public static WebElement elementUsingName(String name) {
		return driver.findElement(By.name(name));
		}
	public static WebElement elementUsingClass(String clas) {
		return driver.findElement(By.className(clas));
		}
	public static WebElement elementUsingXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
		}
	public static void elementToClick(WebElement element) {
		element.click();
		}
	public static void sendValue(WebElement element, String value) {
		 element.sendKeys(value);
		}
	public static void mouseOver(String xpath) {
		Actions a = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpath));
		a.moveToElement(element);
		}
	
}
