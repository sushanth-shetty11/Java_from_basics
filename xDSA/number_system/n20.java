//WAP to print all the prime numbers present between 1 to 100

public class n20 {
    public static void main(String[] args) {
        for(int i=2;i<=100;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1)
            return false;
          for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
          }
        return true;
    }
}


//OUTPUT - 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 