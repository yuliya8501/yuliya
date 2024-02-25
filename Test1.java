import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

public class Test1 {

 @Test
    public void test(){
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.selenium.dev/selenium/web/web-form.html");

  String title = driver.getTitle();
  assertEquals("Web form", title);

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

  WebElement textBox = driver.findElement(By.name("my-text"));
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
  WebElement submitButton = driver.findElement(By.cssSelector("button"));
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
  //textBox.sendKeys("Selenium");
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
  submitButton.click();

 }
}
