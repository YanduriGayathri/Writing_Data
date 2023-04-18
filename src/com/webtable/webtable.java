package com.webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
	
		

		for (int i = 1; i <=7; i++) {
			WebElement bro =  d.findElement(By.xpath("//table[@id='contactList']/tbody/tr["+ i +"]"));
			
			System.out.println(bro.getText());
			
			System.out.println("this is gayathri");
			System.out.println("worst  gayathri");
			System.out.println("waste of time  gayathri");
			System.out.println("bye bye bye  gayathri");

}
}
}
