package org.example.easy;

// URL: https://leetcode.com/problems/palindrome-number/

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        int y = 0;
        int def = x;
        while (x > 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return def == y;
    }
}
