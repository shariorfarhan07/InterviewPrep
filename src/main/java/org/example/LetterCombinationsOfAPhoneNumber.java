package org.example;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        char[][] keypad = {
                {},                // 0 - No mapping
                {},                // 1 - No mapping
                {'a', 'b', 'c'},   // 2
                {'d', 'e', 'f'},   // 3
                {'g', 'h', 'i'},   // 4
                {'j', 'k', 'l'},   // 5
                {'m', 'n', 'o'},   // 6
                {'p', 'q', 'r', 's'}, // 7
                {'t', 'u', 'v'},   // 8
                {'w', 'x', 'y', 'z'}  // 9
        };
        wordsForKeyPress(digits, 0, "", result, keypad);
        return result;
    }

    public static void wordsForKeyPress(String digits, int index, String keyPressed, List<String> result, char[][] keyPress) {
        if (digits.isEmpty() && digits.length() <= index) {
            return;
        }
        if (digits.length() == index) {
            result.add(keyPressed);
            return;
        }
        int digit = digits.charAt(index) - '0';
        for (char i : keyPress[digit]) {
            wordsForKeyPress(digits, index + 1, keyPressed + i, result, keyPress);
        }
    }

}
