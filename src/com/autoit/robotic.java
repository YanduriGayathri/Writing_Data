package com.autoit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotic {

	public static void main(String[] args) throws AWTException, Exception {
		System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		d.get("http://my.monsterindia.com/create_account.html");
	   d.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/span")).click();  ;
	Robot r =new Robot();
StringSelection s = new StringSelection("C:\\Users\\pilla\\Downloads\\Qa_Resume.pdf");	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	r.keyPress(KeyEvent.VK_CONTROL);
    Thread.sleep(2000);
    
    r.keyPress(KeyEvent.VK_V);
    Thread.sleep(2000);
    r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(2000);
    r.keyRelease(KeyEvent.VK_V);
    Thread.sleep(2000);
    r.keyRelease(KeyEvent.VK_CONTROL);
    Thread.sleep(2000);
    r.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    r.keyRelease(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    System.out.println("File upload successfully");
 }

	
	}


