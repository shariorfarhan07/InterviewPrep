package org.example;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        while (t.length() > i) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
                if (j == s.length()) {
                    return true;
                }
            }
            i++;
        }

        return false;
    }

}
