import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://twitter.com/login");
	WebElement lo = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[2]"));
	boolean dis = lo.isEnabled();
	System.out.println(dis);
	lo.sendKeys("vk_13");
	WebElement s = driver.findElement(By.xpath("(//input[@name='session[username_or_email]'])[2]"));
    boolean sel = s.isSelected();
    System.out.println(sel);

	}
}
