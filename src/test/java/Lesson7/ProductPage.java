package Lesson7;

public class ProductPage {
      super(webDriver)

    @Step("Выбрать продукт номер {0}")
    public ProductPage selectProduct(int number) {
        List<WebElement> products = webDriver.findElements(By.xpath("//div[@class='product-container']"));

        @@ -24,6 +26,7 @@ public ProductPage selectProduct(int number) {
            return this;
        }

        @Step("Проверить, что продукт добавлен в корзину")
        public ProductPage checkProductAdded() {
            new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By
                    .xpath("//h2[contains(., 'Product successfully added to your shopping cart')]")));
            return this;
        }
    }
