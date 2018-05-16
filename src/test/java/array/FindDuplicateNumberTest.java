package array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindDuplicateNumberTest {
    private int[] numers;
    private int length;
    private int[] duplicate;

    @Before
    public void prepare(){
        duplicate = new int[1];
        duplicate[0] = -1;
    }
    @Test
    public void testNull(){
        numers = null;
        length = -1;
        assertFalse(FindDuplicateNumber.duplicate(numers,length,duplicate));
        assertEquals(-1,duplicate[0]);
    }
    @Test
    public void testEmpty(){
        numers = new int[0];
        length = 0;
        assertFalse(FindDuplicateNumber.duplicate(numers,length,duplicate));
        assertEquals(-1,duplicate[0]);
    }
    @Test
    public void testNormal(){
        numers = new int[]{
                2,3,5,1,6,0,2,3
        };
        length = numers.length;
        assertTrue(FindDuplicateNumber.duplicate(numers,length,duplicate));
        assertEquals(2,duplicate[0]);
    }
}
