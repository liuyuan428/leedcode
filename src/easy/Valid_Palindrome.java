package easy;

public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty())
            return true;
        s = s.toLowerCase();
        int h = 0;
        int t = s.length()-1;
         while(h<t){
             while(h<t&&! Character.isLetterOrDigit(s.charAt(h)))
                 h++;
             while(h<t&&! Character.isLetterOrDigit(s.charAt(t)))
                 t--;
             if(s.charAt(h)!=s.charAt(t))
                 return false;
             h++;t--;
         }
         return true;

//discuss 耗时更长
//        String regex = "([^a-z0-9])";
//        String replacement = "";
//        s = s.replaceAll(regex, replacement);
//        System.out.println(s);
//        int h = 0;
//        int t = s.length()-1;
//        while(h<t){
//            if(s.charAt(h)!=s.charAt(t))
//                return false;
//            h++;t--;
//        }
//        return true;


    }

    public static void main(String[] args) {
        String s = "a.";
        Boolean b = Valid_Palindrome.isPalindrome(s);
        System.out.println(b);
    }
}
