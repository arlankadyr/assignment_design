package algo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

public class MergeSortTest {
    @Test
    void testCorrectness() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        MergeSort.sort(arr);
        assertArrayEquals(new int[]{1,2,5,5,6,9}, arr);
    }

    @Test
    void testRandomArrays() {
        Random rnd = new Random();
        for (int i = 0; i < 100; i++) {
            int[] arr = rnd.ints(100, -1000, 1000).toArray();
            int[] copy = arr.clone();
            MergeSort.sort(arr);
            Arrays.sort(copy);
            assertArrayEquals(copy, arr);
        }
    }
}
