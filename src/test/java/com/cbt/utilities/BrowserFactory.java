package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser){
        String os = System.getProperty("os.name");
        return null;

    }

    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        System.out.println(os);
    }
}
