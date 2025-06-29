// WAP to print the sum of even digits present in the number.

public class n12 {
    public static void main(String[] args) {
        int n=2344;
        int sum=0;

        while(n>0){
            int rem = n%10;
            if(rem%2==0){
                sum+=rem;
            }
            n=n/10;
           
        }
        System.out.println(sum);
    }
    
}


//OUTPUT - 10
