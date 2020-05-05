package com.diana.selenium;

import java.util.Set;

import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver" ,  "//Users//dianasiqueiros//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signout/chrome/landing?continue=https://accounts.google.com/ServiceLogin?elo%3D1");
		driver.findElement(By.linkText("Ayuda")).click();
		System.out.println(driver.getTitle());

		//obtener el id de todos las window
		Set <String> ids = driver.getWindowHandles();
		//obtener el id
		Iterator<String>arg=ids.iterator();
		String parent=arg.next();
		String child =arg.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
	}

	
}
