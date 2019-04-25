import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class OpenGoogle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
WebElement search = driver.findElement(By.name("q"));
search.sendKeys("Greens technologies");
}
}
