package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static String XPATH_ACCEPT_COOKIES = "//div[contains(@class, \"_al64\")]/button[2]";
    public static String XPATH_SING_UP = "//div[contains(@class, \"_6ltg\")]/a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]";

    public static String XPATH_NAME = "//div[@id=\"fullname_field\"]/div[\"mbm _1iy_ _a4y _3-90 lfloat _ohe\"]/div/div/input";
    public static String XPATH_LASTNAME = "//div[@id=\"fullname_field\"]/div/div[@class=\"mbm _1iy_ _a4y rfloat _ohf\"]/div/div/input";
    public static String XPATH_MAIL = "//div[@class=\"mbm _a4y\"]/div/div/input";
    public static String XPATH_MAILAGAIN = "//div[@class=\"_5-ah\"]/div/div/div/input";
    public static String XPATH_PASSWORD = "//div[@id=\"password_field\"]/div/div/input";
    public static String XPATH_DAY = "//div[@id=\"birthday_wrapper\"]/div/span[@class=\"_5k_4\"]/span/select[@id=\"day\"]";
    public static String XPATH_MONTH = "//div[@id=\"birthday_wrapper\"]/div/span[@class=\"_5k_4\"]/span/select[@id=\"month\"]";
    public static String XPATH_YEAR = "//div[@id=\"birthday_wrapper\"]/div/span[@class=\"_5k_4\"]/span/select[@id=\"year\"]";

    public static String XPATH_GENDER = "//div[@class=\"mtm _5wa2 _5dbb\"]/span/span/input[\"u_4_5_PW\"]";


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_SING_UP)).click();

        Thread.sleep(2000);
        WebElement nameField = driver.findElement(By.xpath(XPATH_NAME));
        nameField.sendKeys("Name");

        WebElement lastnameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastnameField.sendKeys("Lastname");

        WebElement mailField = driver.findElement(By.xpath(XPATH_MAIL));
        mailField.sendKeys("mail@gmail.com");

        Thread.sleep(1000);
        WebElement againMailField = driver.findElement(By.xpath(XPATH_MAILAGAIN));
        againMailField.sendKeys("mail@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath(XPATH_PASSWORD));
        passwordField.sendKeys("Password");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDayBoard = new Select(selectDay);
        selectDayBoard.selectByIndex(25);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonthBoard = new Select(selectMonth);
        selectMonthBoard.selectByIndex(4);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYearBoard = new Select(selectYear);
        selectYearBoard.selectByIndex(25);

        driver.findElement(By.xpath(XPATH_GENDER)).click();
    }
}
