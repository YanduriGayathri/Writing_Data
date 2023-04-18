package com.qa.mouse;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_actions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://testingbot.com/features");
		Actions sh = new Actions(d);
		sh
		.moveToElement(d.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[1]/a/span")))
		.moveToElement(d.findElement(By.xpath("/html/body/div[1]/nav/div/div[2]/ul/li[1]/div/div[1]/div[2]/ul/li[2]/a/div/div/h3")))
		.click()
		.perform();
		System.out.println(d.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/h1")).getText());
		
		
	}

}
