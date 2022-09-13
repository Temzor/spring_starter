package ru.codewars.sevenkyu;

import java.math.BigInteger;

public class BinaryScore {
    public static BigInteger score(BigInteger n) {
        return BigInteger.ZERO.setBit(n.bitLength()).subtract(BigInteger.ONE);
    }
}
