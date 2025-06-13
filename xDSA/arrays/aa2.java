//WAP to find largest element in an array

public class aa2 {
    public static void main(String[] args) {
        int a[] = {5,10,20,15};
        int largest = a[0];
        for(int i=1; i<=a.length-1;i++)
        {
            if(a[i]>largest){
                largest=a[i];
        }
    }
        System.out.println(largest);
    }
}


// INPUT  = {5,10,20,15}
// OUTPUT = 20