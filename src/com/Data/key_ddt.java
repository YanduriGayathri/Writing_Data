package com.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class key_ddt {

	public static void main(String[] args) throws Exception {
	 	FileInputStream f=new FileInputStream("C:\\Users\\pilla\\eclipse-workspace\\Writing_Data\\src\\com\\Data\\Login_Property");
	   	Properties p1=new Properties();
	   	p1.load(f);
	   	
	   System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
	   	ChromeDriver d=new ChromeDriver();
		d.get(p1.getProperty("url"));
	   	d.manage().window().maximize();
	   	
	   d.findElement(By.xpath("//input[@name='userName']")).sendKeys(p1.getProperty("username"));
	   System.out.println(p1.getProperty("username"));
	   	
	   d.findElement(By.xpath("//input[@name='password']")).sendKeys(p1.getProperty("pwd"));
	   System.out.println(p1.getProperty("pwd"));
	   	
	   d.findElement(By.xpath("//input[@name='submit']")).click();
	   	Thread.sleep(2000);	// external file
	   	FileInputStream f1=new FileInputStream("D://Gayathri.xlsx");
	   	XSSFWorkbook wb=new XSSFWorkbook(f1);
	   	XSSFSheet ws=wb.getSheet("Sheet5");
	   	Row r=null;
	   	Cell c=null;
	   d.findElement(By.linkText("REGISTER")).click();
	   	d.manage().window().maximize();
	   	WebElement drop=d.findElement(By.name("country"));
	   	List<WebElement>drop1=drop.findElements(By.tagName("option"));
	      System.out.println(drop1.size());
	   	for(int i=0;i<drop1.size();i++)
	   	{
	   	 System.out.println(drop1.get(i).getText());
	      	r=ws.createRow(i);
	   	 r.createCell(0).setCellValue(drop1.get(i).getText());
	      	drop1.get(i).click();
	   	   if(drop1.get(i).isSelected())
	      	{
	   		 r.createCell(1).setCellValue("pass");
	         	
	      	}
	      	else
	      	{
	      	 r.createCell(1).setCellValue("failed");
	     	}
	   	File in=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		
		Files.copy(in, new File("D:\\test2.png"));

	   	}
	   	
	   	
	FileOutputStream f2=new FileOutputStream("D://Gayathri.xlsx");
	wb.write(f2);
	f2.close();

	      	}

	   	
	}


