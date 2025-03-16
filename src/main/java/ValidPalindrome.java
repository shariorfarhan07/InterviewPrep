public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(String s) {
        String output ="";
        for (char c : s.toCharArray()) {
            if (('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || ('0' <= c && c <= '9'))
                output += c;
        }
        output = output.toLowerCase();
        for (int i = 0; i < output.length()/2; i++) {
            if (output.charAt(i) != output.charAt(output.length()-1-i)) return false;
        }

    return true;}
}
