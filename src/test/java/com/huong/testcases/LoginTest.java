package com.huong.testcases;

import com.huong.common.BaseTest;
import com.huong.driver.DriverManager;
import com.huong.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage;

    @Test
    public void loginTestCRM() throws InterruptedException {

        loginPage = new LoginPage();

        loginPage.loginToCRM("admin02@mailinator.com", "123456");

        Thread.sleep(1000);
    }

    @Test
    public void loginTestHRM() throws InterruptedException {

        DriverManager.getDriver().get("https://hrm.anhtester.com");

        Thread.sleep(1000);
    }

}
