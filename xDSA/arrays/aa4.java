// WAP t0 print all the prime elements in an array

public class aa4{
    public static void main(String[] args) {
        int a[] = {6,10,17,20,25,19};
        for(int i=0;i<=a.length-1;i++){
             if(isPrime(a[i])){
            System.out.println(a[i]);
        }
    }
  }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

// INPUT  = {6,10,17,20,25,19}
// OUTPUT = 17, 19

