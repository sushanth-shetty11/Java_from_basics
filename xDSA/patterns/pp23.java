public class pp23 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                if(i%2==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print(k+" ");
                }
            }
            System.out.println();
        }
    }
}


// ---op---

//         * 
//       1 2 3
//     * * * * *
//   1 2 3 4 5 6 7
// * * * * * * * * *