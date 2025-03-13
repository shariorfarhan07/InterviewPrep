package org.example;

public class ReverseInteger {
    public static void main(String[] args) {
//        System.out.println(reverse(-153));
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        boolean negative = x < 0;
        x = Math.abs(x);
        long rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return (Integer.MAX_VALUE < rev) ? 0 : (int) ((negative) ? -1 * rev : rev);
    }
}
