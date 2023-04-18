package com.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.browserstack.com/");
		Actions f = new Actions(d);
		f.
		moveToElement(d.findElement(By.id("product-menu-toggle")))
		.moveToElement(d.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]/div[1]/ul[2]/li[4]/a/div[2]/div[1]")))
		.click()
		.perform();
		System.out.println(d.findElement(By.xpath("//*[@id=\"post-56620\"]/section/div[1]/div/div/div/article/div/div/div[1]/div[1]/h1")).getText());
		
	}

}
