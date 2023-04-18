package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.foundit.in/seeker/registration");
	     
	     d.findElement(By.xpath("//span[@class='browse-text']")).click();
	  
Runtime.getRuntime().exec("D:\\AutoItfile\\FileUpload.exe"+ " " +"C:\\Users\\pilla\\Downloads\\GAYATHRI YANDURI resume.docx");	
	}
	

}