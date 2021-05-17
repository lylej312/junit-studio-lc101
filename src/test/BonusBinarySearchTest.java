package test;

import main.BonusBinarySearch;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class BonusBinarySearchTest {

    public int[] createArray() {
        int[] sortedNumbers = new int[7];
        sortedNumbers[0] = -4;
        sortedNumbers[1] = 7;
        sortedNumbers[2] = 32;
        sortedNumbers[3] = 60;
        sortedNumbers[4] = 88;
        sortedNumbers[5] = 89;
        sortedNumbers[6] = 93;
        return sortedNumbers;
    }

    @Test
    public void returnsClosestNumber() {
        int[] array = createArray();
        assertEquals(3, BonusBinarySearch.binarySearch(array, 60), .001);
    }

    @Test
    public void returnsNegativeOneIfNotFound() {
        int[] array = createArray();
        assertEquals(-1, BonusBinarySearch.binarySearch(array, 44), .001);
    }

    @Test
    public void returnsClosestNumberThatIsNegative() {
        int[] array = createArray();
        assertEquals(0, BonusBinarySearch.binarySearch(array, -4), .001);
    }
}
