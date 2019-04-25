import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensTech {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Vivek\\OpenGoogle\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/contact.php");
	WebElement n = driver.findElement(By.xpath("(//input[@id='InputName'])"));
	n.sendKeys("vivek");
	WebElement e = driver.findElement(By.xpath("(//input[@id='InputEmail1'])"));
	e.sendKeys("vkumaresan@ghx.com");
	WebElement c = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
	e.sendKeys("selenium");
	WebElement p = driver.findElement(By.xpath("(//input[@id='InputSubject'])"));
	p.sendKeys("9865798232");
	WebElement l = driver.findElement(By.xpath("(//select[@class='form-control'])[2]"));
    l.sendKeys("Navaloor");
    WebElement d = driver.findElement(By.xpath("(//select[@class='form-control'])[3]"));
    d.sendKeys("today");
    WebElement m = driver.findElement(By.xpath("(//textarea[@name='comments'])"));
    m.sendKeys("excellent");
}
}
