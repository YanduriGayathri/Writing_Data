package com.Data;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_to_window {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		WebDriver obj = new ChromeDriver();
		obj.manage().window().maximize();
		obj.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentwindowhandle = obj.getWindowHandle();
		
		obj.findElement(By.id("newWindowBtn")).click();
		Set<String> windowhandles = obj.getWindowHandles();
		for (String windowhandle : windowhandles) {
		if (!windowhandle.equals(parentwindowhandle)) {
		obj.switchTo().window(windowhandle);
		Thread.sleep(2000);
		obj.manage().window().maximize();
		Thread.sleep(2000);
		obj.findElement(By.id("firstName")).sendKeys("avinash");
		Thread.sleep(2000);
		obj.close();
		obj.switchTo().window(parentwindowhandle);
		Thread.sleep(2000);
		obj.findElement(By.id("name")).sendKeys("nasina");
		obj.close();
		
		}

	}
	}
	}

