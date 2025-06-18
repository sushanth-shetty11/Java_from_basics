import java.util.Arrays;

public class merge {
    public static void main(String[] args) {
        int a[]= {10,20,30};
        int b[]={50,60,70,80};

        int c[]=mergeArray(a, b);
        System.err.println(Arrays.toString(c));

    }
    static int[] mergeArray(int a[],int b[]){
        int c[]= new int [a.length+b.length];

        for(int i=0;i<=a.length-1;i++){
            c[i]=a[i];
        }
        for(int i=0;i<=b.length-1;i++){
            c[a.length+i]=b[i];
        }
        return c;
    }
}
