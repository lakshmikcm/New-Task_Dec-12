package org.main;

import java.util.List;

import org.baseclass.BaseClass;
import org.login.login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends BaseClass {
	
	public static void main(String[] args) {
		
		browserLaunch("chrome");
		implicitWait(20);
		urlLaunch("https://www.flipkart.com/");
		
		login l=new login();
		sendKeys(l.getSearch(), "iphone");
		
		click(l.getButton());
		
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='RG5Slk']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
		
		System.out.println("------ iPhone List (24 products) -------");
		
		 int count = Math.min(24, Math.min(name.size(), price.size()));

	        for (int i = 0; i < count; i++) {
	            System.out.println((i) + ". " + name.get(i).getText() + 
	                               " -- " + price.get(i).getText());
	        }
	        
		
	}

}
