import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String baseUrl = "http://the-internet.herokuapp.com/login";
        driver.get(baseUrl);
        System.out.println("title : " + driver.getTitle());
        System.out.println("currentURL : " + driver.getCurrentUrl());
        System.out.println("pageSource : " + driver.getPageSource());
        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("prime123@gmail.com");
        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("prime123");
        driver.close();

    }
}
