public class aa4 {
    public static void main(String[] args) {
        int a[] = {4,1,3,8,10};
        int big= a[0];
        int small = a[0];

        for(int i=1;i<=a.length-1;i++){
            if(a[i]>big){
                big=a[i];
            }
            if(a[i]<small){
                small=a[i];
            }
        }
        for(int i=small+1; i<=big-1;i++){
            if(isMissing(i,a))
            System.out.println(i);
        }
    }
    static boolean isMissing(int n,int[] a){
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==n)
            return false;
        }
        return true;
    }
}
