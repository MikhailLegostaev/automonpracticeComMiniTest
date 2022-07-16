package Base;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WomenTest {

//    @Before

    @Test
    public void checkWomenPage(){
        open("https://automationpractice.com/");

        $(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        $(By.xpath("//h2[@class='title_block']")).shouldHave(text("WOMEN"));

    }


}
