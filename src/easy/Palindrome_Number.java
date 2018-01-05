package easy;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int tem = x;
        int div = 1;

        //统计x的位数
        while((tem=tem/10)!=0){
            div*=10;
        }

        while(x!=0){
            //获取x的首位和末位数
            int f = x/div;
            int l = x%10;
            if(f!=l){
                return false;
            }
            //掐头去尾
            x=x-div*f;
            x/=10;

            //新的x的位数
            div/=100;

        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome_Number palindrome_number = new Palindrome_Number();
        boolean palindrome = palindrome_number.isPalindrome(9);
        System.out.println(palindrome);
    }
}
