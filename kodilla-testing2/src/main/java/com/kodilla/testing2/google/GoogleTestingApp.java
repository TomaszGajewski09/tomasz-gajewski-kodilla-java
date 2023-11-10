package com.kodilla.testing2.google;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTestingApp {
    public static WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);


    public static void main(String[] args) {

//        googleToKodillaQuery();
        ebayQuery();
    }

    private static void googleToKodillaQuery() {
        final String SEARCHFIELD = "q";
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Kodilla");
        searchField.submit();
    }

    private static void ebayQuery() {
        final String SEARCHFIELD = "_nkw";
        driver.get("https://www.ebay.com/");

        WebElement searchField = driver.findElement(By.name(SEARCHFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();
    }
}
