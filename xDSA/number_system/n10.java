//WAP to define a method to check the given number is perfect number or not.

import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        isPerfect(n);
        sc.close();
    }
    static void isPerfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum){
            System.out.println("perfect number");
        }else{
            System.out.println("Not a perfect number");
        }
    }
}


//OUTPUT - perfect number