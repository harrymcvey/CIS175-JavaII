import static org.junit.Assert.*;
import model.MemoUtil;

import org.junit.Before;
import org.junit.Test;

public class TestMemo2 {
    String memo = "Robert";
    MemoUtil memoUtil = new MemoUtil(memo);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        String memoMessage = "Hi Robert!\n";
        assertEquals(memoMessage, memoUtil.greetings());
    }
}
