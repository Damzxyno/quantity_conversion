package testing_framework;

public class TestServiceImpl implements TestService{
    private static int testNumber = 0;
    @Override
    public void isEqual(double expected, double derived) {
        testNumber++;

        if (expected == derived){
            System.out.printf("\nTest %d: Passed...", testNumber);
        } else {
            System.err.printf("\nTest %d: Failed... Expected %f but got %f", testNumber, expected, derived);
        }
    }
}
