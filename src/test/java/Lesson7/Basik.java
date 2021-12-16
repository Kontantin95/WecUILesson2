package Lesson7;

public class Basik {
    protected WebDriver webDriver;
    protected EventFiringWebDriver webDriver;
    protected WebDriverWait webDriverWait;
    String url = "https://crm.geekbrains.space/";

    @BeforeEach
    void setUp() {
        webDriver = WebDriverManager.chromedriver().create();
        webDriver = new EventFiringWebDriver(WebDriverManager.chromedriver().create());
        webDriver.register(new ActionEventListener());
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 7);
    }

    @AfterEach
    void tearDown() {
        for (LogEntry logEntry : webDriver.manage().logs().get(LogType.BROWSER)) {
            Allure.addAttachment("Console log", logEntry.getMessage());
        }
        webDriver.quit();
    }
}

