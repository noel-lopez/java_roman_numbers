package com.codurance;

public class RomanConverter {

    public static String convert(int number) {
        // Temporal state
        String romanNumeral = "";
        int auxNumber = number;
        // Add V if needed
        if (auxNumber >=5) {
            romanNumeral += "V";
            auxNumber -= 5;
        }
        // Add as much "I" as needed
        for (int i = 0; i < auxNumber; i++) {
            romanNumeral += "I";
        }
        return romanNumeral;
    }
}
