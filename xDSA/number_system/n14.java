//WAP to define a method to find the factorial of the given number.

public class n14 {
    public static void main(String[] args) {
        int n=3;
        factorial(n);

    }   
    static void factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    } 
}

//OUTPUT - 6
