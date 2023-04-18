package com.key.DDT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_key {
 static WebDriver d;
public void OpeningBrowser() {
	  System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
	  d = new ChromeDriver();
}
public void Navigate() {
	  d.get("https://demo.guru99.com/test/newtours/");
	  d.manage().window().maximize();
}
public void Username() {
	 d.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("Gayathriyenduri760@gmail.com");
 }

 public void Password() {
	  d.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Gaya3@12");
 }

 public void Click() {
	  d.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
 }

 public void Close() {
	  d.close();
 }

}
