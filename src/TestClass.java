import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestClass {

    private Checker checker;

    @Before
    public void init(){
        checker = new Checker();
    }
    @Test
    public void testChecker_true(){
        int[] array1 = {1,5,2,1,1};
        assertTrue(checker.check(array1));
        int[] array2 = {1,5,2,1,1,2,2,2,2};
        assertTrue(checker.check(array2));
        int[] array3 = {1,5,2,1,5,1,5,5,5,1,5};
        assertTrue(checker.check(array3));
    }
    @Test
    public void testChecker_false(){
        int[] array1 = {1,5,2,1};
        assertFalse(checker.check(array1));
        int[] array2 = {1,5,2,1,5,5,1};
        assertFalse(checker.check(array2));
        int[] array3 = {1,5,2,1,2,1,2,2,1,7,4};
        assertFalse(checker.check(array3));

    }
}
