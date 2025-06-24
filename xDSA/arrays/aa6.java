//WAP to reverse an array in optimal way

import java.util.Arrays;

public class aa6 {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        a=reverse(a);
        System.out.println(Arrays.toString(a));
    }
    static int[] reverse(int a[]){
        int i=0,j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;j--;
        }
        return a;
    }
}

//OUTPUT = {40,30,20,10}
