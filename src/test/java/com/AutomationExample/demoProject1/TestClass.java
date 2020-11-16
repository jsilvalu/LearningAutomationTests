package com.AutomationExample.demoProject1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IDI\\Desktop\\DevOps\\Curso Selenium\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void Test1() {
		
		System.out.println("Ejecutando Test1...................");
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Titulo del test1 es:  "+driver.getTitle());
	}
	@Test
	public void Test2() {
		
		System.out.println("Ejecutando Test2...................");
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Titulo del test2 es:  "+driver.getTitle());
	}
	@Test
	public void Test3() {
		System.out.println("Ejecutando Test3...................");
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Titulo del test3 es:  "+driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
		//En caso de fallo etonces 
	}

}
