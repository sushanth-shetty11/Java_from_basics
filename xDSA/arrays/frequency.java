public class frequency {
    public static void main(String[] args) {
        int a[]={10,20,10,30};
        boolean b[]=new boolean[a.length];
        freq(a,b);

    }
    static void freq(int a[],boolean b[]){
        for(int i=0;i<=a.length-1;i++){
            if (b[i]==false){
                int count=1;
    
            for(int j=i+1;j<=a.length-1;j++){
                if(a[i]==a[j]){
                    count++;
                    b[j]=true;
                }
            }
            System.out.println(a[i]+" = "+count);
        }
    }
    }
    
}

//wap to print duplicate elements in an array
//wap to print first duplicated element present in the array
//wap to print first 3 unique elements present in the array
//wap to print nth duplicated element present in the array
//wap to print the element which is most repeated in the array
