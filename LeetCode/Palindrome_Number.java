public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String str ="";
        int b = x;
        while(b!=0){
            str+=b%10;
            b/=10;
        }
        int a = Integer.parseInt(str);
        return a==x;
    }

    public static void main(String[] args) {
        Palindrome_Number ps  = new Palindrome_Number();
        System.out.println(ps.isPalindrome(1991));
    }
}
