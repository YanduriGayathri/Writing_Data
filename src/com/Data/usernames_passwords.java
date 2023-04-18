package com.Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usernames_passwords {

	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("D:\\Gayathri.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet4");
		
		
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		for (Row row : ws) {
            
            if (row.getRowNum() == 0) {
                
            }
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            d.get("https://demo.guru99.com/test/newtours/");
 d.findElement(By.xpath("//input [@name='userName']")).sendKeys(username);
     d.findElement(By.xpath("//input [@name='password']")).sendKeys(password);
    		d.findElement(By.xpath("//input [@name='submit']")).click();
        }

        d.close();
        d.quit();
	}

}
