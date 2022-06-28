package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestInit {
    public WebDriver driver;


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public void fullscreen() {
        driver.manage().window().maximize();
    }

    public void openSite() {
        driver.get("https://demoqa.com/");
    }

//    public List<WebElement> findChapters() {
//        return driver.findElements(By.xpath("//div[@class='card-body']"));
//    }



    public WebElement searchChapters() {
        return driver.findElement(By.xpath("//*[contains(text(), 'Forms')]"));
    }
    public WebElement inputFirstNameField() {
        return driver.findElement(By.xpath("//input[@id='firstName']"));
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


//    @AfterMethod
//    public void close() {
//        driver.quit();
//    }
    }
//
//    public static void main(String[] args) {
//        FirstCase firstCase = new FirstCase();
//        firstCase.getName();
//        firstCase.setName("Yuliya");
//        System.out.println(firstCase.getName());
//
//
//    }
}
