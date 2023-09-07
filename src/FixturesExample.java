import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FixturesExample {

    private int value1;
    private int value2;

    @Before
    public void setUp() throws Exception {
        value1 = 3;
        value2 = 3;
    }

    @Test
    public void test() {
        int result = value1 + value2;
        assertEquals(6, result);
    }
}
