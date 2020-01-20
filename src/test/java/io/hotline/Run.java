package io.hotline;

import core.DriverManager;
import io.hotline.PageObjects.BeginTest;
import org.junit.Test;

public class Run {
    @Test
    public void checkPages(){

        new BeginTest().navigateTo("https://hotline.ua/")
                .closePopUpWindow()
                .searchItemInTheSearchField()
                .sortByPrice()
                .RunPagesAndCheckForPrice();

        DriverManager.killDriver();
    }


    @Test
    public void checkDescription(){
        new BeginTest().navigateTo("https://hotline.ua/")
                .closePopUpWindow()
                .searchItemInTheSearchField()
                .goToPageOfProduct()
                .checkDescription();

        DriverManager.killDriver();
    }

}
