//WAP to print duplicated element present in the array

public class aa9 {
    public static void main(String[] args) {
        int a[]={10,20,10,30,20};
        boolean b[]=new boolean[a.length];
        
        for(int i=0;i<=a.length-1;i++){
            if(b[i]==false){
                int count=1;

                for(int j=i+1;j<=a.length-1;j++){
                    if(a[i]==a[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if(count>1){
                     System.out.println(a[i]);
                 }
            }
        }
    }
}


// OUTPUT = 10
//          20