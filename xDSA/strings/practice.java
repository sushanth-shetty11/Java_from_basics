public class practice {
    public static void main(String[] args) {
        int n=5;
        int count =0;
        int i=1;

        while(true){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            if(count==n)
            break;
            i++;
        }

            
}
    static boolean isPrime(int n){
        if(n<2){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
