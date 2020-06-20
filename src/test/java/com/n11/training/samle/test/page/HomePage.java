package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        clickBy(By.className("closeBtn"));
    }

    public HomePage search(String keyword){
        setById("searchData",keyword);
        clickBy(By.className("searchBtn"));

        //selectByIdText("gender", "M");
        //selectByNameValue("gender", "M");

        return this;
    }

    public LoginPage callLoginPage(){
        clickBy(By.className("btnSignIn"));
        return new LoginPage(driver);
    }

    public RegisterPage callRegisterPage(){
        clickBy(By.className("btnSignUp"));
        return new RegisterPage(driver);
    }
}
