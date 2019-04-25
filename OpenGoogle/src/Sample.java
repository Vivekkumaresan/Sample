import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.id("identifierId")).sendKeys("vkumaresan@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567890");
	
	}

}
