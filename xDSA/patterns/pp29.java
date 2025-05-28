import java.util.Scanner;

public class pp29 {
    static void pattern(int n){
       
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || j==1 || i==n || j==n && i>=n/2+1 || i==n/2+1 && j>=n/2+1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number");
    int n= sc.nextInt();
    System.out.println("the op is : "+ pattern(n));
    }
   
}

// ---op---

// * * * * * 
// *
// *   * * *
// *       *
// * * * * *
