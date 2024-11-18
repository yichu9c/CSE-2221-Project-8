import static org.junit.Assert.assertEquals;

import org.junit.Test;

import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * @author Put your name here
 *
 */
public class CryptoUtilitiesTest {

    /*
     * Tests of reduceToGCD
     */

    @Test //Test edge
    public void testReduceToGCD_0_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(0);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test //test routine
    public void testReduceToGCD_30_21() {
        NaturalNumber n = new NaturalNumber2(30);
        NaturalNumber nExpected = new NaturalNumber2(3);
        NaturalNumber m = new NaturalNumber2(21);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    @Test //test gcd of one
    public void testReduceToGCD_23_4() {
        NaturalNumber n = new NaturalNumber2(4);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber m = new NaturalNumber2(23);
        NaturalNumber mExpected = new NaturalNumber2(0);
        CryptoUtilities.reduceToGCD(n, m);
        assertEquals(nExpected, n);
        assertEquals(mExpected, m);
    }

    /*
     * Tests of isEven
     */

    @Test // Test edge
    public void testIsEven_0() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(0);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    @Test // Test odd number
    public void testIsEven_1() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    @Test // Test odd number routine
    public void testIsEven_5() {
        NaturalNumber n = new NaturalNumber2(5);
        NaturalNumber nExpected = new NaturalNumber2(5);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(false, result);
    }

    @Test // Test even number routine
    public void testIsEven_12() {
        NaturalNumber n = new NaturalNumber2(12);
        NaturalNumber nExpected = new NaturalNumber2(12);
        boolean result = CryptoUtilities.isEven(n);
        assertEquals(nExpected, n);
        assertEquals(true, result);
    }

    /*
     * Tests of powerMod
     */

    @Test //Test edge
    public void testPowerMod_0_0_2() {
        NaturalNumber n = new NaturalNumber2(0);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(0);
        NaturalNumber pExpected = new NaturalNumber2(0);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //Test power less than modulus
    public void testPowerMod_1_1_2() {
        NaturalNumber n = new NaturalNumber2(1);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(1);
        NaturalNumber pExpected = new NaturalNumber2(1);
        NaturalNumber m = new NaturalNumber2(2);
        NaturalNumber mExpected = new NaturalNumber2(2);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //test routine
    public void testPowerMod_17_18_19() {
        NaturalNumber n = new NaturalNumber2(17);
        NaturalNumber nExpected = new NaturalNumber2(1);
        NaturalNumber p = new NaturalNumber2(18);
        NaturalNumber pExpected = new NaturalNumber2(18);
        NaturalNumber m = new NaturalNumber2(19);
        NaturalNumber mExpected = new NaturalNumber2(19);
        CryptoUtilities.powerMod(n, p, m);
        assertEquals(nExpected, n);
        assertEquals(pExpected, p);
        assertEquals(mExpected, m);
    }

    @Test //test routine
    public void testIsWitnessToCompositeness3_5() {
        NaturalNumber a = new NaturalNumber2(3);
        NaturalNumber aExpected = new NaturalNumber2(3);
        NaturalNumber b = new NaturalNumber2(5);
        NaturalNumber bExpected = new NaturalNumber2(5);
        boolean expected = false;
        boolean real = CryptoUtilities.isWitnessToCompositeness(a, b);
        assertEquals(expected, real);
        assertEquals(aExpected, a);
        assertEquals(bExpected, b);
    }

    @Test //test square, routine
    public void testIsWitnessToCompositeness7_49() {
        NaturalNumber a = new NaturalNumber2(7);
        NaturalNumber aExpected = new NaturalNumber2(7);
        NaturalNumber b = new NaturalNumber2(49);
        NaturalNumber bExpected = new NaturalNumber2(49);
        boolean expected = true;
        boolean real = CryptoUtilities.isWitnessToCompositeness(a, b);
        assertEquals(expected, real);
        assertEquals(aExpected, a);
        assertEquals(bExpected, b);
    }

    @Test // Test edge, also if statement that 2 and 3 are prime
    public void testIsPrime2_2() {
        NaturalNumber a = new NaturalNumber2(2);
        NaturalNumber aExpected = new NaturalNumber2(2);
        boolean expected = true;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test //Test statement that 2 and 3 are prime
    public void testIsPrime2_3() {
        NaturalNumber a = new NaturalNumber2(2);
        NaturalNumber aExpected = new NaturalNumber2(2);
        boolean expected = true;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test //Test odd number
    public void testIsPrime2_7() {
        NaturalNumber a = new NaturalNumber2(7);
        NaturalNumber aExpected = new NaturalNumber2(7);
        boolean expected = true;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test // Test a square number that is not even
    public void testIsPrime2_49() {
        NaturalNumber a = new NaturalNumber2(49);
        NaturalNumber aExpected = new NaturalNumber2(49);
        boolean expected = false;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test //Test routine even number
    public void testIsPrime2_10() {
        NaturalNumber a = new NaturalNumber2(10);
        NaturalNumber aExpected = new NaturalNumber2(10);
        boolean expected = false;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test //Test routine even number
    public void testIsPrime2_32() {
        NaturalNumber a = new NaturalNumber2(32);
        NaturalNumber aExpected = new NaturalNumber2(32);
        boolean expected = false;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test //Test even square number, routine
    public void testIsPrime2_64() {
        NaturalNumber a = new NaturalNumber2(64);
        NaturalNumber aExpected = new NaturalNumber2(64);
        boolean expected = false;
        boolean real = CryptoUtilities.isPrime2(a);
        assertEquals(aExpected, a);
        assertEquals(expected, real);
    }

    @Test //Test edge
    public void testGenerateNextLikelyPrime2_3() {
        NaturalNumber a = new NaturalNumber2(2);
        NaturalNumber result = new NaturalNumber2(3);
        CryptoUtilities.generateNextLikelyPrime(a);
        assertEquals(a, result);
    }

    @Test // Test odd number
    public void testGenerateNextLikelyPrime19() {
        NaturalNumber a = new NaturalNumber2(19);
        NaturalNumber result = new NaturalNumber2(23);
        CryptoUtilities.generateNextLikelyPrime(a);
        assertEquals(a, result);
    }

    @Test // Test even number
    public void testGenerateNextLikelyPrime6() {
        NaturalNumber a = new NaturalNumber2(6);
        NaturalNumber result = new NaturalNumber2(7);
        CryptoUtilities.generateNextLikelyPrime(a);
        assertEquals(a, result);
    }

    @Test // Test prime number
    public void testGenerateNextLikelyPrime17() {
        NaturalNumber a = new NaturalNumber2(17);
        NaturalNumber result = new NaturalNumber2(19);
        CryptoUtilities.generateNextLikelyPrime(a);
        assertEquals(a, result);
    }

    @Test // Test routine
    public void testGenerateNextLikelyPrime11() {
        NaturalNumber a = new NaturalNumber2(11);
        NaturalNumber result = new NaturalNumber2(13);
        CryptoUtilities.generateNextLikelyPrime(a);
        assertEquals(a, result);
    }

    @Test // Test routine
    public void testGenerateNextLikelyPrime14() {
        NaturalNumber a = new NaturalNumber2(14);
        NaturalNumber result = new NaturalNumber2(17);
        CryptoUtilities.generateNextLikelyPrime(a);
        assertEquals(a, result);
    }

}