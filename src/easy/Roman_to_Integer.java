package easy;

public class Roman_to_Integer {
    /*
               基本字符	      I  V  X   L   C   D   M
     相应的阿拉伯数字表示为	  1  5  10  50 100 500 1000
     相同的数字连写、所表示的数等于这些数字相加得到的数、如：Ⅲ=3；
     小的数字在大的数字的右边、所表示的数等于这些数字相加得到的数、 如：Ⅷ=8、Ⅻ=12；
     小的数字（限于 I、X 和 C）在大的数字的左边、所表示的数等于大数减小数得到的数、如：Ⅳ=4、Ⅸ=9；
     正常使用时、连写的数字重复不得超过三次；w
     在一个数的上面画一条横线、表示这个数扩大 1000 倍。
     */
//    public int romanToInt(String s) {
//        int result = 0;
//        int len = s.length();
//        int pre = 0;
//        for (int i = len-1; i >= 0 ; i--) {
//            int tmp = 0;
//            switch (s.charAt(i)) {
//                case 'I':
//                    tmp = 1;
//                    break;
//                case 'V':
//                    tmp = 5;
//                    break;
//                case 'X':
//                    tmp = 10;
//                    break;
//                case 'L':
//                    tmp = 50;
//                    break;
//                case 'C':
//                    tmp = 100;
//                    break;
//                case 'D':
//                    tmp = 500;
//                    break;
//                case 'M':
//                    tmp = 1000;
//                    break;
//            }
//            System.out.println(tmp);
//            if(tmp>=pre)
//                result+=tmp;
//            else
//                result-=tmp;
//            pre = tmp;
//        }
//        return result;
//    }

    public int romanToInt(String s) {
        int ans = 0; char c =' ';
        for(int i = 0; i<s.length(); i++){
            if(rTI(s.charAt(i)) <= rTI(c))
                ans += rTI(c);
            else
                ans -= rTI(c);
            c = s.charAt(i);
        }
        return ans+rTI(c);
    }

    public static int rTI(char c){
        if(c=='I') return 1;
        else if(c=='V') return 5;
        else if(c=='X') return 10;
        else if(c=='L') return 50;
        else if(c=='C') return 100;
        else if(c=='D') return 500;
        else if(c== 'M') return 1000;
        else return 0;
    }
    public static void main(String[] args) {
        Roman_to_Integer r = new Roman_to_Integer();
        int i = r.romanToInt("IV");
        System.out.println(i);
    }
}
