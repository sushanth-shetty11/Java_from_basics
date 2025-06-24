//WAP to print sanju if the number is divisible by 3, print sanju weds geeta if the number is divisible by both 3 and 5 otherwise breakup

public class n5 {
    public static void main(String[] args) {
        int n=30;
        if(n%3==0 && n%5==0){
            System.out.println("    ");
        }
        else if(n%3==0){
            System.out.println("sanju ");
        }else{
            System.out.println("breakup");
        }
    }
}

//OUTPUT = sanju weds geeta