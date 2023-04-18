package com.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class xpath {
	private static	WebDriver d;

	public static void main(String[] args) {
		
				
					System.setProperty("webdriver.chrome.driver","./Resource/chromedriver.exe");
					 d=new ChromeDriver();
					chapter2();
					relative();
					chapter3();
				}
	
//	public static void highlight (WebElement element) {
//		JavascriptExecutor jsExecuter = (JavascriptExecutor) d;
//		jsExecuter.executeScript("arguments[0].setAttribute('style','border:2px solid red'; 'background:yellow')");
//	}
	
					public static void chapter2() {
					
						d.get("https://www.w3schools.com/");
						d.manage().window().maximize();
					d.findElement(By.xpath("/html/body/div[3]/a[4]")).click();
					d.navigate().back();
					d.navigate().forward();
					//System.out.println("world");
				//	d.findElement(By.xpath("//a[@id='navbtn_exercises']")).click();
					}
					public static void relative() {
						d.findElement(By.xpath("//*[@id=\'navbtn_exercises\']")).click();
						System.out.println("world");
					}
					
		public static void 	 chapter3() {
			d.get("https://www.w3schools.com/");
			//d.findElement(By.xpath("//a[@id=\"w3loginbtn\"]")).click();
			d.findElement(By.xpath("//a[@title=\'Search W3Schools\']")).click();	
		}
			}


	


