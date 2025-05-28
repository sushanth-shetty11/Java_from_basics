public class pp31 {
    public static void main(String[] args) {
         int n=5;
         for(int i=0;i<=n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=n-i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// ---op---

// * * * * * 
//   * * * *
//     * * *
//       * *
//         *