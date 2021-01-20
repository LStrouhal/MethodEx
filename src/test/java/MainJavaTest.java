import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainJavaTest {

    @Test
    public void TestString (){
    String testCase = "Hello";
    int length = 4;
    boolean result = MainJava.GreaterThan(testCase, length);
    assertEquals(true,result);
    }
}
