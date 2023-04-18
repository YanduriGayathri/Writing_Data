package com.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_type_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
WebElement f=d.findElement(By.xpath("//input[@name='q']"));
f.sendKeys("w3schools");
System.out.println(f.getAttribute("value"));




	}

}
