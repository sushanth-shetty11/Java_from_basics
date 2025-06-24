//WAP to check the given year is leap or not

public class n6 {
    public static void main(String[] args) {
        int year=2025;

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
    }
}
