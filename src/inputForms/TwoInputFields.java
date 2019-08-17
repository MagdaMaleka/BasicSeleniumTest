package inputForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoInputFields {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        driver.findElement(By.id("sum1")).sendKeys("5");
        driver.findElement(By.id("sum2")).sendKeys("9");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button")).click();

        boolean verify = driver.getPageSource().contains("14");
        System.out.println(verify);

        driver.close();
    }
}
