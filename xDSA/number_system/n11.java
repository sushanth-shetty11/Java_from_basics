// WAP to print the sum of digits present in the number.

public class n11 {
    public static void main(String[] args){
        int n=218;
        int sum=0;

        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println(sum);
    }
}


//OUTPUT = 11
