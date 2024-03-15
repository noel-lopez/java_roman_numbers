package com.codurance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RomanConverterShould {
    @Test
    public void return_I_given_1 () {
        assertEquals("I", RomanConverter.convert(1));
    }
}
