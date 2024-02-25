

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Task5 {

    private Object By;

    @Test
    public void loginTest() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.out.println("Started");
        sleep(1000);
        String url = "https://the-internet.herokuapp.com/login";

        driver.get(url);
        sleep(1000);
        driver.manage().window().maximize();

        sleep(1000);

        System.out.println("Page is opened");
        try {
            sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        WebElement username = driver.findElement(org.openqa.selenium.By.id("username"));
        username.sendKeys("tomsmith");
        WebElement password = driver.findElement(org.openqa.selenium.By.name("password"));
        password.sendKeys("SuperSecretPassword!");
        WebElement logInButton = driver.findElement(org.openqa.selenium.By.tagName("button"));
        logInButton.click();

        WebElement successMessage = driver.findElement(org.openqa.selenium.By.className("success"));

        System.out.println("Log in");

        //driver.close();
    }
}

