// prime or not

public class aa5 {
    public static void main(String[] args) {
        int a[]={10,15,17,20};

        for(int i=0;i<=a.length-1;i++){
            if(isPrime(n==true)){
                System.out.println("prime");
            }else{
                System.out.println("not a prime");
            }
        }
        
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
    }
}
                
 
