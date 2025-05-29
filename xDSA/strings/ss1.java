public class ss1 {
 public static void main(String[] args) {
        String str ="who are you";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }   
}

// ---or---

// public class ss1 {
//     public static void main(String[] args) {
//         String str = "who are you";
//         String rev = "";
//         for(int i=str.length()-1;i>=0;i--){
//             char ch = str.charAt(i);
//             rev+=ch;
//         }
//         System.out.println(rev);
//     }
// }



// INPUT - who are you

// OUTPUT - uoy era ohw




