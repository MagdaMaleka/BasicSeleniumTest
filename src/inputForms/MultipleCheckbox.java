package inputForms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleCheckbox {
    public static String baseUrl = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseUrl);
        driver.findElement(By.id("check1")).click();

        boolean checkAll = driver.getPageSource().contains("Uncheck All");
        System.out.println(checkAll);

        driver.findElement(By.className("cb1-element")).click();

        boolean uncheckAll = driver.getPageSource().contains("Check All");
        System.out.println(uncheckAll);

        driver.close();
    }
}
