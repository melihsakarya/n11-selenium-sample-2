package com.n11.training.samle.test.scenario;

import com.n11.training.samle.test.base.BasePage;
import com.n11.training.samle.test.base.BaseTest;
import com.n11.training.samle.test.page.HomePage;
import org.junit.Test;

public class SampleTest2 extends BaseTest{

    @Test
    public void sampleTest(){
        //HomePage homePage = new HomePage(driver);
        //homePage.search("Samsung");
        //homePage.search("iphone");

        new HomePage(driver)
                .search("Samsung")
                .search("iphone")
                .callLoginPage()
                .login("melih@testinium.com", "123456")
                .logout();
    }

    @Test
    public void loginTest(){

        new HomePage(driver)
                .callLoginPage()
                .login("melih@testinium.com", "123456")
                .logout();
    }


    @Test
    public void registerTest(){
        new HomePage(driver)
                .callRegisterPage()
                .register("Melih", "Sakarya", "Erkek")
                .register("Ayse", "Dursun", "Kadın");



    }

}
