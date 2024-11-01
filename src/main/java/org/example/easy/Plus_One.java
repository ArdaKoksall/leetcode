package org.example.easy;

// URL: https://leetcode.com/problems/plus-one/

public class Plus_One {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] number = new int[digits.length + 1];
        number[0] = 1;
        return number;
    }
}
