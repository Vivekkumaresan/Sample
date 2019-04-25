import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		WebElement e = driver.findElement(By.id("fbbdcc8a4ffae"));
		e.sendKeys("i_m_vk");
		WebElement p = driver.findElement(By.id("fa6374d83a5868"));
		p.sendKeys("kvkvk");
		
	}

}
