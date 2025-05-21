class pp9
{
    public static void main(String[] args) {
      int n=5;
      char c='A';
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            System.out.print(c+" ");
        }
        System.out.println();
        c++;
      }  
    }
}

// ---------or---------

// public class pp9 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {  
//                 System.out.print((char)(i + 64) + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// ---op---

// A A A A A 
// B B B B B
// C C C C C
// D D D D D
// E E E E E