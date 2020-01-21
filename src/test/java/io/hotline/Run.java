// Я ще незнаю як правельно описувати тут взагальному і нема що описувати  тут два тести перший checkPages() шукає телевізор перевіряє чи нема ціни дорощої за 10 000 на 5 сторінках
// другший тест шукає телевіор заходить на перший і перевіряє опис товару чи вні містить слово телевізор

package io.hotline;

import core.DriverManager;
import io.hotline.PageObjects.StartPage;
import org.junit.Test;

public class Run {
    @Test
    public void checkPages(){

        new StartPage().navigateTo("https://hotline.ua/")
                .closePopUpWindow()
                .searchItemInTheSearchField()
                .sortByPrice()
                .RunPagesAndCheckForPrice();

        DriverManager.killDriver();
    }


    @Test
    public void checkDescription(){
        new StartPage().navigateTo("https://hotline.ua/")
                .closePopUpWindow()
                .searchItemInTheSearchField()
                .goToPageOfProduct()
                .checkDescription();

        DriverManager.killDriver();
    }

}
