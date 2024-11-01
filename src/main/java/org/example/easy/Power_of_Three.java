package org.example.easy;

// URL: https://leetcode.com/problems/power-of-three/

public class Power_of_Three {
    public boolean isPowerOfThree(int n) {
        for(int i = 0; i < 20; i++){
            if(Math.pow(3, i) == n){
                return true;
            }
        }
        return false;
    }
}
