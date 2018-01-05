package easy;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String pre = strs[0];
        for (int i = 1; i < strs.length ; i++) {
            while (strs[i].indexOf(pre)!=0){
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }

    public static void main(String[] args) {
        String a = "asss";
        String b = "";
//        System.out.println(b.substring(0,0));
//        System.out.println(a.indexOf(b));
        Longest_Common_Prefix l = new Longest_Common_Prefix();
        String[] strs = {
                "asdfgh"    ,
                "asdghj"    ,
                "asgeg"
        };
        System.out.println(l.longestCommonPrefix(strs));
    }
}
