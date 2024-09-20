package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "[]";
        String result = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result), message);
    }

    @Test
    public void LaunchCodeReturnsInBrackets() {
                String result = "[LaunchCode]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void CodeReturnsInBrackets() {
        String result = "Launch[Code]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void EmptyStringReturnsNoBrackets() {
        String result = "";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ReturnsWithOneOpenBracket() {
        String result = "[LaunchCode";
        assertFalse(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ReturnsBackwardsBracketInWord() {
        String result = "Launch]Code[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ReturnsLeftBracketOnly() {
        String result = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ManyBalancedBrackets() {
        String result = "[[[]]]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }


    @Test
    public void ManyUnbalancedBrackets() {
        String result = "[[[]]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(result));
    }


    @Test
    public void ManyOutOfOrderBrackets() {
        String result = "][[[]]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ManyOrderedBrackets() {
        String result = "[][][]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ManyOrderedBracketsWithWords() {
        String result = "[Launch][Code][What]evers";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ConcatenatedBrackets() {
        String result = "[][][]" + "Hello World";
        assertTrue(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void ConcatenatedOpenBrackets() {
        String result = "[][][]" + "Hello World[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(result));
    }

    @Test
    public void StringToInt() {
//        String intString = "69";
//        int NumFromString = Integer.parseInt(intString);
        int Number = 69;
        String str = Integer.toString(Number);
        assertTrue(BalancedBrackets.hasBalancedBrackets(str + "[]"));
    }


}