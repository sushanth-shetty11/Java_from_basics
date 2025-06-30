//WAP to define a method to check the given is neon number or not.

public class n18 {
    public static void main(String[] args) {
        int n=9;
        if(isNeon(n)){
            System.out.println("neon");
        }else{
            System.out.println("not a neon");
        }
    }
    static boolean isNeon(int n){
        int temp = n;
        int square=n*n;
        int rev=0;

        while(square>0){
            int rem= square%10;
            rev+=rem;
            square=square/10;
        }
    return temp==rev;
    }
}


//OUTPUT - neon