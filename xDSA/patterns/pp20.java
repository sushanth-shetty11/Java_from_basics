public class pp20{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//----or----

// public class pp20 {
//     public static void main(String[] args) {
//         int n=5;
//         int x=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("  ");
//             }

//             for(int k=1;k<=x;k++){
//                 System.out.print("* ");   
                
//             }
//             System.out.println();
//             x=x+2;
//         }
//     }
// }


// ---op---

//         *
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *