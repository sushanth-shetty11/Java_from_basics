//WAP to define a method to check the given number is strong number or not.(Sum of factorial of each digits should be equal to original number)

public class n19 {
    public static void main(String[] args) {
        int n=145;
        if(isStrong(n)) {
            System.out.println("Strong number");
        }else{
            System.out.println("Not an Strong number");
        }
    }
    static int sumOfFact(int n){
        int sum=0;
        while(n>0){
           int rem=n%10;
           int fact=1;
           for(int i=1;i<=rem;i++){
            fact=fact*i;
           }
           sum+=fact;
           n=n/10;
        }
        return sum;
    }
    static boolean isStrong(int n){
      return sumOfFact(n)==n;
    }
}


//OUTPUT - Strong number