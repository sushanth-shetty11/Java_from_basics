//WAP to define a method to check the given number is Palindrome or not.

public class n16 {
    public static void main(String[] args) {
        int n=15451;
        isPalindrome(n);
    }
    static boolean isPalindrome(int n){
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
             n=n/10;
         }
         return n==rev;
    }
}
