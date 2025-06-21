import java.util.Arrays;

public class zigzag{
    public static void main(String[] args) {
        int a[]={10,20,30};
        int b[]={100,200,300,400,59};

        int d[]=ZigZag(a, b);
        System.out.println(Arrays.toString(d));

    }
    static int[] ZigZag(int a[],int b[]){
        int c[]= new int[a.length+b.length];

        int i=0,j=0,k=0;

        while(i<=a.length-1 && j<=b.length-1){
            c[k]=a[i];
            k++;i++;

            c[k]=b[j];
            k++;j++;
        }
        while(i<=a.length-1){
            c[k]=a[i];
            k++;i++;
        }
         while(j<=b.length-1){
            c[k]=b[j];
            k++;j++;
         }
         return c;
    }
    
}