package org.example;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
//        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("9223372036854775808"));
//        System.out.println(myAtoi("+-12"));
    }

    public static int myAtoi(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        long count = 0;
        int i = 0;
        boolean negative = false;
        while (s.charAt(i) == ' ' ) {
            i++;
        }
        if (s.charAt(i) == '-') {
            negative = true;
            i++;
        }else if (s.charAt(i) == '+') {
            i++;
        }
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                count = count * 10 + s.charAt(i) - '0';
            } else {
                break;
            }
            i++;
        }
         System.out.println(count);
        if (negative) {
            count = -count;
        }
        if (Integer.MAX_VALUE < count ) {
            return Integer.MAX_VALUE;
        }
        if (Integer.MIN_VALUE > count ) {
            return -Integer.MIN_VALUE;
        }
        return (int)( count);
    }
}
