public class pp18 {
    public static void main(String[] args) {
        int n=5;
        int x=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}

// ---op---

//         1 
//       1 2
//     1 2 3
//   1 2 3 4
// 1 2 3 4 5
