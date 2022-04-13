package com.huong.common;

import com.huong.driver.BrowserFactory;
import com.huong.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    WebDriver driver;

    @BeforeMethod
    public void createBrowser(){

        //Khởi tạo
        driver = new BrowserFactory().setupDriver("chrome");

        DriverManager.setDriver(driver); //Lưu lại giá trị browser đã khởi tạo
    }

    @AfterMethod
    public void closeBrowser(){
        DriverManager.quit();
    }
}
