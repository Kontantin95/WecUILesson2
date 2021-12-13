package Lesson4;

public class LogTestTime {
    private static Logger logger = LoggerFactory.getLogger(TriangleTest.class);
    private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @Override
    public void afterTestExecution(ExtensionContext extensionContext) {
        long currentTimeMillis = System.currentTimeMillis();
        long startTime = (long) extensionContext.getStore(ExtensionContext.Namespace.GLOBAL).get("start time");
        logger.info("Test: " + extensionContext.getDisplayName() + " has Duration " + (currentTimeMillis - startTime));
    }
    @Override
    public void beforeTestExecution(ExtensionContext extensionContext) {
        extensionContext.getStore(ExtensionContext.Namespace.GLOBAL).put("start time", System.currentTimeMillis());
    }
}
}
