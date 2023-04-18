package com.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\Gayathri.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet3");
		Row r=null;
		Cell c=null;
		
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		d.manage().window().maximize();
		WebElement s=d.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		List<WebElement> h=s.findElements(By.tagName("option"));
		System.out.println(h.size());
		for(int i=0;i<h.size();i++) {
			System.out.println(h.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(h.get(i).getText());
			h.get(i).click();
			if(h.get(i).isSelected()) {
				r.createCell(1).setCellValue("pass");
	
				
			}
			else {
				r.createCell(1).setCellValue("failed");
				
			}
			
			FileOutputStream f1=new FileOutputStream("D:\\Gayathri.xlsx");
			wb.write(f1);
		}

		
	}

}
