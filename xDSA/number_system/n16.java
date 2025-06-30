//WAP to define a method to check the given number is Palindrome or not.

public class n16 {
    public static void main(String[] args) {
        int n=12321;
        if(isPalindrome(n)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
    static boolean isPalindrome(int n){
        int temp=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
             n=n/10;
         }  
         if(rev==temp){
            return true;
         }else{
            return false;
         }
    }
}


//OUTPUT - palindrome
