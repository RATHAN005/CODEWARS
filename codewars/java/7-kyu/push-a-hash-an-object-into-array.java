import java.util.List;
import java.util.ArrayList;

public class PushAnObjectIntoArray {  
  public static List<String> push() {
    List<String> items = new ArrayList<>();
    items.add("an object");  
    return items;
  }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;

public class PushAnObjectIntoArrayTest {

    @Test
    public void testSomething() {
      List<String> items = PushAnObjectIntoArray.push();
      assertEquals(1,items.size());
      assertEquals("an object", items.get(0));
    }
}