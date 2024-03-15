package com.codurance;

public class RomanConverter {

    public static String convert(int number) {
        String romanNumeral = "";
        for (int i = 0; i < number; i++) {
            romanNumeral += "I";
        }
        return romanNumeral;

    }
}
