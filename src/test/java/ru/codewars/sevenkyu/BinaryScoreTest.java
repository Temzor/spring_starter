package ru.codewars.sevenkyu;

import org.junit.Test;
import java.math.BigInteger;
import java.util.Random;
import static org.junit.Assert.assertEquals;

public class BinaryScoreTest {
    private static void tester(BigInteger inp, BigInteger exp) {
        assertEquals(exp, BinaryScore.score(inp));
    }

    private static BigInteger randBigInteger(BigInteger min, BigInteger max) {
        return new BigInteger(max.bitLength(), new Random()).remainder(max.subtract(min).add(BigInteger.ONE)).add(min);
    }

    private static BigInteger ans(BigInteger n) {
        return !n.equals(0) ? new BigInteger("2").pow(n.bitLength()).subtract(BigInteger.ONE) : BigInteger.ZERO;
    }

    @Test
    public void basicTests() {
        tester(new BigInteger("0"), new BigInteger("0"));
        tester(new BigInteger("1"), new BigInteger("1"));
        tester(new BigInteger("49"), new BigInteger("63"));
        tester(new BigInteger("1000000"), new BigInteger("1048575"));
        tester(new BigInteger("10000000"), new BigInteger("16777215"));
    }

    @Test
    public void randomTests() {
        for (int i = 0; i < 100; i++) {
            BigInteger n = randBigInteger(new BigInteger("0"), new BigInteger("100000"));
            tester(n, ans(n));
        }
        for (int i = 0; i < 100; i++) {
            BigInteger n = randBigInteger(new BigInteger("100000"), new BigInteger("100000000"));
            tester(n, ans(n));
        }
        for (int i = 0; i < 100; i++) {
            BigInteger n = randBigInteger(new BigInteger("1000000000"), new BigInteger("100000000000000"));
            tester(n, ans(n));
        }
        for (int i = 0; i < 100; i++) {
            BigInteger n = randBigInteger(new BigInteger("1000000000000000"), new BigInteger("10000000000000000000000"));
            tester(n, ans(n));
        }
    }
}