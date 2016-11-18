package training.common;


public final class TestEnvHelper {
    public static final TestEnvHelper TEST_ENV_HELPER = new TestEnvHelper();
    private boolean successfulRun = false;
    private boolean slowlRun = false;

    public TestEnvHelper() {

        double random = Math.random();
        System.out.println(random);
        if (random < 1d/3) {
            successfulRun = true;
            System.out.println("All tests will succeed");
        }
        if (random < 1d/6) {
            slowlRun = true;
            System.out.println("Running slow");
        }
    }

    public boolean successfulRun(){
        return successfulRun;
    }

    public void testIsStarting(String methodName) {
        try {
            System.out.println("Starting test "+methodName);
            if (slowlRun)
                Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
