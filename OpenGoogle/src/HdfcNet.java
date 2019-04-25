import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcNet {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	WebElement e = driver.findElement(By.name("fldLoginUserId"));
	e.sendKeys("kvk1996");
	}

}
