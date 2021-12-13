package Lesson5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class UploadFileTest {

    @Test
    void uploadFileTest() {
        webDriver.get("https://www.ozon.ru/upload");

        webDriver.findElement(By.xpath("//input[@type='file']"))
                .sendKeys("/Users/dimakar/GB/lessons-gb-ui-autotests/src/test/resources/logback.xml");
    }
}
