package org.example.medium;

// URL: https://leetcode.com/problems/strictly-palindromic-number/
// Description: you can use return false instead of this code; this is just for demonstration purposes

public class Strictly_Palindromic_Number {
    public boolean isStrictlyPalindromic(int n) {
        for(int i = n - 2; i >= 2; i--){
            if(!isPalindrome(convertToBase(n, i))){
                return false;
            }
        }
        return true;
    }

    public static int convertToBase(int x, int n) {
        int result = 0;
        int placeValue = 1;

        while (x > 0) {
            int remainder = x % n;
            result += remainder * placeValue;
            x /= n;
            placeValue *= 10;
        }

        return result;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }
}
