public class pp35 {
    public static void main(String[] args) {
        int n=5;
        char ch= 'A';
        
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print(ch+" ");
           
        }
        System.out.println();
         ch++;
    }
    for(int i=n-1;i>=1;i--){
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print(ch+" ");
            
        }
        System.out.println();
        ch++;
    }
  }
}

// ---op---

//         A 
//       B B B
//     C C C C C
//   D D D D D D D
// E E E E E E E E E
//   F F F F F F F
//     G G G G G
//       H H H
//         I