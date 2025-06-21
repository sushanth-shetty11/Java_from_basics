public class linearSearch {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int target = 80;
        
        int index = linear(target,a);

        if(index==-1){
            System.out.println("ele not found");
        }else{
            System.out.println("ele found at index="+i);
        }
    }
    static int linear(int target,int a[]){
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==target)
                return i;
            }
             return -1;
        }
}

