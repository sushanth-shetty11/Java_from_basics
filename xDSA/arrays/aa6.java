//palindrome

public class aa6 {
    public static void main(String[] args) {
        int a[] = {10,20,30,99,44};
        int count=0;

        for(int i=0;i<=a.length-1;i++){
            if(isPalindrome(a[i])){
               count++;
            }
            System.out.println(count);
        }
    }

    static boolean isPalindrome(int n){
        int rev=0;
        int temp=n;

        while(n>0){
            int rem = n%10;
            rev= rev*10+rem;
            n=n/10;

        }
       return rev==temp;
    }
}

