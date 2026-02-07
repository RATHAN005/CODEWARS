public class NoBoring {
    public static int noBoringZeros(int n) {
        if( n == 0){
          return 0;
        }
      while(n%10  ==0){
        n /= 10;
      }
      return n;
    }
}
import static org.junit.Assert.*;
import org.junit.Test;

public class NoBoringTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: noBoringZeros");    
        testing(NoBoring.noBoringZeros(1450), 145);
        testing(NoBoring.noBoringZeros(960000), 96);
        testing(NoBoring.noBoringZeros(1050), 105);
        testing(NoBoring.noBoringZeros(-1050), -105);
    }
}