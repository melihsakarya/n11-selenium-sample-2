package com.n11.training.samle.test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {


    public WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }


    public void clickBy(By by){
        WebDriverWait waiter = new WebDriverWait(driver, 30);
        WebElement element = waiter.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
    }

    public void setById(String id, String value){
        WebDriverWait waiter = new WebDriverWait(driver, 30);
        WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

        element.click();
        element.clear();
        element.sendKeys(value);
    }
}
