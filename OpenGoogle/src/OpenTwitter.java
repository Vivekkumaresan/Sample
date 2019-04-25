import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTwitter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");
		WebElement u = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[2]"));
		u.sendKeys("vkumaresan");
		WebElement p = driver.findElement(By.xpath("(//input[@name='session[password]'])[2]"));
		p.sendKeys("12345kumar");
		driver.findElement(By.xpath("(//button[@type='submit'])")).click();
		
		
	}

}
