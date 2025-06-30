//WAP to define a method to find N^P.

public class n17 {
    public static void main(String[] args) {
        int num=3;
        int p=3;
        isPower(num, p);
        
    }
    static void isPower(int num,int p){
        int result=1;
        for(int i=1;i<=p;i++){
           result*=num;
        }
        System.out.println(result);
    }
}


//OUTPUT - 27
