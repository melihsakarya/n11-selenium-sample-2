package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(String username, String password){
        setById("email", "melih@testinium.com");
        setById("password", "123456");
        clickBy(By.id("loginButton"));

        return this;
    }


    public LoginPage logout() {
        //clickBy(By.id("logoutButton"));
        return this;
    }
}
