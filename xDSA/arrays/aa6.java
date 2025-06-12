//palindrome

public class aa6 {
    public static void main(String[] args) {
        int a[] = {10,20,30}
        for(int i=0;i<=a.length-1;i++){
            if(isPalindrome(a[i])){
                System.out.println();
            }
        }
    }

    static boolean isPalindrome(int n){
        int rev=0;

        while(n>0){
            int rem = n%10;
            rev= rev*10+rem;
            n=n/10;

        }
        if(rev==temp){
            return true;
        }
    }
}

