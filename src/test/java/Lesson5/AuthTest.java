package Lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AuthTest {
    @Test
    void authWithUiTest() {
        webDriver.get("https://www.ozon.ru/login");

        webDriver.findElement(By.name("username")).sendKeys("tomsmith");
        webDriver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        webDriver.findElement(By.xpath("//button[@type='submit']")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Secure Area')]")));
    }

    @Test
    void authWithCookieTest() {
        webDriver.get("https://www.ozon.ru/login");

        webDriver.manage().deleteAllCookies();
        webDriver.manage().addCookie(new Cookie("rack.session", "BAh7CkkiD3Nlc3Npb25faWQGOgZFVEkiRWMzODEzZTQ5YmYxYzZkN2I4Njk3%0AZWMxNTBiMjdkOWFmZTU1N2JhNzJhZWYxY2NkYzliN2U4M2NiZjQ0NmVhMDMG%0AOwBGSSIJY3NyZgY7AEZJIiVlNWMzOGRhNTIyNzAyOGQ3MWZhYmU4OTZkMTcy%0ANDE3OAY7AEZJIg10cmFja2luZwY7AEZ7B0kiFEhUVFBfVVNFUl9BR0VOVAY7%0AAFRJIi1jNjk3MTM0YWMxNTg5Y2ZmNzFmNjA0YTc1ODhmYjFhMmIxMDkxMjYz%0ABjsARkkiGUhUVFBfQUNDRVBUX0xBTkdVQUdFBjsAVEkiLWM2OWVjOTEzYTg1%0AY2UyMmNjNmM4NjJmYWRlZjdmNWFhMmM2M2JmODkGOwBGSSIKZmxhc2gGOwBG%0AewBJIg11c2VybmFtZQY7AEZJIg10b21zbWl0aAY7AFQ%3D%0A--f28939b33b3c53099bed29b847ea6cf4083aa28b"));
        webDriver.get("https://www.ozon.ru/secure");

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Secure Area')]")));

    }


    @Test
    void basicAuthTest() {
        webDriver.get("https://www.ozon.ru/basic_auth");

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Congratulations! You must have the proper credentials.')]")));
    }
}
 27  src/test/java/ru/gb/lesson/lesson5/BasicTest.java
@@ -0,0 +1,27 @@

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeEach;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import java.util.concurrent.TimeUnit;

public class BasicTest {
    WebDriver webDriver;
    WebDriverWait webDriverWait;
    String url = "https://crm.geekbrains.space/";

    {

    @BeforeEach
    void setUp() {
        webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 7);
    }

    @AfterEach
    void tearDown() {
        webDriver.quit();
    }
}