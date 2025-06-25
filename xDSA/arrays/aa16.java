//WAP to print missing elements in an array

public class aa16 {
    public static void main(String[] args) {
        int a[]={5,1,3,8};
        int small=a[0];
        int big=a[0];

        for(int i=1;i<=a.length-1;i++){
            if(a[i]<small){
                small=a[i];
            }
            if(a[i]>big){
                big=a[i];
            }
        }
        for(int i=small+1;i<=big-1;i++){
            if(isMissing(i,a)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isMissing(int n,int[] a){
            for(int i=0;i<=a.length-1;i++){
                if(a[i]==n){
                    return false;
                }
            }
            return true;
        }
}

// OUTPUT = 2 4 6 7 


