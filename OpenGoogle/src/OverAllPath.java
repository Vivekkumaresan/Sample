import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverAllPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys("vkumaresan");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("vk12345");
		
		
		
	}

}
