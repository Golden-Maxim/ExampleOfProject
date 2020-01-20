package io.hotline.PageObjects;

import core.DriverManager;

public class BeginTest {
    public static MainPage navigateTo(String url){
        DriverManager.getDriver().get(url);

        return new MainPage();
    }
}
