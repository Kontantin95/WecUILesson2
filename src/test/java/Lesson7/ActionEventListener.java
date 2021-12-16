package Lesson7;

public class ActionEventListener {
    private static final Logger logger = LoggerFactory.getLogger("Action Logger");

    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        String stepName = "Нажать на элемент с текстом " + element.getText();
        step(stepName);
        logger.info(stepName);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        String stepName = "Успешно!";
        step(stepName);
        logger.info(stepName);
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        String stepName = "Ввести текст " + Arrays.toString(keysToSend) + " в поле с id = " + element.getAttribute("id");
        step(stepName);
        logger.info(stepName);
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        String stepName = "Успешно!";
        step(stepName);
        logger.info(stepName);
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        Allure.addAttachment("ScreenShot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
    }
}

