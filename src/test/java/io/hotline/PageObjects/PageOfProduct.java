package io.hotline.PageObjects;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.lang.*;

public class PageOfProduct {
    public PageOfProduct checkDescription(){

        WebElement listofparameters = DriverManager.driver.findElement(By.xpath("//ul[contains(@class,'breadcrumbs')]"));

        String str = listofparameters.getText();
        System.out.println(str);

        String temp[] = str.trim().split("\\s+");
        for (int i = 0;i < temp.length;i++){
            if(temp[i].contains("Теле222ори")){
                System.out.println("The type of product contains Телевізори");
            }
        }
        return new PageOfProduct();
    }
}

