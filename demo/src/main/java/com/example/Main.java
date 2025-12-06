package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2)); // expected: ChoCho
        System.out.println(frontTimes("Chocolate", 3)); // expected: ChoChoCho
        System.out.println(frontTimes("Abc", 3));       // expected: AbcAbcAbc
    }

    /**
     * Return n copies of the "front" of the string. The front is the first 3
     * characters, or the whole string if it's less than length 3.
     */
    public static String frontTimes(String str, int n) {
        if (str == null) return null;
        int frontLen = Math.min(3, str.length());
        String front = str.substring(0, frontLen);
        StringBuilder sb = new StringBuilder(frontLen * Math.max(0, n));
        for (int i = 0; i < n; i++) {
            sb.append(front);
        }
        return sb.toString();
    }
}