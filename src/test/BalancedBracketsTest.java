package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoUnmatchedLeftBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoUnmatchedRightBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void noBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Test"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void manyUnbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launchcode] [[ [] test"));
    }

    @Test
    public void manyBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Launchcode] [[[]]] test [][]"));
    }

    @Test
    public void stringContainingNumbersAndMatchingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("25556[]5[6][][][[[565443]]]"));
    }

    @Test
    public void unorderedMatchingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void longerUnorderedMatchingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][[][][]"));
    }

    @Test
    public void allLeftBracesReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[["));
    }

    @Test
    public void allRightBracesReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]"));
    }
}
