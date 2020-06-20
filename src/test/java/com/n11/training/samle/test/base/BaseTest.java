package com.n11.training.samle.test.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void before() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.n11.com");

    }

    @After
    public void after(){

        driver.quit();
    }
}
