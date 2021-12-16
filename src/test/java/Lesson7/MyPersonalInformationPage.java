package Lesson7;

public class MyPersonalInformationPage {
    super(webDriver);
}

    @Step("Изменить имя на {0}")
    public MyPersonalInformationPage changeFirstName(String name) {
        firstName.clear();
        firstName.sendKeys(name);
        return this;
    }

    @Step("Изменить фамилию на {0}")
    public MyPersonalInformationPage changeLastName(String name) {
        lastname.clear();
        lastname.sendKeys(name);
        return this;
    }

    @Step("Ввести пароль")
    public MyPersonalInformationPage inputPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    @Step("Нажать на кнопку Сохранить")
    public MyPersonalInformationPage clickSaveButton() {
        webDriver.findElement(By.xpath("//button[contains(., 'Save')]")).click();
        return this;
    }

    @Step("Нажать на кнопку Вернуться в свой аккаунт")
    public MyAccountPage clickBackToYourAccountButton() {
        webDriver.findElement(By.xpath("//li[contains(., 'Back to your account')]")).click();
        return new MyAccountPage(webDriver);
    }

    @Step("Проверить, что имя равно {0}")
    public MyPersonalInformationPage checkFirstName(String name) {
        assertThat(firstName.getAttribute("value"))
                .isEqualTo(name);
        return this;
    }

    @Step("Проверить, что фамилия равна {0}")
    public MyPersonalInformationPage checkLastName(String name) {
        assertThat(lastname.getAttribute("value"))
                .isEqualTo(name);
        return this;
    }
}

