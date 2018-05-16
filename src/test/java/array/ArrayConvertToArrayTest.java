package array;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ArrayConvertToArrayTest {
    private ArrayConvertToArray tObj;
    @Before
    public void init(){
        tObj = new ArrayConvertToArray();
    }
    @Test
    public void testNull(){
        int[] A = null;
        int[] re = tObj.multiply(A);
        assertNull(re);
    }
    @Test
    public void testEmpty(){
        int[] A = new int[0];
        int[] re = tObj.multiply(A);
        assertNotNull(re);
        assertTrue(re.length == 0);
    }
    @Test
    public void testOne(){
        int[] A = new int[]{
                1
        };
        int[] re = tObj.multiply(A);
        assertNotNull(re);
        assertTrue(re.length == 1);
        assertEquals(1,re[0]);
    }
    @Test
    public void testTwo(){
        int[] A = new int[]{
                1,2
        };
        int[] re = tObj.multiply(A);
        assertNotNull(re);
        assertTrue(re.length == 2);
        assertEquals(A[0],re[1]);
        assertEquals(A[1],re[0]);
    }
    @Test
    public void testNormal(){
        int[] A = new int[]{1,2,3};
        int[] re = tObj.multiply(A);
        assertNotNull(re);
        assertTrue(re.length == A.length);
        assertEquals(6,re[0]);
        assertEquals(3,re[1]);
        assertEquals(2,re[2]);
    }
}
