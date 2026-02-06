public class SimplePrimeStreaming {

    public static String solve(int a, int b) {
        StringBuilder sb = new StringBuilder();
        int num = 2;

        while (sb.length() < a + b) {
            if (isPrime(num)) {
                sb.append(num);
            }
            num++;
        }

        return sb.substring(a, a + b);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SampleTest {
    @Test
    public void basicTests() {
        doTest(    2,  2, "57");
        doTest(   10,  3, "192");
        doTest(   20,  9, "414347535");
        doTest(   30, 12, "616771737983");
        doTest(   40,  8, "83899710");
        doTest(   50,  6, "031071");
        doTest(10000,  5, "02192");
        doTest(20000,  5, "09334");
    }
    private void doTest(int a, int b, String expected) {
        assertEquals(expected, SimplePrimeStreaming.solve(a, b));
    }
}