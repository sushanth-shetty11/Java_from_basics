//WAP to find smallest element in an array

public class aa3 {
    public static void main(String[] args) {
        int a[]= {5,10,2,20};
        int smallest = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println(smallest);
    }
}

// INPUT  = {5,10,2,20}
// OUTPUT = 2
