//WAP to count how many palindrome elements are there in an array

public class aa5 {
    public static void main(String[] args) {
        int a[] = {45,121,34,88,22,66,77};
        int count=0;

        for(int i=0;i<=a.length-1;i++){
            if(isPalindrome(a[i])){
               count++;
            }
        }
         System.out.println(count);
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

//OUTPUT = 5