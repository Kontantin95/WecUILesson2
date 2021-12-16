package Lesson7;

public class Header {
     super(webDriver);

    @Step("Перейти на страницу {0} -> {1}")
    public ProductPage goToPage(String firstLevelTab, String secondLevelTab) {
        new Actions(webDriver)
                .moveToElement(webDriver.findElement(By.xpath("//a[text()='" + firstLevelTab + "']")))
                .build()
                .perform();
        webDriver.findElement(By.xpath("//a[text()='" + secondLevelTab + "']")).click();
        return new ProductPage(webDriver);
    }
}

