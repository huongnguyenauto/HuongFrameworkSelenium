package com.huong.utils;

import com.huong.driver.DriverManager;
import org.openqa.selenium.By;

public class WebKeyword {

    public static void click(By by){
        DriverManager.getDriver().findElement(by).click();
    }

    public static void setText(By by, Object value){
        DriverManager.getDriver().findElement(by).sendKeys((CharSequence) value);
    }
}
