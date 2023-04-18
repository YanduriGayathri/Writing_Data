package com.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exc");
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		String url="https://www.techlistic.com/p/demo-selenium-practice.html";
		d.get(url);
		d.manage().window().maximize();
		int rows =d.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th")).size();
		System.out.println("colum headings:"+rows);
		int cols =d.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/td")).size();
		System.out.println("All Rows:"+cols);
					for(int r=1;r<=rows;r++) {
						System.out.println("hello");
					for(int c=1;c<=cols;c++) {
         System.out.println("world");
		String data=d.findElement(By.xpath("//table[@id=\"customers\"]/tr["+r+"]/td["+c+"]")).getText();
		System.out.println("all data"+data);
			}
		
	}
	d.quit();
	}

}
