import com.kostylevv.javase.algo.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by vkostylev on 05/12/16.
 */
public class BinarySearchTest {

    @Test
    public void bsRecTestNotExists() {
        int[] array = {44,52,56,65,69,70,88,124,225,500,600,787,980,5000};
        assertEquals(BinarySearch.recursiveBinarySearch(array, 1), -1);
    }

    @Test
    public void bsRecTestExists() {
        int[] array = {44,52,56,65,69,70,88,124,225,500,600,787,980,5000};
        assertEquals(BinarySearch.recursiveBinarySearch(array, 52), 1);
    }

    @Test
    public void bsRecTestLeftmost() {
        int[] array = {44,52,56,65,69,70,88,124,225,500,600,787,980,5000};
        assertEquals(BinarySearch.recursiveBinarySearch(array, 44), 0);
    }

    @Test
    public void bsRecTestRightmost() {
        int[] array = {44,52,56,65,69,70,88,124,225,500,600,787,980,5000};
        assertEquals(BinarySearch.recursiveBinarySearch(array, 5000), 13);
    }
}
