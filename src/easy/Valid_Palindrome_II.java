package easy;

/**
 Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

 Example 1:
 Input: "aba"
 Output: True

 Example 2:
 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.

 Note:
 The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
 */
public class Valid_Palindrome_II {
    public boolean validPalindrome(String s) {
        int h = 0;
        int t = s.length() - 1;
        while (h<t){
            if (s.charAt(h) != s.charAt(t)) {
                if (isPalindrom(s, h + 1, t)) {
                    System.out.println("you can delete "+s.charAt(h));
                    return true;
                }
                if (isPalindrom(s, h, t - 1)) {
                    System.out.println("you can delete "+s.charAt(t));
                    return true;
                }
                return false;
            }
            h++;t--;
        }
        return true;
    }

    public boolean isPalindrom(String s, int h, int t) {
        while(h<t){
            if (s.charAt(h)!=s.charAt(t))
                return false;
            h++;t--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aba";
        Valid_Palindrome_II v = new Valid_Palindrome_II();
        boolean b = v.validPalindrome(s);
        System.out.println(b);
    }
}
