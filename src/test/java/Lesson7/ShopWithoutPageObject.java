package Lesson7;

public class ShopWithoutPageObject extends Basik {
        private final String username = "autosupertravel+1117140805004@yandex.ru";
        private final String password = "12345";
        private final Faker faker = new Faker();

        @Test
        @DisplayName("Изменение имени")
        @Description("В этом тесте мы меняем имя и проверяем, чтио оно корректно изменилось")
        @Severity(SeverityLevel.BLOCKER)
        void changeFirstNameTest() {
            String name = faker.name().firstName();

            @@ -30,6 +40,9 @@ void changeFirstNameTest() {


                @Test
                @DisplayName("Изменение фамилии")
                @Description("В этом тесте мы меняем фамилию и проверяем, чтио оно корректно изменилось")
                @Severity(SeverityLevel.BLOCKER)
                void changeLastNameTest() {
                    String name = faker.name().lastName();

                    @@ -44,9 +57,12 @@ void changeLastNameTest() {
                .checkLastName(name);
                    }

                    @ParameterizedTest
                    @DisplayName("Положить в корзину одежду с разных страниц")
                    @ParameterizedTest(name = "Со страницы {0}")
                    @ValueSource(strings = {"Summer Dresses", "T-shirts"})
                    @Severity(SeverityLevel.CRITICAL)
                    void selectSummerDressTest(String secondTab) {
                        parameter("Название старницы", secondTab);
                        webDriver.get("http://automationpractice.com/index.php?controller=authentication&back=identity");
                        new LoginPage(webDriver).login(username, password)
                                .getHeaderBlock()
                                .goToPage("Women", secondTab)
                                .selectProduct(0)
                                .checkProductAdded();
                    }
                }

