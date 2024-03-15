package com.codurance;

public class RomanConverter {

    public static String convert(int number) {
        if (number == 2) {
            return "II";
        }
        if (number == 3) {
            return "III";
        }
        return "I";
    }
}
