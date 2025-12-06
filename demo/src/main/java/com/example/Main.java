package com.example;

public class Main {
    public static void main(String[] args) {
        // Example runs for doubleX
        System.out.println(doubleX("axxbb"));   // expected: true
        System.out.println(doubleX("axaxax")); // expected: false
        System.out.println(doubleX("xxxxx"));  // expected: true
    }

    /**
     * Return true if the first instance of "x" in the string is immediately
     * followed by another "x".
     * Examples:
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     */
    public static boolean doubleX(String str) {
        if (str == null) return false;
        int i = str.indexOf('x');
        // if there's no 'x' or it's the last character, return false
        if (i == -1 || i == str.length() - 1) return false;
        return str.charAt(i + 1) == 'x';
    }
}