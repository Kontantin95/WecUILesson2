package Lesson3;

public class FirstTest {

    @Test
    public void chekImgOzon{
        open(relativeOrAbsoluteUrl: "https://www.ozon.ru/")
            $(By.linkText("Ozon")).click);
             $(By.Xpath("https://cdn1.ozone.ru/s3/cms/7f/t44/wc200/")).chouldHave(img("Ozon"));
        }

     @Test
     public void OpenCart{
        $(By.open("Ozon")).click);
         $(By.Xpath("https://www.ozon.ru/cart")).chouldHave(cart("Ozon"));
    }

     @Test
     public void Email{
        emailInputField.click("https://www.ozon.ru/");
        emailInputField.sendKeys("zenker2015@mail.ru");

        @Test
        public void Password
        passwordInputField.click("https://www.ozon.ru/");
        passwordInputField.sendKeys("foobar");
    }
}