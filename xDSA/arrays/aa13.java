//WAP to print most repeated element in an array

public class aa13 {
    public static void main(String[] args) {
        int a[]={10,20,10,20,30,40,50,50,20};
        boolean b[]= new boolean[a.length];
        int max=0;
        int mostRep=0;


        for(int i=0;i<=a.length-1;i++){
            if(b[i]==false){
                int count=1;

                for(int j=i+1;j<=a.length-1;j++){
                    if(a[i]==a[j]){
                        count++;
                        b[j]=true;
                    }
                }
                if(count>max){
                    max=count;
                    mostRep=a[i];
                }
            }
        }
        System.out.println(mostRep);

    }
}
