public class pp22 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            char c='a';
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print(c+" ");
                 c++;
             }
            System.out.println();   
        }
    }
}


// ---op---

//         a 
//       a b c
//     a b c d e
//   a b c d e f g
// a b c d e f g h i