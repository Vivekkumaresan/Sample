import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMet {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
	String lo = login.getAttribute("value");
	System.out.println(lo);
	boolean e = lo.equals("submit");
	if (e==true) {
		System.out.println("condition is True");
		
	}
	else {
		System.out.println("condition is False");
	}
	WebElement logo = driver.findElement(By.xpath("//i[contains(@class,'fb_logo')]"));
	String logofb = logo.getText();
	System.out.println(logofb);
	
}
}
