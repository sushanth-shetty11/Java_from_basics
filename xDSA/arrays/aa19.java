//sort the array in descending order;

import java.util.Arrays;

public class aa19 {
    public static void main(String[] args) {
        int a[]={4,2,3,1};

        for(int i=0;i<=a.length-1;i++){
            for(int j=i+1;j<=a.length-1;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("after sorting in ascending order");
        System.out.println(Arrays.toString(a));
    }
}


//OUTPUT = [4, 3, 2, 1]