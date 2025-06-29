//WAP to print the sum of all the odd numbers present between 1 to 50

public class n8 {
    public static void main(String[] args) {
        int n=50;
        int sum=0;
        System.out.print("odd numbers from 1 to 50 = ");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum = sum+i;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("the total sum is = "+sum);
    }
}


//OUTPUT = odd numbers from 1 to 50 = 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 
//         the total sum is = 625