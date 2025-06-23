//WAP to find the smallest number among three number using if statement only 

public class n2 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=2;

        int small = a;

        if(b<small)
        small=b;
        if(c<small)
        small=c;

        System.out.println(small);
    }
}


//OUTPUT = 2