package com.n11.training.samle.test.page;

import com.n11.training.samle.test.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage register(String name, String lastname, String cinsiyet){

        try {
            clickBy(By.linkText("Tamam"));
        }
        catch (Exception e){

        }

        setById("firstName" , name);
        setById("lastName" , lastname);
        //clickBy(By.id("genderMale"));
        //selectByNameValue("gender", "M");
        clickBy(By.xpath("//*[contains(text(), '"+cinsiyet+"')]"));

        return this;
    }
}
