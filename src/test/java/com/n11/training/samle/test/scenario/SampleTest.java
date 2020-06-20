package com.n11.training.samle.test.scenario;

import com.n11.training.samle.test.base.BaseTest;
import com.n11.training.samle.test.page.HomePage;
import com.n11.training.samle.test.page.LoginPage;
import org.junit.Test;

public class SampleTest extends BaseTest{

    @Test
    public void sampleTest(){

        HomePage homePage = new HomePage(driver);
        homePage.search("Samsung");
        homePage.search("iphone");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("melih@testinium.com", "123456");

    }
}
