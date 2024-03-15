package com.codurance;

public class RomanConverter {

    public static String convert(int number) {
        if (number == 5) {
            return "V";
        }
        if(number == 6) {
            return "VI";
        }
        String romanNumeral = "";
        for (int i = 0; i < number; i++) {
            romanNumeral += "I";
        }
        return romanNumeral;
    }
}
