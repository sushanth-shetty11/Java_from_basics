//WAP to print nth duplicated element present in the array

public class aa11 {
    public static void main(String[] args) {
        int a[]={10,20,10,20,30,40,30};
        boolean b[]=new boolean[a.length];
        int n=3;
        int dupCount=0;

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
                    System.out.println("duplicated elements = "+a[i]);
                    dupCount++;

                    if(dupCount==n){
                        System.out.println("the "+ n +" element is "+a[i]);
                    }
                }
            }
        }
    }
}


// OUTPUT = duplicated elements = 10
//          duplicated elements = 20
//          duplicated elements = 30
//          the 3 element is 30