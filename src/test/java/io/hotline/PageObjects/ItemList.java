package io.hotline.PageObjects;

import core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static resources.MyOwnsMethod.checkPrice;

public class ItemList {
    private By firstProductOflist = By.xpath("//ul[contains(@class, 'products-list')]/li[1]/div/p/a");
    private By filter = By.xpath("//div[contains(@class,'sorting')]//select");
    private By sortPrice = By.xpath("//select[contains(@class,'field')]/option[contains(@value,'1')]");


    public PageOfProduct goToPageOfProduct(){
        WebElement product = DriverManager.getDriver().findElement(firstProductOflist);
        product.click();
        return new PageOfProduct();
    }
    public ItemList sortByPrice(){
        WebElement f = DriverManager.getDriver().findElement(filter);
        WebElement sbyPrice = DriverManager.getDriver().findElement(sortPrice);
        f.click();
        sbyPrice.click();
        return new ItemList();
    }
    public ItemList RunPagesAndCheckForPrice(){
        WebElement nextPage;

        for (int i = 1; i < 5;i++ ){

            nextPage = DriverManager.driver.findElement(By.xpath("//*[@id=\"page-search\"]/div[2]/div/div[2]/div[2]/a["+ i +"]"));
            nextPage.click();
            WebElement price[] = DriverManager.driver.findElements(By.xpath("//div[span[contains(@class, 'value')]]")).toArray(new WebElement[0]);
            System.out.println("Price from: " + i + " page" );
            checkPrice(price);
        }
            return new ItemList();
    }
}
