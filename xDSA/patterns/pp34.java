public class pp34 {
    public static void main(String[] args) {
        int n=5;
        
    for(int i=1;i<=n;i++){
        char ch= 'A';
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }
    for(int i=n-1;i>=1;i--){
        char ch= 'A';
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }
  }
}

// ---op---

//         A 
//       A B C
//     A B C D E
//   A B C D E F G
// A B C D E F G H I
//   A B C D E F G 
//     A B C D E
//       A B C
//         A