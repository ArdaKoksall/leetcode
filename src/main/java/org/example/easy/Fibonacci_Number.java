package org.example.easy;

// URL: https://leetcode.com/problems/fibonacci-number/

public class Fibonacci_Number {
    public int fib(int n) {
        if(n == 1 || n == 0){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
