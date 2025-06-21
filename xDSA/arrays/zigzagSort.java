import java.util.Arrays;

public class zigzagSort{
    public static void main(String[] args) {
        int a[]={1,5,10};
        int b[]={2,4,12,15};

        int d[]=ZigZag(a, b);
       // Arrays.sort(d);
        System.out.println(Arrays.toString(d));

    }
    static int[] ZigZag(int a[],int b[]){
        int c[]= new int[a.length+b.length];

        int i=0,j=0,k=0;

        while(i<=a.length-1 && j<=b.length-1){
           if(a[i]<b[j]){
            c[k]=a[i];
            k++;i++;
           } 
           else{
             c[k]=b[j];
            k++;j++;
           }
           
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