import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumlTest {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("abc@gmail.com");


        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();

    }
}