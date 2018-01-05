package easy;

import javafx.beans.property.ReadOnlySetProperty;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:
     Input: 123
     Output:  321

 Example 2:
     Input: -123
     Output: -32

 Example 3:
     Input: 120
     Output: 21
 */
public class Reverse_Integer {
  //变为字符串反转
    public int reverse(int x) {
        long a = (long) x;
        if(a==0)
            return x;
        else if (a>0)
            return reverse_positive(a);
        else
            return -reverse_positive(-a);

    }
    // 反转正整数
    public int reverse_positive(long x){
        //去除末尾的0；
        while(true){
            if(x%10==0){
                x=x/10;
            }else{
                break;
            }
        }
        String str = Long.toString(x);
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        for(int i = len-1; i>=0; i--){
            char s = str.charAt(i);
            sb.append(s);
        }
        long temp = Long.parseLong(sb.toString());

        try {
            if (temp > Integer.MAX_VALUE)
                throw new RuntimeException("整数溢出");
            return (int) temp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
 //取余反转
    public int reverse_2(int x){
        long result = 0;
        while(x!=0) {
            int tail = x%10;
            result = result*10+tail;
            x=x/10;
        }
        if (result>Integer.MAX_VALUE)
            throw new RuntimeException("整形溢出");
        return (int)result;
    }
    public static void main(String[] args) {
        Reverse_Integer reverse_integer = new Reverse_Integer();
//        int a = reverse_integer.reverse(1234567899);
//        System.out.println(a);
//        int b = reverse_integer.reverse_2(789);
//        System.out.println(b);
//        System.out.println(Integer.parseInt("0"));


    }
    /**
     * 注意：
     * 1，32位整数(int)溢出问题：
     *      -2147483648 取正后 溢出
     *      1234567899 反转后 变为 9987654321 溢出
     *
     */
}
