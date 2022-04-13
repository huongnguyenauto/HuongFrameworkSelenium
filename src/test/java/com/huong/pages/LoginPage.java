package com.huong.pages;

import com.huong.constants.FrameworkConstants;
import com.huong.driver.DriverManager;
import com.huong.utils.WebKeyword;
import org.openqa.selenium.By;

public class LoginPage {

    By emailBy = By.xpath("//input[@id='email']");
    By passwordBy = By.xpath("//input[@id='password']");
    By signInBtnBy = By.xpath("//button[normalize-space()='Sign in']");

    public void loginToCRM(String email, String password){
        DriverManager.getDriver().get(FrameworkConstants.BASE_URL);
        WebKeyword.setText(emailBy, email);
        WebKeyword.setText(passwordBy, password);
        WebKeyword.click(signInBtnBy);
    }
}
