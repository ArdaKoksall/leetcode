package org.example.easy;

// URL: https://leetcode.com/problems/power-of-four/

public class Power_of_Four {
    public boolean isPowerOfFour(int n) {
        if(n == 1){
            return true;
        }
        if(n % 4 != 0 || n == 0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
