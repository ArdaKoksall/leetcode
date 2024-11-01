package org.example.hard;


// URL: https://leetcode.com/problems/valid-number/

public class Valid_Number {
    public boolean isNumber(String s) {
        if(s.equals("Infinity") || s.equals("+Infinity") || s.equals("-Infinity") || s.endsWith("f") || s.endsWith("D")){
            return false;
        }
        try{
            double number = Double.parseDouble(s);
            return true;
        }catch(NumberFormatException _){
            return false;
        }
    }
}
