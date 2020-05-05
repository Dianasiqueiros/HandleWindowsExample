package com.diana.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsHw {
	public static void main (String[] args){

	System.setProperty("webdriver.chrome.driver", "//Users//dianasiqueiros//Downloads//chromedriver");
	WebDriver driver = new ChromeDriver();

	driver.get("http://the-internet.herokuapp.com/windows");
	driver.findElement(By.xpath("//div[@id='content']/div/a")).click();
	Set<String> windows=driver.getWindowHandles();
	Iterator<String> page= windows.iterator();
	String parentWindow=page.next();
	driver.switchTo().window(page.next());
	System.out.println(driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
	driver.switchTo().window(parentWindow);
	System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
