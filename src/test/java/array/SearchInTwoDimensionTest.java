package array;
import org.junit.Test;
import static org.junit.Assert.*;
public class SearchInTwoDimensionTest {
    @Test
    public void testNull(){
        int[][] array = null;
        int target = 1;
        boolean result = SearchInTwoDimension.Find(target,array);
        assertFalse(result);
    }
    @Test
    public void testEmpty(){
        int[][] array = new int[0][0];
        int target = 1;
        boolean result = SearchInTwoDimension.Find(target,array);
        assertFalse(result);
    }

    @Test
    public void testCol(){
        int[][] array = {
                {0},{1},{2},{3},{4}
        };
        assertTrue(SearchInTwoDimension.Find(0,array));
        assertTrue(SearchInTwoDimension.Find(1,array));
        assertTrue(SearchInTwoDimension.Find(2,array));
        assertTrue(SearchInTwoDimension.Find(3,array));
        assertTrue(SearchInTwoDimension.Find(4,array));
        assertFalse(SearchInTwoDimension.Find(5,array));
    }
    @Test
    public void testRow(){
        int[][] array = {{0,1,2,3,4}};
        assertTrue(SearchInTwoDimension.Find(0,array));
        assertTrue(SearchInTwoDimension.Find(1,array));
        assertTrue(SearchInTwoDimension.Find(2,array));
        assertTrue(SearchInTwoDimension.Find(3,array));
        assertTrue(SearchInTwoDimension.Find(4,array));
        assertFalse(SearchInTwoDimension.Find(5,array));
    }
    @Test
    public void testNormal(){
        int[][] array = {
                {0,1,2,3,4},
                {1,2,3,4,5},
                {2,3,4,5,6}
        };
        assertTrue(SearchInTwoDimension.Find(0,array));
        assertTrue(SearchInTwoDimension.Find(1,array));
        assertTrue(SearchInTwoDimension.Find(2,array));
        assertTrue(SearchInTwoDimension.Find(3,array));
        assertTrue(SearchInTwoDimension.Find(4,array));
        assertTrue(SearchInTwoDimension.Find(5,array));
        assertTrue(SearchInTwoDimension.Find(6,array));
        assertFalse(SearchInTwoDimension.Find(7,array));
    }
}
