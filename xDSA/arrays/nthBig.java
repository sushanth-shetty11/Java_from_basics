import java.util.Arrays;
import java.util.HashSet;

public class nthBig {
        public static void main(String[] args) {
            int n=1;
            int a[]={10,20,30,20,10};

            int b[]= removeDup(a);

            Arrays.sort(b);

            if(n<=b.length){
                System.out.println(b[b.length-n]);
            }else{
                System.out.println("not present");
            }
    }
    static int[] removeDup(int a[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<=a.length-1;i++){
            hs.add(a[i]);
        }

        int b[]= new int[hs.size()];
        int in=0;

        for(int ele:hs){
            b[in] = ele;
            ele++;
        }
        return b;

    }
}
