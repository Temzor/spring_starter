package com.job4j.duty;

import org.junit.jupiter.api.Test;
import ru.codewars.sevenkyu.LongestWord;

import static org.assertj.core.api.Assertions.*;

class CreatePhoneNumberTest {

    @Test
    public void checkNumber() {
        assertThat("(123) 456-7890").isEqualTo(LongestWord.CreatePhoneNumber
                .createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

}