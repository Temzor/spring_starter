package ru.codewars.sevenkyu;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void fixedTests() {
        assertThat(Fibonacci.fibonacci(2147483647)).isEqualTo(1485607536);
        assertThat(Fibonacci.fibonacci(1000000000)).isEqualTo(350704366);
        assertThat(Fibonacci.fibonacci(100000000)).isEqualTo(82790070);
        assertThat(Fibonacci.fibonacci(1000000)).isEqualTo(1089154);
        assertThat(Fibonacci.fibonacci(1000)).isEqualTo(798);
        assertThat(Fibonacci.fibonacci(100)).isEqualTo(44);
        assertThat(Fibonacci.fibonacci(10)).isEqualTo(10);
        assertThat(Fibonacci.fibonacci(8)).isEqualTo(2);
        assertThat(Fibonacci.fibonacci(5)).isEqualTo(2);
        assertThat(Fibonacci.fibonacci(1)).isEqualTo(0);
    }
}