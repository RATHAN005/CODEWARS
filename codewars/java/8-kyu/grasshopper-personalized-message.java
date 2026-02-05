class Kata {
    static String greet(String name, String owner) {
        if(name.equals(owner)){
          return "Hello boss";
        }else 
          return "Hello guest";
}}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata.greet("Greg", "Daniel"));
    }
}