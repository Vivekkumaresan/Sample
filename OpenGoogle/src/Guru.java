import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Vivek\\\\OpenGoogle\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement a = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement b = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions d = new Actions(driver);d.dragAndDrop(a,b).perform();
	}

}
