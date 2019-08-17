package inputForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingleInputField {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.id("user-message")).sendKeys("selenium tutorial");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();

        boolean verify = driver.getPageSource().contains("selenium tutorial");
        System.out.println(verify);

        driver.close();
    }
}
