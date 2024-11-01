package org.example.medium;

// URL: https://leetcode.com/problems/powx-n/

public class Pow_x_n {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        if(n == -1){
            return 1/x;
        }
        if(n % 2 == 0){
            return myPow(x*x, n/2);
        }else{
            return myPow(x*x, n/2) * (n > 0 ? x : 1/x);
        }
    }
}
