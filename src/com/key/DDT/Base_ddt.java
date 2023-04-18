package com.key.DDT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;



public class Base_ddt extends Base_key {

	public static void main(String[] args) throws IOException {
		Base_key a = new Base_key();
		FileInputStream f= new FileInputStream("D:\\Gayathri.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("Sheet2");
		Row r = null;
		Cell c = null;
Iterator<Row>row=ws.iterator();
	while(row.hasNext()) {
		r=row.next();
		String action =r.getCell(2).getStringCellValue();
		if(action.equals("OpeningBrowser")) {
			a.OpeningBrowser();
			System.out.println("open");
		}
		if(action.equals("Navigate")) {
			a.Navigate();
			System.out.println("navigate");
		}
		if(action.equals("Username")) {
			a.Username();
			System.out.println("use");
		}
		if(action.equals("Password")) {
			a.Password();
			System.out.println("pass");
		}
		if(action.equals("Click")) {
			a.Click();
			System.out.println("click");
		}

	}
	 FileInputStream f1 = new FileInputStream("D:\\Gayathri.xlsx");
		XSSFWorkbook wb1 = new XSSFWorkbook(f1);
		XSSFSheet ws1 = wb1.getSheet("Sheet3");
		Row r1 =null;
		//Cell c1 =null;
	d.findElement(By.linkText("REGISTER")).click();;
	WebElement link = d.findElement(By.name("country"));

	List<WebElement> link1 = link.findElements(By.tagName("option"));
	System.out.println(link1.size());
	for (int i=0;i<link1.size();i++) {
		System.out.println(link1.get(i).getText());
		r1 = ws1.createRow(i);
		r1.createCell(0).setCellValue(link1.get(i).getText());
		System.out.println(link1.get(i).getText());
		link1.get(i).click();
	if (link1.get(i).isSelected()) {
		r1.createCell(1).setCellValue("pass");
	}
	else {
		r1.createCell(1).setCellValue("fail");
	}
	}
	
	FileOutputStream f2 = new FileOutputStream("D:\\Gayathri.xlsx");
		wb1.write(f2);
		f2.close();

	
	
	  
	  
}

}
	