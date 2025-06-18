//palindrome

// public class aa5 {
//     public static void main(String[] args) {
//         int a[] = {10,20,30,99,44};
//         int count=0;

//         for(int i=0;i<=a.length-1;i++){
//             if(isPalindrome(a[i])){
//                count++;
//             }
//             System.out.println(count);
//         }
//     }

//     static boolean isPalindrome(int n){
//         int rev=0;
//         int temp=n;

//         while(n>0){
//             int rem = n%10;
//             rev= rev*10+rem;
//             n=n/10;

//         }
//        return rev==temp;
//     }
// }

public class aa5{
    public static void main(String[] args) {
        int a[]={101,20,30,40};
        
        for(int i=0;i<=a.length-1;i++){
            int count=0;
           if(isPalindrome(a[i])){
            count++;
           }else{
            System.out.println("not");
           }
           System.out.println(count);
        }

    }
    static boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
        
        while(n>0){
            int num= n%10;
            rev=rev*10+num;
            n=n/10;

        }
        return  rev==temp;
    }
}