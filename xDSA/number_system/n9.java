//WAP to print all the factors or divisors for the given number.

public class n9 {
    public static void main(String[] args) {
        int n=20;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}


//OUTPUT - 1
//         2
//         4
//         5
//         10