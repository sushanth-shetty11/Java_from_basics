//WAP to print even numbers in an array

public class aa1 {
    public static void main(String[] args) {
        int[] a = {5,10,15,20};
        for(int i=0; i<=a.length-1;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
    
}


// INPUT  = {5,10,15,20}
// OUTPUT = 10, 20