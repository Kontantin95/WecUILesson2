package Lesson7;

public class MyAccountPage  {
    webDriver.findElement(By.xpath("//li[contains(., 'My personal information')]")).click();
    return new MyPersonalInformationPage(webDriver);
}

