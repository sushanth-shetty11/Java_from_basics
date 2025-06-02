// public class ss2 {

//      static boolean isPalindrome(String str){
         
//         StringBuffer sb = new StringBuffer(str);
//         String rev= sb.reverse().toString();
//         return str.equals(rev);
            
//         }
//     public static void main(String[] args) {
//        String str = "abcbag";
//        if(isPalindrome(str)){
//         System.out.println("palindrome");
//        }
//        else{
//         System.out.println("not a palindrome");
//        }
       
//     }
    
// }

public class ss2{
    public static void main(String[] args) {
        String str= "abca";
        if(isPalindrome(str)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }

    static boolean isPalindrome(String str){
        int i=0, j=str.length()-1;
        while(i<j){
            // if(str.charAt(i)==str.charAt(j))
            //     return true;
            //     i++;j--;
        }
        return false;
    }
}
