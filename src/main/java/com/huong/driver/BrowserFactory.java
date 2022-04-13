package com.huong.driver;

import com.huong.constants.FrameworkConstants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    //Để phân loại khởi tạo Browser name

    WebDriver driver;

    public WebDriver setupDriver(String browserName) {
        switch (browserName.trim().toLowerCase()) {
            case "chrome":
                driver = initChromeDriver();
                break;
            case "firefox":
                driver = initFirefoxDriver();
                break;
            case "opera":
                driver = initOperaDriver();
                break;
            case "edge":
                driver = initEdgeDriver();
                break;
            default:
                System.out.println("Browser: " + browserName + " is invalid, Launching Chrome as browser of choice...");
                driver = initChromeDriver();
        }
        return driver;
    }

    private WebDriver initChromeDriver() {
        System.out.println("Launching Chrome browser...");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        return driver;
    }

    private WebDriver initEdgeDriver() {
        System.out.println("Launching Edge browser...");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        return driver;
    }

    private WebDriver initFirefoxDriver() {
        System.out.println("Launching Firefox browser...");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        return driver;
    }

    private WebDriver initOperaDriver() {
        System.out.println("Launching Opera browser...");
        WebDriverManager.operadriver().setup();
        driver = new OperaDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(FrameworkConstants.WAIT_PAGE_LOAD));
        return driver;
    }
}
