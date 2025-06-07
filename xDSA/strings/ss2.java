// To check a given String is Palindrome or not


public class ss2 {

     static boolean isPalindrome(String str){
         
        StringBuffer sb = new StringBuffer(str);
        String rev= sb.reverse().toString();
        return str.equals(rev);
            
        }
    public static void main(String[] args) {
       String str = "abcba";
       if(isPalindrome(str)){
        System.out.println("palindrome");
       }
       else{
        System.out.println("not a palindrome");
       }
       
    }
    
}

// ---or---

// public class ss2{
//     public static void main(String[] args) {
//         String str= "abcab";
//         if(isPalindrome(str)){
//             System.out.println("palindrome");
//         }
//         else{
//             System.out.println("not a palindrome");
//         }

//     }

//     static boolean isPalindrome(String str){
//         int i=0, j=str.length()-1;
//         while(i<j){
//             if(str.charAt(i)==str.charAt(j))
//                 return false;
//                 i++;j--;
//         }
//         return true;
//     }
// }


// INPUT  - abcba
// OUTPUT - palindrome

// INPUT  - abcbag
// OUTPUT - not a palindrome