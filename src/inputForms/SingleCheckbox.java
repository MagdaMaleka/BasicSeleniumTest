package inputForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.findElement(By.id("isAgeSelected")).click();

        boolean verify = driver.getPageSource().contains("Success - Check box is checked");
        System.out.println(verify);

        driver.close();
    }
}
