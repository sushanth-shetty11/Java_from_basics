//WAP to count how many odd digits are present in the number.

public class n13 {
    public static void main(String[] args) {
        int n=123456;
        int count=0;

        while(n>0){
            int rem=n%10;
            if(rem%2!=0){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
    
}


//OUTPUT - 3
