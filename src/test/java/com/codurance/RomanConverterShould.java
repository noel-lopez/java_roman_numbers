package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterShould {

    @ParameterizedTest(name = "{1} into {0}")
    @CsvSource({
            "I, 1",
            "II, 2",
            "III, 3",
            "V, 5",
            "VI, 6"
    })
    public void convert (String expected, int input) {
        assertEquals(expected, RomanConverter.convert(input));
    }
}
