
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class Task1 {

    private Object By;

    @Test
    public void Task1 () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        System.out.println("Started");
        sleep(1000);
        String url = "https://the-internet.herokuapp.com/add_remove_elements/";

        driver.get(url);

        driver.manage().window().maximize();

        sleep(1000);

        System.out.println("Page is opened");
        try {
            sleep(2000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        WebElement addButton = driver.findElement(org.openqa.selenium.By.cssSelector("button"));
        sleep(5000);
        addButton.click();
        sleep(5000);
       WebElement deleteButton = driver.findElement(org.openqa.selenium.By.className("added-manually"));
       deleteButton.click();


    }
}
