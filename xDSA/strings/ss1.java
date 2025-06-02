// public class ss1 {
//  public static void main(String[] args) {
//         String str ="who are you";
//         StringBuilder sb = new StringBuilder(str);
//         sb.reverse();
//         System.out.println(sb.toString());
//     }   
// }

public class ss1{
    public static void main(String[] args) {
        String str = "who are you";
        char[] ch = str.toCharArray();
      
        int i=0, j=ch.length-1;

        while(i<j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j++;
        }
          System.out.println(ch);
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




