//WAP to define method to implement linear search

public class aa17 {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        int target = 30;
        int index = linearSearch(target, a);

        if(index==-1){
            System.out.println("element not found");
        }else{
            System.out.println("element fount at index = "+ index);
        }     
    }
    static int linearSearch(int n,int a[]){
        for(int i=0;i<=a.length-1;i++){
            if(a[i]==n){
                return i;
            }
        }
        return -1;
    }   
}

//OUTPUT = element fount at index = 2