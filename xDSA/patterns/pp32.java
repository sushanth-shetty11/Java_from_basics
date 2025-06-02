public class pp32 {
        public static void main(String[] args) {
        int n=3;
        UpperHalf(n);
        lowerHalf(n);
}
static void UpperHalf(int n){
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
static void lowerHalf(int n){
    for(int i=n-1;i>=1;i--){
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


// public class pp32{
//     public static void main(String[] args) {
//         int n=5;
//         int sp=n/2;
//         int st=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=sp;j++){
//                 System.out.print("  ");
//             }
//             for(int k=1;k<=st;k++){
//                 System.out.print("* ");
//             }
//             if(i<=n/2){
//                 sp--;
//                 st+=2;
//             }
//             else{
//                 sp++;
//                 st-=2;
//             }
//             System.out.println();
//         }
//     }
// }


// ---op---

//         * 
//       * * *
//     * * * * *
//   * * * * * * *
// * * * * * * * * *
//   * * * * * * *
//     * * * * *
//       * * *
//         *